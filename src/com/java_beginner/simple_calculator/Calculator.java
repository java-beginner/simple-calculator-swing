package com.java_beginner.simple_calculator;

import java.awt.FlowLayout;

import javax.swing.JFrame;

/**
 * 簡易電卓
 * 起動クラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(Constants.APP_SETTING_TITLE);
        frame.setSize(Constants.APP_SETTING_WIDTH, Constants.APP_SETTING_HEIGHT);
        frame.setResizable(false);

        // 各コンポーネント生成
        PanelOfTextFields panelDisplay = new PanelOfTextFields();
        PanelOfButtons panelButtons = new PanelOfButtons();
        PanelOfCopyright panelOfCopyright = new PanelOfCopyright();

        // アクションリスナー
        new ActionHandler(frame, panelDisplay, panelButtons);

        // 各コンポーネント配置
        frame.setLayout(new FlowLayout());
        frame.add(panelDisplay);
        frame.add(panelButtons);
        frame.add(panelOfCopyright);

        // 表示
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
