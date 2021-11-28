package hu.domparse.VU2RVC;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DOMModifyVU2RVC {

	public static final String xmlFilePath = "G:\\XML\\Beadando\\beadando\\XMLVU2RVC.xml";
	 
    public static void main(String argv[]) {
 
        try {
        	
        	//document builder
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
 
            Document document = documentBuilder.parse(xmlFilePath);
 
            // Get bizonyitvany by tag name
            //getting the third bizonyitvany
            Node bizonyitvany = document.getElementsByTagName("bizonyitvany").item(2);
 
            // update bizonyitvany elements id
            NamedNodeMap attribute = bizonyitvany.getAttributes();
            Node nodeAttr = attribute.getNamedItem("id");
            nodeAttr.setTextContent("03");
 
            // append a new node to the first bizonyitvany
            Element succes = document.createElement("atment");
 
            succes.appendChild(document.createTextNode("igen"));
 
            bizonyitvany.appendChild(succes);
 
            // loop the bizonyitvany node and update salary value, and delete a node
            NodeList nodes = bizonyitvany.getChildNodes();
 
            for (int i = 0; i < nodes.getLength(); i++) {
 
                Node element = nodes.item(i);
 
                if ("szint".equals(element.getNodeName())) {
                    element.setTextContent("közép");
                }
 
                // remove the succes element
                if ("atment".equals(element.getNodeName())) {
                    bizonyitvany.removeChild(element);
                }
 
            }
 
            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
 
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
 
            System.out.println("The XML File was modified");
 
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
    }

}
