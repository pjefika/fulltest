/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.retorno;

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
import model.dslam.velocidade.Velocidades;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author G0042204
 */
public class TratativaRetornoUtil {

    private static Document convertStringToDocument(String xmlStr) {
        System.out.println(xmlStr);
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
        Integer xmlEnds = cd.getBlob().lastIndexOf('>') + 1;
        return convertStringToDocument(cd.getBlob().substring(xmlBegins, xmlEnds));
    }

    public static Document stringXmlConfigData(ComandoDslam cd) {
        Integer xmlBegins = cd.getBlob().indexOf(cd.getSintax()) + cd.getSintax().length();
        String search = "</configuration-data>";
//        Integer xmlEnd = cd.getBlob().indexOf(search) + search.length();
        Integer xmlEnd = cd.getBlob().lastIndexOf('>') + 1;
        return convertStringToDocument(cd.getBlob().substring(xmlBegins, xmlEnd));
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

    public static List<String> linhasAbaixo(List<String> list, String qqqro) {
        List<String> leList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(qqqro)) {
                try {
                    leList.add(list.get(i + 2));
                } catch (Exception e) {
                    leList.add(list.get(i + 1));
                }

            }
        }
        return leList;
    }

    public static List<String> tratZhone(List<String> list, String qqqro, String regex, Integer o) {
        Integer i = 1;
        for (String leLine : list) {
            if (leLine.contains(qqqro)) {
                if (i.equals(o)) {
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

    public static List<String> numberFromString(String str) {
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("-?\\.?(\\d+((\\.|,| )\\d+)?)").matcher(str);
        while (m.find()) {
            allMatches.add(m.group());
        }

        return allMatches;
    }

    public static List<String> tratZhone(List<String> list, String qqqro, String regex) {
        return tratZhone(list, qqqro, regex, 1);
    }

    public static String tratKeymile(List<String> list, String qqqro, Integer o) {
        Integer i = 1;
        for (String leLine : list) {
            if (leLine.contains(qqqro)) {
                if (i.equals(o)) {
                    return leLine.substring(0, leLine.indexOf("\\ #")).replace("\"", "").replace(";", "").trim();
                }
                i++;
            }

        }

        return "Parâmetro não encontrado " + qqqro;
    }

    public static String tratKeymile(List<String> list, String qqqro) {
        return tratKeymile(list, qqqro, 1);
    }
    
    public static List<String> listaSlotsKeymile(List<String> retornoDslam, String tipoSlot){
        List<String> leList = new ArrayList<>();
        retornoDslam.forEach((t) -> {
            if (t.contains(tipoSlot)) {
                Matcher line = Pattern.compile("\\d+").matcher(t);
                List<String> l = new ArrayList<>();
                while(line.find()){
                    l.add(line.group());
                }
                leList.add(l.get(0));
            }
        });
        return leList;
    }

    public static Integer countStringOccurrence(List<String> list, String qqqro) {
        Integer count = 0;
        for (String string : list) {
            if (string.contains(qqqro)) {
                count++;
            }
        }
        return count;
    }

    public static String upProfileNameKeymileGpon(Integer profIndex) {

        String prf = "";

        switch (profIndex) {
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

    public static String upProfileIdKeymileGpon(String profName) {

        Integer prfIndex = null;

        switch (profName) {
            case "HSI_750K_RETAIL_UP":
                prfIndex = 2;
                break;
            case "HSI_1M_RETAIL_UP":
                prfIndex = 3;
                break;
            case "HSI_2M_RETAIL_UP":
                prfIndex = 4;
                break;
            case "HSI_3M_RETAIL_UP":
                prfIndex = 5;
                break;
            case "HSI_5M_RETAIL_UP":
                prfIndex = 6;
                break;
            case "HSI_10M_RETAIL_UP":
                prfIndex = 7;
                break;
            case "HSI_15M_RETAIL_UP":
                prfIndex = 8;
                break;
            case "HSI_50M_RETAIL_UP":
                prfIndex = 9;
                break;
            case "HSI_75M_RETAIL_UP":
                prfIndex = 10;
                break;
            case "HSI_100M_RETAIL_UP":
                prfIndex = 11;
                break;
            case "HSI_150M_RETAIL_UP":
                prfIndex = 12;
                break;
            case "HSI_12.5M_RETAIL_UP":
                prfIndex = 13;
                break;
            case "HSI_25M_RETAIL_UP":
                prfIndex = 14;
                break;
            default:
                prfIndex = 12;
                break;
        }

        return prfIndex.toString();
    }

    public static List<Double> velocidadeMinima(Velocidades v) {
        List<Double> l = new ArrayList<>();
        switch (v.getVel()) {
            case "3":
                l.add(3072d);
                l.add(750d);
                l.add(21000d);
                l.add(1100d);

                break;
            case "5":
                l.add(5120d);
                l.add(750d);
                l.add(21000d);
                l.add(1100d);
                break;
            case "10":
                l.add(11742d);
                l.add(1024d);
                l.add(21000d);
                l.add(1100d);
                break;
            case "15":
                l.add(17503d);
                l.add(1024d);
                l.add(21000d);
                l.add(1100d);
                break;
            case "25":
                l.add(26680d);
                l.add(2344d);
                l.add(115000d);
                l.add(49000d);
                break;
            case "35":
                l.add(37000d);
                l.add(3600d);
                l.add(115000d);
                l.add(49000d);
                break;
            case "50":
                l.add(51200d);
                l.add(5120d);
                l.add(115000d);
                l.add(49000d);
                break;
            default:
                break;
        }
        return l;

    }

}
