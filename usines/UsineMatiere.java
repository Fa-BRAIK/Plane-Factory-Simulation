package usines;

import java.util.ArrayList;

public class UsineMatiere extends UsineProductive {
    UsineMatiere(ArrayList<IconeUsine> icones, ArrayList<Entree> entrees, Sortie sortie, int intervalProd) {
        super(entrees, sortie, intervalProd);
        this.icones = icones.toArray(new IconeUsine[Usine.nombreEtat]);
    }
}