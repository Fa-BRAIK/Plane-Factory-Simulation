package usines.type;

import usines.UsineProductive;

import java.util.ArrayList;

public class UsineMatiere extends UsineProductive {
    private static ArrayList<String> entrees = new ArrayList<>();
    private static String sortie = null;

    public static void init(ArrayList<String> entrees, String sortie) {
        UsineMatiere.entrees = entrees;
        UsineMatiere.sortie = sortie;
    }

    public UsineMatiere(int id, double positionX, double positionY, int intervalPoduction) {
        super(id, positionX, positionY, intervalPoduction);
    }
}
