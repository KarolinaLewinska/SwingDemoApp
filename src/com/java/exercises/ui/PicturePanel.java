package com.java.exercises.ui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.net.URL;

public class PicturePanel extends JPanel {
    private static final int IMAGE_WIDTH = 300;
    private static final int IMAGE_HEIGHT = 200;

    public PicturePanel(URL imagePath) {
        super();
        ImageIcon imageIcon = new ImageIcon
                (new ImageIcon(imagePath).getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        JLabel iconLabel = new JLabel(imageIcon);
        add(iconLabel);
    }
}
