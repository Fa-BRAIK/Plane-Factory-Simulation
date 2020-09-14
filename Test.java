import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

public class Test {
    /**
     * On Utilise ce programme pour initialiser tout les instances
     * @param args
     */
    public static void main(String[] args) {
        try {
            //BufferedImage image = ImageIO.read(new File("src/ressources/aile.png"));

            File file = new File("src/ressources/configuration.xml");

            //an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);

            NodeList nodeList = doc.getElementsByTagName("metadonnees").item(0).getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    /*System.out.println("Node Item");

                    System.out.println(nodeList.item(i).getAttributes().getNamedItem("type"));

                    Element eElement = (Element) nodeList.item(i);

                    Element elIcones = (Element) eElement.getElementsByTagName("icones")
                            .item(0);

                    NodeList entrees = eElement.getElementsByTagName("entree"),
                            icones = elIcones.getElementsByTagName("icone");

                    Node sortie = eElement.getElementsByTagName("sortie").item(0),
                         intervalProd = eElement.getElementsByTagName("interval-production").item(0);*/

                    /*System.out.println("Icones : " + icones.getLength());
                    System.out.println("Entrees : " + entrees.getLength());
                    System.out.println("Sortie : " + sortie);
                    System.out.println("interval :" + intervalProd);*/

                    // how to read attributes
                    /*for (int j = 0; j < icones.getLength(); j++) {
                        //System.out.println(icones.item(j).getAttributes().getNamedItem("type"));
                        //System.out.println(icones.item(j).getAttributes().getNamedItem("path"));
                    }*/

                    // Entrées de l'usine
                    /*ArrayList<Entree> entrees1 = new ArrayList<Entree>();
                    for (int j = 0; j < entrees.getLength(); j++) {
                        String type = entrees.item(j).getAttributes().getNamedItem("type").getTextContent();
                        String quantite;

                        if (entrees.item(j).getAttributes().getNamedItem("quantite") != null) {
                            quantite = entrees.item(j).getAttributes().getNamedItem("quantite").getTextContent();
                        } else {
                            quantite = entrees.item(j).getAttributes().getNamedItem("capacite").getTextContent();
                        }

                        entrees1.add(new Entree(type, Integer.parseInt(quantite)));
                    }

                    if (sortie != null) {
                        System.out.println(sortie.getAttributes().getNamedItem("type").getTextContent());
                    }

                    System.out.println("----------");*/
                }
            }
        } catch(Exception e) { e.printStackTrace(); }
    }
}
