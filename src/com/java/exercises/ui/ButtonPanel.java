package com.java.exercises.ui;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class ButtonPanel extends JPanel {
    JButton button;

    public ButtonPanel() {
        button = new JButton("Click to see resizable dialog");
        button.setPreferredSize(new Dimension(250,40));
        button.setBackground(Color.ORANGE);
        add(button);
    }
}