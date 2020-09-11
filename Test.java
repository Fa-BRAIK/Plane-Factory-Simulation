/**
 * This class is to test the usines package classes
 */
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Test {
    /**
     * On Utilise ce programme pour initialiser tout les instances
     * @param args
     */
    public static void main(String[] args) {
        try {
            File file = new File("src/ressources/configuration.xml");

            //an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);

            NodeList nodeList = doc.getElementsByTagName("metadonnees").item(0).getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("Node Item");

                    Element eElement = (Element) nodeList.item(i);

                    Element elIcones = (Element) eElement.getElementsByTagName("icones")
                            .item(0);

                    NodeList entrees = eElement.getElementsByTagName("entree"),
                            icones = elIcones.getElementsByTagName("icone");

                    Node sortie = eElement.getElementsByTagName("sortie").item(0),
                         intervalProd = eElement.getElementsByTagName("interval-production").item(0);

                    System.out.println("Icones : " + icones.getLength());
                    System.out.println("Entrees : " + entrees.getLength());
                    System.out.println("Sortie : " + sortie);
                    System.out.println("interval :" + intervalProd);

                    System.out.println("----------");
                }
            }
        } catch(Exception e) { e.printStackTrace(); }
    }
}
