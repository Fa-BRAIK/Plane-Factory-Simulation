package usines;

import javafx.scene.image.Image;

public class Entree {
    private Composant composant;
    private int quantite;

    Entree(String type, int quantite) {
        this.composant = new Composant(type);
        this.quantite = quantite;
    }

    public String getTypeComposant() {
        return composant.getType().name();
    }

    public Image getImageComposant() { return composant.getIcon(); }

    public int getQuantite() {
        return quantite;
    }
}
