package com.java.exercises.ui;

import javax.swing.JButton;
import javax.swing.JDialog;

public class InterfaceHelper {
    public static void showModalDialog(JButton button, JDialog panel) {
        button.addActionListener(e -> panel.setVisible(true));
    }

    public static void closeFrame(JButton button, JDialog panel) {
        button.addActionListener(e -> panel.setVisible(false));
    }
}