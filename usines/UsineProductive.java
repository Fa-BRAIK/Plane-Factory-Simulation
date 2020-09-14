package usines;

public class UsineProductive extends Usine {
    protected int intervalProduction;

    public UsineProductive(int id, double positionX, double positionY, int intervalProduction) {
        super(id, positionX, positionY);
        this.intervalProduction = intervalProduction;
    }

    public int getIntervalProduction() {
        return intervalProduction;
    }
}
