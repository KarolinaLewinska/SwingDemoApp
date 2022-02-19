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
        Dimension modalSize = label.getPreferredSize();
        if (modalSize.width > MAX_MODAL_WIDTH) {
            int linesOfText = (int) Math.ceil(((double) modalSize.width) / MAX_MODAL_WIDTH) + 1;
            modalSize.width = MAX_MODAL_WIDTH;
            modalSize.height *= linesOfText;
            label.setPreferredSize(modalSize);
        }
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(label);
    }
}
