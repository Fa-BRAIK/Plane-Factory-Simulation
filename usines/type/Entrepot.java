package usines.type;

import composants.Composant;
import usines.Usine;

import java.util.ArrayList;

public class Entrepot extends Usine {
    private static Composant entreeEntrepot;

    private Composant entree;

    public static void init(Composant entree) {
        Entrepot.entreeEntrepot = entree;
    }

    public Entrepot(int id, double positionX, double positionY) {
        super(id, positionX, positionY);
        entree = Composant.nouvelComposant(entreeEntrepot);
    }
}
