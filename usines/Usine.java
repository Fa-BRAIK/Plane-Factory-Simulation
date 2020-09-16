package usines;

import utils.Coordonnees;

import java.awt.image.BufferedImage;

public abstract class Usine extends Coordonnees {
    public static BufferedImage[] icones;

    protected int id;
    protected EtatUsine etat = EtatUsine.VIDE;

    public Usine(int id, double positionX, double positionY) {
        super(positionX, positionY);
        this.id = id;
    }

    public abstract void dessiner();

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
