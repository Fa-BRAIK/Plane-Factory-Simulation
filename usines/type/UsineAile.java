package usines.type;

import composants.Composant;
import usines.UsineProductive;

import java.util.ArrayList;

public class UsineAile extends UsineProductive {
    private static ArrayList<Composant> entreesUsine = new ArrayList<>();
    private static Composant sortieUsine = null;

    public static void init(ArrayList<Composant> entrees, Composant sortie) {
        UsineAile.entreesUsine = entrees;
        UsineAile.sortieUsine = sortie;
    }

    public UsineAile(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY, intervalProduction);

        for (Composant composant : UsineAile.entreesUsine) {
            entrees.add(Composant.nouvelComposant(composant));
        }

        sortie = Composant.nouvelComposant(UsineAile.sortieUsine);
    }
}
