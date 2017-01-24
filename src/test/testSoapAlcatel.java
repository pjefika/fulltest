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
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;


public class testSoapAlcatel {

	public static void main(String[] args) throws DataNotFoundException, OSSTurbonetException, RemoteException, IOException, InterruptedException {

                String instancia = "1630105408"; //Alcatel
                
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
                
                String pegaSerial = "info configure equipment ont interface 1/1/"+meuDslam.getSlot()+"/"+meuDslam.getPorta()+"/"+meuDslam.getLogica()+" detail xml";
                
                out.println("co");
                out.println("#operco33");
                out.println(pegaSerial);
                Thread.sleep(1000);
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
                
                Integer xmlBegins = leResp.indexOf(pegaSerial) + pegaSerial.length();
                
                Document xml = convertStringToDocument(leResp.substring(xmlBegins));
                String leXpathDesired = "//parameter[@name='sernum']";
                
            try {    
                XPathFactory xpathFactory = XPathFactory.newInstance();
                XPath xpath = xpathFactory.newXPath();
                XPathExpression expr = xpath.compile(leXpathDesired);
                String result = (String) expr.evaluate(xml, XPathConstants.STRING);
                
                System.out.println(result);
                
            } catch (XPathExpressionException ex) {
                Logger.getLogger(testSoapAlcatel.class.getName()).log(Level.SEVERE, null, ex);
                
            }
	}
        
        
    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        try  
        {  
            builder = factory.newDocumentBuilder();  
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) ); 
            return doc;
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return null;
    }
}
