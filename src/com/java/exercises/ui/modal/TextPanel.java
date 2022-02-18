package com.java.exercises.ui.modal;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

public class TextPanel extends JPanel {
    public TextPanel() {
        JTextArea textArea = new JTextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur gravida justo eget vestibulum congue. Sed rutrum bibendum fermentum. Morbi fermentum tellus id auctor venenatis. Fusce at dolor ex.");
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        setBackground(Color.WHITE);
        setForeground(Color.GRAY);
        add(textArea);
    }
}
