package com.alura.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Sticker {

    public final String URL;

    private BufferedImage image;

    public Sticker(String url) {
        this.URL = url;
    }

    public void generate() {
        try {
            var inputStream = new URL(URL).openStream();
            this.image = ImageIO.read(inputStream);

            this.resize(675, 1000);

            var file = new File("stickers/sticker.png");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdir();
            }
            ImageIO.write(this.image, "png", file);

        } catch (IOException ex) {
            System.out.println("Oops! " + ex.getMessage());
            System.exit(0);
        }
    }

    private void resize(int width, int height) {
        var bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        bufferedImage.getGraphics().drawImage(this.image, 0, 0, width, height, null);
        this.image = bufferedImage;
    }
}
