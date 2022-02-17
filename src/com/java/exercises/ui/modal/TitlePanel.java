package com.java.exercises.ui.modal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class TitlePanel extends JPanel {
    public TitlePanel() {
        JLabel label = new JLabel("Modal dialog");
        label.setFont((new Font("Arial", Font.BOLD, 12)));
        label.setForeground(Color.GRAY);
        add(label);
        setBackground(Color.white);
    }
}
