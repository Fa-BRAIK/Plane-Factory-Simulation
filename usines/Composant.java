package usines;

import javafx.scene.image.Image;

public class Composant {
    private Image icon;
    private ComposantType type;

    /**
     * Ce contructeur utilise un if else pour vérifier quel type de composant
     * on va utiliser puis il init son "type" et load l'image qui a besoin d'utiliser
     *
     * @param type
     */
    Composant(String type) {
        if (type.equals("metal")) {
            this.type = ComposantType.METAL;
            this.icon = new Image("src/ressources/metal.png");
        } else if (type.equals("aile")) {
            this.type = ComposantType.AILE;
            this.icon = new Image("src/ressources/aile.png");
        } else if (type.equals("moteur")) {
            this.type = ComposantType.MOTEUR;
            this.icon = new Image("src/ressources/moteur.png");
        } else {
            this.type = ComposantType.AVION;
            this.icon = new Image("src/ressources/avion.png");
        }
    }

    public Image getIcon() {
        return icon;
    }

    public ComposantType getType() {
        return type;
    }
}
