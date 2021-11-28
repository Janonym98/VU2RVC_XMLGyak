package hu.domparse.VU2RVC;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomReadVU2RVC {

	public static void main(String[] args){
		 
	      try {
	         File inputFile = new File("G:\\�d�m\\Egyetem\\XML\\Beadando\\beadando\\XMLVU2RVC.xml");
	         
	         //document Builder
	         DocumentBuilderFactory dbFactory 
	            = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :"
	            + doc.getDocumentElement().getNodeName());
	         
	         //tanul�
	         NodeList nList = doc.getElementsByTagName("tanulo");
	         System.out.println("----------------------------");
	         
	         //List every data from the tanulo element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("Vezet�kn�v : "
	                  + eElement
	                  .getElementsByTagName("vezeteknev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Ut�n�v: "
	               + eElement
	                  .getElementsByTagName("utonev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Sz�let�si �v: "
	               + eElement
	                  .getElementsByTagName("szuletesi_ev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Lakhely: "
	    	               + eElement
	    	                  .getElementsByTagName("lakhely")
	    	                  .item(0)
	    	                  .getTextContent());
	               System.out.println("Iskola: "
	    	               + eElement
	    	                  .getElementsByTagName("iskola")
	    	                  .item(0)
	    	                  .getTextContent());
	            }
	         }
	         //sz�beli �retts�gi
	         nList = doc.getElementsByTagName("szobeli_erettsegi");
	         System.out.println("----------------------------");
	       //List every data from the szobeli eretts�gi element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("Helysz�n: "
	                  + eElement
	                  .getElementsByTagName("helyszin")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Szint: "
	               + eElement
	                  .getElementsByTagName("szint")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Id�pont: "
	               + eElement
	                  .getElementsByTagName("idopont")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	         //Tant�rgy
	         nList = doc.getElementsByTagName("tantargy");
	         System.out.println("----------------------------");
	       //List every data from the tantargy element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("N�v: "
	                  + eElement
	                  .getElementsByTagName("nev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("T�tel: "
	               + eElement
	                  .getElementsByTagName("tetel")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	         //Eln�k
	         nList = doc.getElementsByTagName("elnok");
	         System.out.println("----------------------------");
	       //List every data from the elnok element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("Vezet�kn�v: "
	                  + eElement
	                  .getElementsByTagName("vezeteknev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Ut�n�v: "
	               + eElement
	                  .getElementsByTagName("utonev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Iskola: "
	               + eElement
	                  .getElementsByTagName("iskola")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	         
	       //Tan�r
	         nList = doc.getElementsByTagName("tanar");
	         System.out.println("----------------------------");
	       //List every data from the tanar element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("Vezet�kn�v: "
	                  + eElement
	                  .getElementsByTagName("vezeteknev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Ut�n�v: "
	               + eElement
	                  .getElementsByTagName("utonev")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Tan�tott t�rgy: "
	               + eElement
	                  .getElementsByTagName("tanitott_targy")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	         
	       //Bizony�tv�ny
	         nList = doc.getElementsByTagName("bizonyitvany");
	         System.out.println("----------------------------");
	       //List every data from the bizonyitvany element
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :"
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("ID: "
	                  + eElement.getAttribute("id"));
	               System.out.println("Szint: "
	                  + eElement
	                  .getElementsByTagName("szint")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

}