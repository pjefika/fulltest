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





public class testSoapZhone {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException, IOException, InterruptedException {

                String instancia = "1633226955"; //Zhone
                
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

                Thread.sleep(5000);
                out.println("admin");
                Thread.sleep(3000);
                out.println("zhone");
                Thread.sleep(3000);
                out.println("onu status "+meuDslam.getSlot()+"/"+meuDslam.getPorta()+"/"+meuDslam.getLogica());
                Thread.sleep(3000);
                out.println("||");
                StringBuilder resp = new StringBuilder();
                for (int i = 0; i < 999; i++) {
			
			String line = in.readLine();

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
