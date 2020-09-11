package usines;

import javafx.scene.image.Image;

public class IconeUsine {
    private String type;
    private Image image;

    IconeUsine(String type, String srcImage) {
        this.type = type;
        this.image = new Image(srcImage);
    }

    public String getType() {
        return type;
    }

    public Image getImage() {
        return image;
    }
}
