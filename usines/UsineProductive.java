package usines;

import composants.Composant;

import java.util.ArrayList;

public abstract class UsineProductive extends Usine {
    protected int intervalProduction;
    protected int tempsEcoule = 0;
    protected ArrayList<Composant> entrees = new ArrayList<>();
    protected Composant sortie;

    public UsineProductive(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY);
        this.intervalProduction = intervalProduction;
    }

    public boolean maj() {
        if (tempsEcoule == intervalProduction) {
            tempsEcoule = 0;
            return true;
        } else {
            tempsEcoule++;
            return false;
        }
    }

    @Override
    public void dessiner() {
        //
    }

    public abstract Composant produireComposant();

    public int getIntervalProduction() {
        return intervalProduction;
    }

    public ArrayList<Composant> getEntrees() {
        return entrees;
    }

    public Composant getSortie() {
        return sortie;
    }
}
