/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.dslam.vivo2.gpon.alcatel.AlcatelGponDslam;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author G0042204
 */
public class testeAlcatel111 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {

        try {
//            AlcatelGponDslam dslam = new AlcatelGponDslam();
            //AbstractDslam dslam = new ZhoneGponDslam();

            // ZHONE
            //dslam.setIpDslam("10.171.21.86");
            /// ALCATEL
//            dslam.setIpDslam("10.131.10.77");
            
            Scanner s = new Scanner(new File("C:\\Users\\g0041775\\Documents\\logs wildfly\\hosts_new2.txt"));
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNextLine()){
                list.add(s.nextLine());
            }
            s.close();
            List<dslamRafael> lDslams = new ArrayList<dslamRafael>();
            for (String string : list) {
                String[] oi = string.split(" ");
                Integer tam = oi.length;
                String nome = oi[(tam-2)];
                String ip = oi[(tam-1)];
                lDslams.add(new dslamRafael(nome, ip));
            }
            s= null;
            
            for (dslamRafael lDslam : lDslams) {
                AlcatelGponDslam dslam = new AlcatelGponDslam();
                dslam.setIpDslam(lDslam.getIpDslam());
                
                Document xml = dslam.getDumpRafael();
                NodeList nodeList = xml.getElementsByTagName("instance");
            
                List<String> headz = new ArrayList<String>();
                headz.add("DSLAM NAME");
                Node first = nodeList.item(0);
                for (int o = 1; o < first.getChildNodes().getLength(); o++) {   
                    Node leNodezinforTitle = first.getChildNodes().item(o);
                    String nomeNode = leNodezinforTitle.getAttributes().getNamedItem("name").getTextContent().trim();
                    headz.add(nomeNode);
                    o++;
                }
                String head = headz.toString().replace(",", ";").replace("[", "").replace("]", "");
                FileWriter writer = new FileWriter("C:\\Users\\g0041775\\Documents\\logs wildfly\\"+lDslam.getNomeDslam()+".csv"); 
                writer.write(head+"\n");
                
                

                for (int i = 0; i < nodeList.getLength(); i++) {
                   Node node = nodeList.item(i);
                   List<String> valz = new ArrayList<String>();                
                   valz.add(lDslam.getNomeDslam());
                   for (int e = 1; e < node.getChildNodes().getLength(); e++) {   
                       Node leNode = node.getChildNodes().item(e);
                       String valNode = leNode.getTextContent().trim();


                       valz.add(valNode);

                   e++;    
                   }


                  String result = valz.toString().replace(",", ";").replace("[", "").replace("]", "");
                  writer.write(result+"\n");
                  result = null;
                  valz = null;
                  
                }
                writer.close();
                 writer = null;
                System.out.println("Done "+lDslam.getNomeDslam());
            }
            

            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class dslamRafael {

        
        String nomeDslam;
        String ipDslam;

        public String getNomeDslam() {
            return nomeDslam;
        }

        public void setNomeDslam(String nomeDslam) {
            this.nomeDslam = nomeDslam;
        }

        public String getIpDslam() {
            return ipDslam;
        }

        public void setIpDslam(String ipDslam) {
            this.ipDslam = ipDslam;
        }
        
        public dslamRafael(String nome, String ip) {
            this.setIpDslam(ip);
            this.setNomeDslam(nome);
        }
    }

}
