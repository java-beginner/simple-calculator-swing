package com.java_beginner.simple_calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 簡易電卓
 * アクションイベントハンドラクラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class ActionHandler implements ActionListener {

    private JTextField textFieldFormula;

    private JTextField textFieldValue;

    private JButton[] buttons;

    private Component parentComponent;

    Evaluation evaluation = new Evaluation();

    public ActionHandler(Component parentComponent, PanelOfTextFields panelDisplay, PanelOfButtons panelButtons) {
        super();
        this.parentComponent = parentComponent;
        this.textFieldFormula = panelDisplay.getTextFieldFormula();
        this.textFieldValue = panelDisplay.getTextFieldValue();
        this.buttons = panelButtons.getButtons();

        for (JButton b : this.buttons) {
            b.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        // 0～9, +, -, *, /, %, (, )
        for (String label : Constants.OUTPUT_TARGET_LABELS) {
            if (label.equals(actionCommand)) {
                String s = textFieldFormula.getText();
                int pos = textFieldFormula.getCaretPosition();
                textFieldFormula.setText(s.substring(0, pos) + label + s.substring(pos));
                return;
            }
        }

        // =
        if (Constants.LABEL_EQ.equals(actionCommand)) {

            textFieldValue.setText(null);

            String formulaText = textFieldFormula.getText();

            // 空文字チェック
            if (formulaText.isEmpty()) {
                showDialog(Constants.APP_SETTING_ERROR_MSG_NOT_INPUT);
                return ;
            }

            // 入力チェック
            if (!formulaText.matches(Constants.PATTERN_FORMULA)) {
                showDialog(Constants.APP_SETTING_ERROR_MSG_UNNECESSARY);
                return ;
            }

            String value = evaluation.getValueOf(textFieldFormula.getText());
            if (value.isEmpty()) {
                showDialog(Constants.APP_SETTING_ERROR_MSG_NO_RESULT);
            }
            textFieldValue.setText(value);

        }

        // Clear
        if (Constants.LABEL_CLEAR.equals(actionCommand)) {
            textFieldFormula.setText(null);
            textFieldValue.setText(null);
        }

    }

    private void showDialog(String s) {

        JLabel label = new JLabel(s);
        label.setForeground(Color.RED);
        JOptionPane.showMessageDialog(parentComponent, label);

    }

}
