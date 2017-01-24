package test;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import model.DslamGpon;
import model.dao.DadosDslamDAO;

public class testSoap {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException, IOException, InterruptedException {

//                String instancia = "1630105408"; //Alcatel
                
                String instancia = "1633226955"; //Zhone
		
                
                //de onde tirar as 'velocidadesCrm'?
                
                DadosDslamDAO dao = new DadosDslamDAO();
                DslamGpon meuDslam = dao.montaDslamGpon(instancia);
                
                System.out.println("Tecnologia: "+ meuDslam.getTecnologia());
                System.out.println("Vendor: "+ meuDslam.getVendor());
                System.out.println("Modelo: "+ meuDslam.getModelo());
                System.out.println("Ip: "+ meuDslam.getIpDslam());
                System.out.println("Slot: "+ meuDslam.getSlot());
                System.out.println("Porta: "+ meuDslam.getPorta());
                System.out.println("Lógica: "+ meuDslam.getLogica());
                System.out.println("Sequencial: "+ meuDslam.getSequencial());
                
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
                
                
//                //Alcatel
//                out.println("co");
//                out.println("#operco33");
//                out.println("show equipment ont interface 1/1/"+meuDslam.getSlot()+"/"+meuDslam.getPorta()+"/"+meuDslam.getLogica()+" detail xml");
//                Thread.sleep(1000);
//                out.println("||");
                
                //Zhone
                Thread.sleep(5000);
                out.println("admin");
                Thread.sleep(3000);
                out.println("zhone");
                Thread.sleep(3000);
                out.println("onu status "+meuDslam.getSlot()+"/"+meuDslam.getPorta()+"/"+meuDslam.getLogica());
                Thread.sleep(3000);
                out.println("||");
                for (int i = 0; i < 999; i++) {
			
			String line = in.readLine();
			
                        System.out.println(line);
			
			if (line.contains("||")) {
				break;
			}

		}
                out.close();
                in.close();
                pingSocket.close();
                
                
	}
        
}
