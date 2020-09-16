package usines.type;

import composants.Composant;
import usines.UsineProductive;

import java.util.ArrayList;

public class UsineMoteur extends UsineProductive {
    private static ArrayList<Composant> entreesUsine = new ArrayList<>();
    private static Composant sortieUsine = null;

    public static void init(ArrayList<Composant> entrees, Composant sortie) {
        UsineMoteur.entreesUsine = entrees;
        UsineMoteur.sortieUsine = sortie;
    }

    public UsineMoteur(int id, double positionX, double positionY, int intervalPoduction) {
        super(id, positionX, positionY, intervalPoduction);

        for (Composant composant : UsineMoteur.entreesUsine) {
            entrees.add(Composant.nouvelComposant(composant));
        }

        sortie = Composant.nouvelComposant(UsineMoteur.sortieUsine);
    }

    @Override
    public Composant produireComposant() {
        return null;
    }
}
