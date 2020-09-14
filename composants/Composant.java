package composants;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Composant {
    protected int quantite;

    protected Composant(int quantite) {
        this.quantite = quantite;
    }

    protected static BufferedImage read(File file) {
        try {
            return ImageIO.read(file);
        } catch(IOException e) {e.printStackTrace(); return null;}
    }

    public static Composant nouvelComposant(Composant composant) {
        if (composant instanceof Aile)
            return new Aile(composant.quantite);
        else if (composant instanceof Avion)
            return new Avion(composant.quantite);
        else if (composant instanceof Metal)
            return new Metal(composant.quantite);
        else return new Moteur(composant.quantite);
    }
}
