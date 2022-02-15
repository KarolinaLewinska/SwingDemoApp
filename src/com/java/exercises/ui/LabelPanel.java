package com.java.exercises.ui;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class LabelPanel extends JPanel {
    public LabelPanel() {
        add(Box.createRigidArea(new Dimension(0,20)));
        JLabel label = new JLabel("Swing Demo App");
        label.setFont((new Font("Arial", Font.BOLD, 14)));
        label.setForeground(Color.GRAY);
        add(label);
    }
}
