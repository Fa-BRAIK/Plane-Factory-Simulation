package usines;

public class Sortie {
    private Composant composant;

    Sortie(String type) {
        this.composant = new Composant(type);
    }

    public String getTypeComposant() {
        return composant.getType().name();
    }
}
