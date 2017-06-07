/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.retorno;

import dao.dslam.impl.ComandoDslam;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author G0042204
 */
public class TratativaRetornoUtil {

    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
            return doc;
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Document stringXmlParse(ComandoDslam cd) {
        Integer xmlBegins = cd.getBlob().indexOf(cd.getSintax()) + cd.getSintax().length();
        return convertStringToDocument(cd.getBlob().substring(xmlBegins));
    }

    public static String getXmlParam(Document xml, String query) {
        try {
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            XPathExpression expr = xpath.compile(query);
            return (String) expr.evaluate(xml, XPathConstants.STRING);
        } catch (XPathExpressionException ex) {
            return null;
        }

    }
    
    public static List<String> tratZhone(List<String> list, String qqqro, String regex, Integer o){
        Integer i = 1;
        for (String leLine : list) {
            if(leLine.contains(qqqro)){
                if(i.equals(o)){
                    List<String> allMatches = new ArrayList<String>();
                    Matcher m = Pattern.compile(regex).matcher(leLine);
                    while (m.find()) {
                        allMatches.add(m.group());
                    }
                    return allMatches;
                }
                i++;
            }
        }
        
        return null;
    }
//    /-?\\.?(\\d+((\\.|,| )\\d+)?)
    
    public static List<String> numberFromString(String str){
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("-?\\.?(\\d+((\\.|,| )\\d+)?)").matcher(str);
        while (m.find()) {
            allMatches.add(m.group());
        }
        
        return allMatches;
    }
    
    public static List<String> tratZhone(List<String> list, String qqqro,String regex){
        return tratZhone(list, qqqro, regex, 1);
    }
    
    public static String tratKeymile(List<String> list, String qqqro, Integer o){
        Integer i = 1;
        for (String leLine : list) {
            if(leLine.contains(qqqro)){
                if(i.equals(o)){
                    return leLine.substring(0, leLine.indexOf("\\ #")).replace("\"", "").replace(";", "").trim();    
                }
                i++;
            }
            
        }
        
        return "Parâmetro não encontrado "+qqqro;
    }

    public static String tratKeymile(List<String> list, String qqqro){
        return tratKeymile(list, qqqro, 1);
    }
    
    public static String upProfileNameKeymile(Integer profIndex){
        
        String prf = "";
        
        switch(profIndex){
            case 2:
                prf = "HSI_750K_RETAIL_UP";
                break;
            case 3:
                prf = "HSI_1M_RETAIL_UP";
                break;
            case 4:
                prf = "HSI_2M_RETAIL_UP";
                break;
            case 5:
                prf = "HSI_3M_RETAIL_UP";
                break;
            case 6:
                prf = "HSI_5M_RETAIL_UP";
                break;
            case 7:
                prf = "HSI_10M_RETAIL_UP";
                break;
            case 8:
                prf = "HSI_15M_RETAIL_UP";
                break;
            case 9:
                prf = "HSI_50M_RETAIL_UP";
                break;
            case 10:
                prf = "HSI_75M_RETAIL_UP";
                break;
            case 11:
                prf = "HSI_100M_RETAIL_UP";
                break;
            case 12:
                prf = "HSI_150M_RETAIL_UP";
                break;
            case 13:
                prf = "HSI_12.5M_RETAIL_UP";
                break;
            case 14:
                prf = "HSI_25M_RETAIL_UP";
                break;
            default:
                break;
        }
        
        return prf;
    }

}
