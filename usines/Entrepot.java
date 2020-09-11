package usines;

import java.util.ArrayList;

public class Entrepot extends Usine {
    private int capacite;

    Entrepot(ArrayList<Entree> entrees, int capacite) {
        super(entrees, null);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }
}
