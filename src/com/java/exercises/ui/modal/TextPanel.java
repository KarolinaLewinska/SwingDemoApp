package com.java.exercises.ui.modal;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class TextPanel extends JPanel {
    private final int MAX_MODAL_WIDTH = 300;
    String text;

    public TextPanel(String text) {
        this.text = text;
        setBackground(Color.WHITE);
        setForeground(Color.GRAY);

        JLabel label = new JLabel("<html>" + text + "</html>");
        Dimension labelPreferredSize = label.getPreferredSize();
        label.setPreferredSize(setTextSize(labelPreferredSize, MAX_MODAL_WIDTH));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(label);
    }

    private static Dimension setTextSize(Dimension textSize, int maxWidth) {
        if (textSize.width > maxWidth) {
            int linesOfText = (int) Math.ceil(((double) textSize.width) / maxWidth) + 1;
            textSize.width = maxWidth;
            textSize.height *= linesOfText;
        }
        return textSize;
    }
}
