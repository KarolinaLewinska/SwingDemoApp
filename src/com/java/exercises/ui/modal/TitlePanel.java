package com.java.exercises.ui.modal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class TitlePanel extends JPanel {
    String title;
    public TitlePanel(String title) {
        this.title = title;
        setBackground(Color.WHITE);
        JLabel label = new JLabel(title);
        label.setFont((new Font("Arial", Font.BOLD, 14)));
        label.setForeground(Color.GRAY);
        add(label);
    }
}
