package com.java.exercises.ui.modal;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ModalPanel extends JDialog {
    public ModalPanel(JFrame frame) {
        setSize(300,150);
        setPosition(this);
        setUndecorated(true);
        setModal(true);
        TitlePanel titlePanel = new TitlePanel();
        TextPanel textPanel = new TextPanel();
        ButtonPanel buttonPanel = new ButtonPanel(this, frame);
        JPanel mainPanel = new JPanel();
        mainPanel.setSize(300,150);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.add(titlePanel, BorderLayout.PAGE_START);
        mainPanel.add(textPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.PAGE_END);
        add(mainPanel);
    }

    public static void setPosition(JDialog dialog) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - dialog.getWidth()) / 2 + 120);
        int y = (int) ((dimension.getHeight() - dialog.getHeight()) / 2);
        dialog.setLocation(x, y);
    }
}
