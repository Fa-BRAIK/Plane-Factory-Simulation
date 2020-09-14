package composants;

import java.awt.image.BufferedImage;
import java.io.File;

public class Avion extends Composant {
    public static BufferedImage icone = Composant.read(new File("src/ressources/avion.png"));

    protected Avion(int quantite) {
        super(quantite);
    }
}
