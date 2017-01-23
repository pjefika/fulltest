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
import java.math.BigInteger;
import java.net.Socket;

public class testSoap {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException, IOException, InterruptedException {
		OSSTurbonetProxy ws = new OSSTurbonetProxy();
                String instancia = "1630105408"; //Alcatel
                
//                String instancia = "1633226955"; //Zhone
		String designator = ws.getDesignatorByAccessDesignator(instancia);
                String accessDesignator = ws.getAccessDesignator(designator);
                
                //de onde tirar as 'velocidadesCrm'?
                
                GetInfoOut leInfo = ws.getInfo(designator, accessDesignator, "ura", "ura", instancia, "ura", "25600", "12800");
                
                BigInteger port = leInfo.getInfoTBS().getPortNumber();
                String vendor = leInfo.getInfoTBS().getDslamModel();
                String modelo = leInfo.getInfoTBS().getDslamVendor();
                String ipDslam = leInfo.getInfoTBS().getIpDslam();
                BigInteger slot = leInfo.getInfoTBS().getSlot();
                BigInteger logica = leInfo.getInfoTBS().getPortAddrSequence();
                BigInteger portseq = leInfo.getInfoTBS().getPortAddrSeq();
                String tecnologia = leInfo.getTechnology();
                
                System.out.println("Tecnologia: "+ tecnologia);
                System.out.println("Vendor: "+ vendor);
                System.out.println("Modelo: "+ modelo);
                System.out.println("Ip: "+ ipDslam);
                System.out.println("Slot: "+ slot);
                System.out.println("Porta: "+ port);
                System.out.println("Lógica: "+ logica);
                System.out.println("Sequencial: "+ portseq);
                
                Socket pingSocket = null;
                PrintWriter out = null;
                BufferedReader in = null;

                try {
                    pingSocket = new Socket(ipDslam, 23);
                    out = new PrintWriter(pingSocket.getOutputStream(), true);
                    in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
                } catch (IOException e) {
                    return;
                }
                
                
                //Alcatel
                out.println("co");
                out.println("#operco33");
                out.println("show equipment ont interface 1/1/"+slot+"/"+port+"/"+logica+" detail xml");
                Thread.sleep(1000);
                out.println("||");
                
                //Zhone
//                Thread.sleep(3000);
//                out.println("admin");
//                Thread.sleep(3000);
//                out.println("zhone");
//                Thread.sleep(3000);
//                out.println("onu status "+slot+"/"+port+"/"+logica);
//                Thread.sleep(5000);
//                out.println("||");
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
