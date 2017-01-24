package test;

import java.rmi.RemoteException;

import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import model.DslamGpon;
import dao.DadosDslamDAO;





public class testSoapKeymile {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException, IOException, InterruptedException {

                String instancia = "3131665067"; //milhoChave
                
                DadosDslamDAO dao = new DadosDslamDAO();
                DslamGpon meuDslam = dao.montaDslamGpon(instancia);
                
                Socket pingSocket = null;
                PrintWriter out = null;
                BufferedReader in = null;

                try {
                    pingSocket = new Socket(meuDslam.getIpDslam(), 23);
                    out = new PrintWriter(pingSocket.getOutputStream(), true);
                    in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
                } catch (IOException e) {
                    return;
                }

                String pegaSerial = "get /unit-" + meuDslam.getSlot() + "/odn-" + meuDslam.getPorta()+ "/ont-" + meuDslam.getLogica()+ "/cfgm/onuCfgTable";
                
                out.println("manager");
                out.println("");
                out.println(pegaSerial);
                Thread.sleep(1000);
                out.println("||");
                StringBuilder resp = new StringBuilder();
                for (int i = 0; i < 999; i++) {
			
			String line = in.readLine();

                        System.out.println(line);
                        if (line.contains("||")) {
				break;
			}
                        
                        resp.append(line);
		}
                
                out.close();
                in.close();
                pingSocket.close();
                
                String leResp = resp.toString();
                
               System.out.println(leResp);
	}
  
}
