package usines.type;

import usines.UsineProductive;

import java.util.ArrayList;

public class UsineMoteur extends UsineProductive {
    private static ArrayList<String> entrees = new ArrayList<>();
    private static String sortie = null;

    public static void init(ArrayList<String> entrees, String sortie) {
        UsineMoteur.entrees = entrees;
        UsineMoteur.sortie = sortie;
    }

    public UsineMoteur(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY, intervalProduction);
    }
}
