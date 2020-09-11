package usines;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Usine {
    public static final int nombreEtat = 4;

    protected IconeUsine[] icones = new IconeUsine[4];
    protected ArrayList<Entree> entrees;
    protected Sortie sortie;
    protected EtatUsine etat= EtatUsine.VIDE;

    Usine(ArrayList<Entree> entrees, Sortie sortie) {
        this.entrees = entrees;
        this.sortie = sortie;
    }

    public IconeUsine getIcone(int index) {
        return icones[index % nombreEtat];
    }

    public ArrayList<Entree> getEntrees() {
        return entrees;
    }

    public Sortie getSortie() {
        return sortie;
    }
}
