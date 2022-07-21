package com.alura.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Sticker {

    public final String URL;
    public final int RATING;

    private BufferedImage image;

    public Sticker(String url, int rating) {
        this.URL = url;
        this.RATING = rating;
    }

    public void generate() {
        try {
            var inputStream = new URL(URL).openStream();
            this.image = ImageIO.read(inputStream);

            this.resize(675, 1000);

            if (this.RATING > 0) {
                this.addStars();
            }

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

    private void addStars() {
        var graphics = this.image.getGraphics();

        graphics.setColor(Color.YELLOW);
        graphics.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 128));

        var stars = "⭐ ";
        for (var i = 1; i < this.RATING && i < 5; i++) {
            stars += "⭐ ";
        }

        var stringWidth = graphics.getFontMetrics().getStringBounds(stars, graphics).getWidth();

        int width = (int) (this.image.getWidth() - stringWidth) / 2;
        int height = (int) (this.image.getHeight() * 0.95);
        graphics.drawString(stars, width, height);
    }

    private void resize(int width, int height) {
        var bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        bufferedImage.getGraphics().drawImage(this.image, 0, 0, width, height, null);
        this.image = bufferedImage;
    }
}
