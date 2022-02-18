package com.java.exercises.ui.modal;

import com.java.exercises.ui.InterfaceHelper;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;


public class ButtonPanel extends JPanel {
    public ButtonPanel(JDialog modalPanel, JFrame frame) {
        JButton button = new JButton("OK");
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0, 200, 0, 10));
        add(button);
        InterfaceHelper.closeFrame(frame, button, modalPanel);
    }
}
