package usines.type;

import composants.Composant;
import usines.UsineProductive;

import java.util.ArrayList;

public class UsineMatiere extends UsineProductive {
    private static ArrayList<Composant> entreesUsine = new ArrayList<>();
    private static Composant sortieUsine = null;

    public static void init(ArrayList<Composant> entrees, Composant sortie) {
        UsineMatiere.entreesUsine = entrees;
        UsineMatiere.sortieUsine = sortie;
    }

    public UsineMatiere(int id, double positionX, double positionY, int intervalPoduction) {
        super(id, positionX, positionY, intervalPoduction);

        for (Composant composant : UsineMatiere.entreesUsine) {
            entrees.add(Composant.nouvelComposant(composant));
        }

        sortie = Composant.nouvelComposant(UsineMatiere.sortieUsine);
    }

    @Override
    public Composant produireComposant() {
        return null;
    }
}
