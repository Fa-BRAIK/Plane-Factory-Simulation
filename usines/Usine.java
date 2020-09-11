package usines;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Usine {
    protected Image icones;
    protected ArrayList<Entree> entrees;
    protected Sortie sortie;
    protected EtatUsine etat= EtatUsine.VIDE;

    Usine(ArrayList<Entree> entrees, Sortie sortie) {
        this.entrees = entrees;
        this.sortie = sortie;
    }

    public Image getIcones() {
        return icones;
    }

    public ArrayList<Entree> getEntrees() {
        return entrees;
    }

    public Sortie getSortie() {
        return sortie;
    }
}
