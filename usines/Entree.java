package usines;

import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

public class Entree {
    private Composant composant;
    private int quantite;

    public Entree(String type, int quantite) {
        this.composant = new Composant(type);
        this.quantite = quantite;
    }

    public String getTypeComposant() {
        return composant.getType().name();
    }

    public BufferedImage getImageComposant() { return composant.getIcon(); }

    public int getQuantite() {
        return quantite;
    }
}
