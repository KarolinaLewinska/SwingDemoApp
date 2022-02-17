package com.java.exercises.ui.modal;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

public class TextPanel extends JPanel {
    public TextPanel() {
        JTextArea textArea = new JTextArea("oknjjnjbhbhbhh nkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        setBackground(Color.WHITE);
        setForeground(Color.GRAY);
        add(textArea);
    }
}
