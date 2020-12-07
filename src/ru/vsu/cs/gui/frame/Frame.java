package ru.vsu.cs.gui.frame;

import ru.vsu.cs.gui.controller.ControllerButtonResult;

import javax.swing.*;

public class Frame extends JFrame {
    private JPanel mainPanel;
    private JTextField inputArrayTextField;
    private JTextField indexResultTextField;
    private JButton buttonPrintResultArray;
    private JLabel inputLabel;
    private JLabel outputLabel;

    public Frame() {

        setTitle("The position of the required element is determining from the given array:");
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
        setBounds(550, 300, 500, 300);

        buttonPrintResultArray.addActionListener(new ControllerButtonResult(inputArrayTextField, indexResultTextField));
    }
}
