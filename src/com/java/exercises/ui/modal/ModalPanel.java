package com.java.exercises.ui.modal;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ModalPanel extends JDialog {
    public ModalPanel(JFrame frame) {
        setPosition(this);
        setUndecorated(true);
        setModal(true);

        TitlePanel titlePanel = new TitlePanel("My modal dialog");
        TextPanel textPanel = new TextPanel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore.");
        ButtonPanel buttonPanel = new ButtonPanel(this, frame);
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.add(titlePanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
        mainPanel.add(textPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,5)));
        mainPanel.add(buttonPanel);
        add(mainPanel);
        pack();
    }

    private void setPosition(JDialog dialog) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - dialog.getWidth()) / 2 - 30);
        int y = (int) ((dimension.getHeight() - dialog.getHeight()) / 2 - 80);
        dialog.setLocation(x, y);
    }
}
