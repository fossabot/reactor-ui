/*
 * Copyright 2016 Nebula Bay.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tascape.reactor.ui;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author linsong wang
 */
public class ViewerParameterDialog extends JDialog {

    public ViewerParameterDialog(String title) {
        super(new JDialog((Frame) null, title));
        super.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel jpContent = new JPanel(new BorderLayout());
        super.setContentPane(jpContent);
        jpContent.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public void setInfoPanel(JPanel info) {
        super.getContentPane().add(info, BorderLayout.PAGE_START);
    }

    public void setParameterPanel(JPanel parameter) {
        super.getContentPane().add(parameter, BorderLayout.CENTER);
    }

    public void setActionPanel(JPanel action) {
        super.getContentPane().add(action, BorderLayout.PAGE_END);
    }

    public void showDialog() {
        super.pack();
        super.setResizable(false);
        super.setAlwaysOnTop(true);
        super.setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        super.setVisible(true);
    }
}
