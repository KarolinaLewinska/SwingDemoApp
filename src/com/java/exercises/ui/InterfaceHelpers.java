package com.java.exercises.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class InterfaceHelpers {
    public static void centerFrame(JFrame frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    public static void showModalDialog(JButton button, JFrame frame) {
        button.addActionListener(e -> frame.setVisible(true));
    }

    public static void closeFrame(JButton button, JFrame frame) {
        button.addActionListener(e -> frame.setVisible(false));
    }
}
