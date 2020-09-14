package usines.type;

import composants.Composant;
import usines.UsineProductive;

import java.util.ArrayList;

public class UsineAssemblage extends UsineProductive {
    private static ArrayList<Composant> entreesUsine = new ArrayList<>();
    private static Composant sortieUsine = null;

    public static void init(ArrayList<Composant> entrees, Composant sortie) {
        UsineAssemblage.entreesUsine = entrees;
        UsineAssemblage.sortieUsine = sortie;
    }

    public UsineAssemblage(int id, double positionX, double positionY, int intervalPoduction) {
        super(id, positionX, positionY, intervalPoduction);

        for (Composant composant : UsineAssemblage.entreesUsine) {
            entrees.add(Composant.nouvelComposant(composant));
        }

        sortie = Composant.nouvelComposant(UsineAssemblage.sortieUsine);
    }
}
