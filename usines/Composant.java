package usines;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Composant {
    private BufferedImage icon;
    private ComposantType type;

    /**
     * Ce contructeur utilise un if else pour vérifier quel type de composant
     * on va utiliser puis il init son "type" et load l'image qui a besoin d'utiliser
     *
     * @param type
     */
    Composant(String type) {
        try {
            if (type.equals("metal")) {
                this.type = ComposantType.METAL;
                this.icon = ImageIO.read(new File("src/ressources/metal.png"));
            } else if (type.equals("aile")) {
                this.type = ComposantType.AILE;
                this.icon = ImageIO.read(new File("src/ressources/aile.png"));
            } else if (type.equals("moteur")) {
                this.type = ComposantType.MOTEUR;
                this.icon = ImageIO.read(new File("src/ressources/moteur.png"));
            } else {
                this.type = ComposantType.AVION;
                this.icon = ImageIO.read(new File("src/ressources/avion.png"));
            }
        } catch(IOException e) { e.printStackTrace(); }
    }

    public BufferedImage getIcon() {
        return icon;
    }

    public ComposantType getType() {
        return type;
    }
}
