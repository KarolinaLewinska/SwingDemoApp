package com.java.exercises.helpers;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class InterfaceHelper {
    public static void showModalDialog(JFrame frame, JDialog modal, JButton button) {
        button.addActionListener(e -> {
            setDimmedBackground(frame,true);
            modal.setVisible(true);
        });
    }

    public static void closeFrame(JFrame frame, JButton button, JDialog modal) {
        button.addActionListener(e -> {
            setDimmedBackground(frame, false);
            modal.setVisible(false);
        });
    }

    private static void setDimmedBackground(JFrame frame, boolean isDimmed) {
        JComponent backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(0,0,0,200));
        frame.setGlassPane(backgroundPanel);
        backgroundPanel.setVisible(isDimmed);
    }
}