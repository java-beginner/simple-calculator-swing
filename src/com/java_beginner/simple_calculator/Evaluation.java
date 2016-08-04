package com.java_beginner.simple_calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 簡易電卓
 * 評価クラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Evaluation {

    public static String getValueOf(String formula) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName(Constants.SCRIPTENGINE_SHORT_NAME);
        try {
            engine.eval(String.format(Constants.SCRIPTENGINE_FORMAT_FOR_EVALUATION, formula));
        } catch (ScriptException e1) {
        }
        String value = String.valueOf(engine.get("value"));

        return value.equals(Constants.STR_NULL) ? Constants.STR_EMPTY : value;

    }

}
