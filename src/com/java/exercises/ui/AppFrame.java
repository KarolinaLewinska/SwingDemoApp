package com.java.exercises.ui;

import javax.swing.JButton;
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

        LabelPanel labelPanel = new LabelPanel();
        add(labelPanel, BorderLayout.PAGE_START);

        PicturePanel javaImg = new PicturePanel(JAVA_IMG_URL);
        PicturePanel swingImg = new PicturePanel(SWING_IMG_URL);

        JPanel imgPanel = new JPanel();
        imgPanel.setLayout(new GridLayout(1,2));
        imgPanel.add(javaImg);
        imgPanel.add(swingImg);
        add(imgPanel);

        JButton button = new JButton("Click  me to see resizable dialog");
        add(button, BorderLayout.PAGE_END);
    }
}
