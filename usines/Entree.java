package usines;

public class Entree {
    private String type;
    private int quantite;

    Entree(String type, int quantite) {
        this.type = type;
        this.quantite = quantite;
    }

    public String getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }
}
