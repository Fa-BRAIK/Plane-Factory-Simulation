package usines;

import java.util.ArrayList;

public class UsineProductive extends Usine {
    private int intervalProd;

    UsineProductive(ArrayList<Entree> entrees, Sortie sortie, int intervalProd) {
        super(entrees, sortie);
        this.intervalProd = intervalProd;
    }
}
