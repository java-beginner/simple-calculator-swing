package com.java_beginner.simple_calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 簡易電卓
 * ボタンパネルクラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class PanelOfButtons extends JPanel {

    private JButton[] buttons;

    public PanelOfButtons() {
        super();

        setLayout(new GridLayout(
                Constants.APP_SETTING_BUTTONS_GRID_ROWS,
                Constants.APP_SETTING_BUTTONS_GRID_COLS
                ));

        // ラベルが空文字でないものをカウントし、その分のボタン配列を生成する。
        int totalButtons = 0;
        for (String label : Constants.LABELS_ON_GRID) {
            if (!label.isEmpty()) {
                totalButtons ++;
            }
        }
        buttons = new JButton[totalButtons];

        // ラベル（空文字のダミー）とボタンを配置する。
        int indexOfButtons = 0;
        for (String label : Constants.LABELS_ON_GRID) {
            if (!label.isEmpty()) {
                JButton b = new JButton(label);
                buttons[indexOfButtons++] = b;
                b.setActionCommand(label);
                add(b);
            } else {
                add(new JLabel(label));
            }
        }

    }

    public JButton[] getButtons() {
        return buttons;
    }

}
