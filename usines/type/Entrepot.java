package usines.type;

import usines.Usine;

import java.util.ArrayList;

public class Entrepot extends Usine {
    private static String entree;

    public static void init(String entree) {
        Entrepot.entree = entree;
    }

    public Entrepot(int id, double positionX, double positionY) {
        super(id, positionX, positionY);
    }
}
