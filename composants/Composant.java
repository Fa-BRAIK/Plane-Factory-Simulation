package composants;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Composant {

    protected static BufferedImage read(File file) {
        try {
            return ImageIO.read(file);
        } catch(IOException e) {e.printStackTrace(); return null;}
    }
}
