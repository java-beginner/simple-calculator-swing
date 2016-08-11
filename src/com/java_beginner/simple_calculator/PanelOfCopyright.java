package com.java_beginner.simple_calculator;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent.EventType;

/**
 * 簡易電卓 コピーライトクラス
 *
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class PanelOfCopyright extends JPanel {

    public PanelOfCopyright() {
        super();

        JEditorPane jEditorPane = new JEditorPane(Constants.APP_SETTING_COPYRIGHT_MIME,
                Constants.APP_SETTING_COPYRIGHT_HTML);
        jEditorPane.setEditable(false);
        jEditorPane.setOpaque(false);
        jEditorPane.addHyperlinkListener(e -> {
            if (e.getEventType() == EventType.ACTIVATED) {
                URL url = e.getURL();
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(url.toURI());
                } catch (IOException e1) {
                } catch (URISyntaxException e1) {
                }
            }
        });

        add(jEditorPane);

    }
}
