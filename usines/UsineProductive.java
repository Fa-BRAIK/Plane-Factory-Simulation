package usines;

import composants.Composant;

import java.util.ArrayList;

public class UsineProductive extends Usine {
    protected int intervalProduction;
    protected ArrayList<Composant> entrees = new ArrayList<>();
    protected Composant sortie;

    public UsineProductive(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY);
        this.intervalProduction = intervalProduction;
    }

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
