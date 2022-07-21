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
}
