package usines;

import utils.Coordonnees;

import java.awt.image.BufferedImage;

public class Usine extends Coordonnees {
    public static BufferedImage[] icones;

    protected int id;
    protected EtatUsine etat = EtatUsine.VIDE;

    public Usine(int id, double positionX, double positionY) {
        super(positionX, positionY);
        this.id = id;
    }

    public static BufferedImage[] getIcones() {
        return icones;
    }

    public int getId() {
        return id;
    }

    public EtatUsine getEtat() {
        return etat;
    }

    public void setEtat(EtatUsine etat) {
        this.etat = etat;
    }
}
