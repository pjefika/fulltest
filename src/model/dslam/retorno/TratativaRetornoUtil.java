/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.retorno;

import dao.dslam.telnet.ComandoDslam;
import java.io.IOException;
import java.io.StringReader;
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

}
