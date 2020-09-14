package usines;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usine {
    public static final int nombreEtat = 4;
    public static ArrayList<Entree> entrees = new ArrayList<>();

    protected double posX, posY;
    protected IconeUsine[] icones;
    protected ArrayList<Entree> entrees1;
    protected Sortie sortie;
    protected EtatUsine etat= EtatUsine.VIDE;

    Usine(ArrayList<Entree> entrees, Sortie sortie) {
        this.entrees1 = entrees;
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
