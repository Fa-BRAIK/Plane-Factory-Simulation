package composants;

import java.awt.image.BufferedImage;
import java.io.File;

public class Moteur extends Composant {
    public static BufferedImage icone = Composant.read(new File("src/ressources/moteur.png"));

    protected Moteur(int quantite) {
        super(quantite);
    }
}
