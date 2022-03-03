package com.java.exercises.helpers;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

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
        frame.setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 0, 200));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });
        frame.getGlassPane().setVisible(isDimmed);
    }
}