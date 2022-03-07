package com.java.exercises.ui.modal;

import com.java.exercises.helpers.InterfaceHelper;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;


public class ButtonPanel extends JPanel {
    public ButtonPanel(JDialog modalPanel, JFrame frame) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0, 150, 10, 10));

        JButton button = new JButton("OK");
        button.setPreferredSize(new Dimension(60,20));
        button.setBackground(Color.ORANGE);
        add(button);

        InterfaceHelper.closeFrame(frame, button, modalPanel);
    }
}
