package ru.vsu.cs.gui.controller;

import ru.vsu.cs.common.FindRequiredElementIndex;
import ru.vsu.cs.gui.utils.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerButtonResult implements ActionListener {

    JTextField inputArrayTextField;
    JTextField indexResultTextField;

    public ControllerButtonResult(JTextField inputArrayTextField, JTextField indexResultTextField) {
        this.inputArrayTextField = inputArrayTextField;
        this.indexResultTextField = indexResultTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String readArrayOfDigits = inputArrayTextField.getText();
        int[] arrayOfDigits = ArrayUtils.toIntArray(readArrayOfDigits);
        int indexOfRequiredElement = FindRequiredElementIndex.findRequiredElementIndex(arrayOfDigits);
        indexResultTextField.setText(String.valueOf(indexOfRequiredElement));
    }
}