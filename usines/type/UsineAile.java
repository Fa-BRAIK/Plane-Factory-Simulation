package usines.type;

import usines.UsineProductive;

import java.util.ArrayList;

public class UsineAile extends UsineProductive {
    private static ArrayList<String> entrees = new ArrayList<>();
    private static String sortie = null;

    public static void init(ArrayList<String> entrees, String sortie) {
        UsineAile.entrees = entrees;
        UsineAile.sortie = sortie;
    }

    public UsineAile(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY, intervalProduction);
    }
}
