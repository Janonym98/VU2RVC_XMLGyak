package hu.domparse.VU2RVC;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

//this helped me
//https://www.tutorialspoint.com/java_xml/java_dom_query_document.htm


public class DOMQueryVU2RVC {
	public static final String xmlFilePath = "G:\\XML\\Beadando\\beadando\\XMLVU2RVC.xml";
	
	public static void main(String argv[]) {
	
		 
	      try {
	         File inputFile = new File(xmlFilePath);
	         //document builder
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.print("Root element: ");
	         System.out.println(doc.getDocumentElement().getNodeName());
	         //selecting the elements
	         NodeList nList = doc.getElementsByTagName("szobeli_erettsegi");
	         NodeList mList = doc.getElementsByTagName("tanulo");
	         NodeList kList = doc.getElementsByTagName("tantargy");
	         NodeList lList = doc.getElementsByTagName("tanar");
	         
	         
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :");
	            System.out.print(nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.print("\nID : ");
	               System.out.println(eElement.getAttribute("id"));
	               //selecting the idopont element from the given (szobeli_erettsegi) element
	               NodeList idopontList = eElement.getElementsByTagName("idopont");
	               
	               //List all idopont element, and ID-s
	               for (int count = 0; count < idopontList.getLength(); count++) {
	                  Node node1 = idopontList.item(count);
	                  
	                  if (node1.getNodeType() == Node.ELEMENT_NODE) {
	                     Element idopont = (Element) node1;
	                     System.out.print("Idõpont : ");
	                     System.out.println(idopont.getTextContent());
	                     System.out.print("Tanulo_ID : ");
	                     System.out.println(eElement.getAttribute("tanulo_ID"));
	                     System.out.print("Tantargy_ID : ");
	                     System.out.println(eElement.getAttribute("tantargy_ID"));
	                     
	                  }
	               }
	            }
	         }
	         for (int temp = 0; temp < mList.getLength(); temp++) {
		            Node nNode = mList.item(temp);
		            System.out.println("\nCurrent Element :");
		            System.out.print(nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		               Element eElement = (Element) nNode;
		               System.out.print("\nID : ");
		               System.out.println(eElement.getAttribute("id"));
		               NodeList vezetekList = eElement.getElementsByTagName("vezeteknev");
		               NodeList keresztList = eElement.getElementsByTagName("utonev");
		               NodeList szuletettList = eElement.getElementsByTagName("szuletesi_ev");
		               
		               for (int count = 0; count < vezetekList.getLength(); count++) {
		                  Node node1 = vezetekList.item(count);
		                  Node node2 = keresztList.item(count);
		                  
		                  if (node1.getNodeType() == Node.ELEMENT_NODE && node2.getNodeType() == Node.ELEMENT_NODE) {
		                     Element vezetek = (Element) node1;
		                     Element kereszt = (Element) node2;
		                     System.out.print("Név : ");
		                     System.out.println(vezetek.getTextContent()+" "+ kereszt.getTextContent());
		                  }
		               }
		               for (int count = 0; count < szuletettList.getLength(); count++) {
			                  Node node1 = szuletettList.item(count);
			                  
			                  if (node1.getNodeType() == Node.ELEMENT_NODE) {
			                     Element szuletett = (Element) node1;
			                     System.out.print("Születési év : ");
			                     System.out.println(szuletett.getTextContent());
			                  }
			               }
		            }
		         }
	         for (int temp = 0; temp < kList.getLength(); temp++) {
		            Node nNode = kList.item(temp);
		            System.out.println("\nCurrent Element :");
		            System.out.print(nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		               Element eElement = (Element) nNode;
		               System.out.print("\nID : ");
		               System.out.println(eElement.getAttribute("id"));
		               NodeList nevList = eElement.getElementsByTagName("nev");
		               
		               for (int count = 0; count < nevList.getLength(); count++) {
		                  Node node1 = nevList.item(count);
		                  
		                  if (node1.getNodeType() == Node.ELEMENT_NODE) {
		                     Element nev = (Element) node1;
		                     System.out.print("Tantárgy : ");
		                     System.out.println(nev.getTextContent());
		                     System.out.print("Tanar ID : ");
		                     System.out.println(eElement.getAttribute("tanar_ID"));
		                  }
		               }
		            }
		         }
	         for (int temp = 0; temp < lList.getLength(); temp++) {
		            Node nNode = lList.item(temp);
		            System.out.println("\nCurrent Element :");
		            System.out.print(nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		               Element eElement = (Element) nNode;
		               System.out.print("\nID : ");
		               System.out.println(eElement.getAttribute("id"));
		               NodeList vezetekList = eElement.getElementsByTagName("vezeteknev");
		               NodeList keresztList = eElement.getElementsByTagName("utonev");
		               
		               for (int count = 0; count < vezetekList.getLength(); count++) {
		                  Node node1 = vezetekList.item(count);
		                  Node node2 = keresztList.item(count);
		                  
		                  if (node1.getNodeType() == Node.ELEMENT_NODE && node2.getNodeType() == Node.ELEMENT_NODE) {
		                     Element vezetek = (Element) node1;
		                     Element kereszt = (Element) node2;
		                     System.out.print("Név : ");
		                     System.out.println(vezetek.getTextContent()+" "+ kereszt.getTextContent());
		                  }
		               }
		            }
	         }
	         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	
}
