package com.java.exercises.ui.modal;

import com.java.exercises.ui.InterfaceHelpers;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ModalPanel extends JFrame {
    public ModalPanel() {
        TitlePanel titlePanel = new TitlePanel();
        add(titlePanel, BorderLayout.PAGE_START);
        setSize(300,150);
        setUndecorated(true);
        InterfaceHelpers.centerFrame(this);
        setAlwaysOnTop (true);

        JButton button = new JButton();
        add(button);
        InterfaceHelpers.closeFrame(button, this);
    }
}
