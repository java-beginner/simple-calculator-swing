package com.java_beginner.simple_calculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 簡易電卓
 * ディスプレイパネルクラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class PanelOfTextFields extends JPanel {

    private JTextField textFieldFormula;

    private JTextField textFieldValue;

    public PanelOfTextFields() {
        super();

        setLayout(new GridLayout(
                Constants.APP_SETTING_TEXTFIELDS_GRID_ROWS,
                Constants.APP_SETTING_TEXTFIELDS_GRID_COLS
                ));

        // 式
        JPanel panelFormula = new JPanel(new FlowLayout());
        panelFormula.add(new JLabel(Constants.LABEL_OF_TEXTFIELD_FORMULA));
        textFieldFormula = new JTextField(Constants.APP_SETTING_TEXTFIELD_FORMULA_LENGTH);
        panelFormula.add(textFieldFormula);
        add(panelFormula);

        // 値
        JPanel panelResult = new JPanel(new FlowLayout());
        panelResult.add(new JLabel(Constants.LABEL_OF_TEXTFIELD_VALUE));
        textFieldValue = new JTextField(Constants.APP_SETTING_TEXTFIELDS_VALUE_LENGTH);
        textFieldValue.setEditable(false);
        textFieldValue.setBackground(Color.WHITE);
        panelResult.add(textFieldValue);
        add(panelResult);
    }

    public JTextField getTextFieldFormula() {
        return textFieldFormula;
    }

    public JTextField getTextFieldValue() {
        return textFieldValue;
    }

}
