package composants;

import utils.Coordonnees;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Composant extends Coordonnees {
    protected int quantite;
    protected int courant;

    protected Composant(int quantite) {
        super(-50, -50);
        this.quantite = quantite;
        this.courant = 1;
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
