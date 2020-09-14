package usines.type;

import usines.UsineProductive;

import java.util.ArrayList;

public class UsineAssemblage extends UsineProductive {
    private static ArrayList<String> entrees = new ArrayList<>();
    private static String sortie = null;

    public static void init(ArrayList<String> entrees, String sortie) {
        UsineAssemblage.entrees = entrees;
        UsineAssemblage.sortie = sortie;
    }

    public UsineAssemblage(int id, double positionX, double positionY, int intervalPoduction) {
        super(id, positionX, positionY, intervalPoduction);
    }
}
