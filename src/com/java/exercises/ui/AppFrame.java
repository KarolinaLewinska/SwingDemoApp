package com.java.exercises.ui;

import com.java.exercises.ui.modal.ModalPanel;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.net.URL;

public class AppFrame extends JFrame {
    private final URL JAVA_IMG_URL = this.getClass().getResource("../images/java.png");
    private final URL SWING_IMG_URL = this.getClass().getResource("../images/swing.png");

    public AppFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(700, 450));
        setMinimumSize(new Dimension(700,450));
        setLocationRelativeTo(null);

        LabelPanel labelPanel = new LabelPanel();
        labelPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(labelPanel, BorderLayout.PAGE_START);

        JPanel imgPanel = new JPanel();
        PicturePanel javaImg = new PicturePanel(JAVA_IMG_URL);
        PicturePanel swingImg = new PicturePanel(SWING_IMG_URL);
        imgPanel.setLayout(new GridLayout(1,2));
        imgPanel.add(javaImg);
        imgPanel.add(swingImg);
        add(imgPanel);

        ButtonPanel buttonPanel = new ButtonPanel();
        ModalPanel modalPanel = new ModalPanel(this);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        add(buttonPanel, BorderLayout.PAGE_END);

        InterfaceHelper.showModalDialog(this, modalPanel, buttonPanel.button);
    }
}
