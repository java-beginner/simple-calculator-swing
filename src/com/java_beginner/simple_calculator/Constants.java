package com.java_beginner.simple_calculator;

/**
 * 簡易電卓
 * 定数クラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Constants {

    /* アプリケーションの設定 */
    /** タイトル */
    public static final String APP_SETTING_TITLE = "簡易電卓(Swing版)";

    /** 横 */
    public static final int APP_SETTING_WIDTH = 350;

    /** 縦 */
    public static final int APP_SETTING_HEIGHT = 250;

    /** テキストフィールド用グリッド行 */
    public static final int APP_SETTING_TEXTFIELDS_GRID_ROWS = 2;

    /** テキストフィールド用グリッド列 */
    public static final int APP_SETTING_TEXTFIELDS_GRID_COLS = 2;

    /** 式入力のテキストフィールドの長さ */
    public static final int APP_SETTING_TEXTFIELD_FORMULA_LENGTH = 15;

    /** 値出力テキストフィールドの長さ */
    public static final int APP_SETTING_TEXTFIELDS_VALUE_LENGTH = 15;

    /** ボタン用グリッド行 */
    public static final int APP_SETTING_BUTTONS_GRID_ROWS = 4;

    /** ボタン用グリッド列 */
    public static final int APP_SETTING_BUTTONS_GRID_COLS = 6;

    /** コピーライトHTML */
    public static final String APP_SETTING_COPYRIGHT_HTML = "Copyright 2016 <a href=\"http://java-beginner.com/\">Javaを復習する初心者</a>";

    /** コピーライトMIME */
    public static final String APP_SETTING_COPYRIGHT_MIME = "text/html";

    /** エラーメッセージ */
    public static final String APP_SETTING_ERROR_MSG = "結果がありませんでした。";

    /* 文字列 */
    /** 「null」 */
    public static final String STR_NULL = "null";

    /** 空文字 */
    public static final String STR_EMPTY = "";

    /* ラベル */
    /** 式を入力するテキストフィールドに対するラベル */
    public static final String LABEL_OF_TEXTFIELD_FORMULA = "式";

    /** 結果を出力するテキストフィールドに対するラベル */
    public static final String LABEL_OF_TEXTFIELD_VALUE = "値";

    /** 0 */
    public static final String LABEL_ZERO = "0";

    /** 1 */
    public static final String LABEL_ONE = "1";

    /** 2 */
    public static final String LABEL_TWO = "2";

    /** 3 */
    public static final String LABEL_THREE = "3";

    /** 4 */
    public static final String LABEL_FOUR = "4";

    /** 5 */
    public static final String LABEL_FIVE = "5";

    /** 6 */
    public static final String LABEL_SIX = "6";

    /** 7 */
    public static final String LABEL_SEVEN = "7";

    /** 8 */
    public static final String LABEL_EIGHT = "8";

    /** 9 */
    public static final String LABEL_NINE = "9";

    /** + */
    public static final String LABEL_PLUS = "+";

    /** - */
    public static final String LABEL_MINUS = "-";

    /** * */
    public static final String LABEL_MULT = "*";

    /** / */
    public static final String LABEL_DIV = "/";

    /** % */
    public static final String LABEL_REM = "%";

    /** = */
    public static final String LABEL_EQ = "=";

    /** ( */
    public static final String LABEL_BRACKET_LEFT = "(";

    /** ) */
    public static final String LABEL_BRACKET_RIGHT = ")";

    /** C */
    public static final String LABEL_CLEAR = "C";

    /** ラベルのグリッド上配置 */
    public static final String[]  LABELS_ON_GRID = {
            LABEL_ONE,   LABEL_TWO,   LABEL_THREE, LABEL_PLUS,  LABEL_MULT, LABEL_BRACKET_LEFT,
            LABEL_FOUR,  LABEL_FIVE,  LABEL_SIX,   LABEL_MINUS, LABEL_DIV,  LABEL_BRACKET_RIGHT,
            LABEL_SEVEN, LABEL_EIGHT, LABEL_NINE,  STR_EMPTY,   LABEL_REM,  STR_EMPTY,
            STR_EMPTY,   STR_EMPTY,   LABEL_ZERO,  STR_EMPTY,   LABEL_EQ,   LABEL_CLEAR
        };

    /** 出力対象のラベル */
    public static final String[] OUTPUT_TARGET_LABELS = {
            LABEL_ZERO,
            LABEL_ONE,
            LABEL_TWO,
            LABEL_THREE,
            LABEL_FOUR,
            LABEL_FIVE,
            LABEL_SIX,
            LABEL_SEVEN,
            LABEL_EIGHT,
            LABEL_NINE,
            LABEL_PLUS,
            LABEL_MINUS,
            LABEL_MULT,
            LABEL_DIV,
            LABEL_REM,
            LABEL_BRACKET_LEFT,
            LABEL_BRACKET_RIGHT
            };

    /* スクリプトエンジン用 */
    /** 簡略名 */
    public static final String SCRIPTENGINE_SHORT_NAME = "JavaScript";

    /** 評価用フォーマット */
    public static final String SCRIPTENGINE_FORMAT_FOR_EVALUATION = "var value = eval(\"%s\");";
}
