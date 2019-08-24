/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.app;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author yasin
 */
public class ChatWindow extends JFrame {

    private JTextArea area;
    private JTextField field;
    private JPanel panel, panel2;

    public ChatWindow(ChatObserve chatObserve, String name) throws HeadlessException {
        setTitle(name);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 300);
        area = new JTextArea(12, 25);
        area.setBounds(17, 10, 250, 190);

        field = new JTextField();
        field.setBounds(17, 220, 250, 27);
        field.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                text += name + " : " + field.getText();
                for (ChatWindow window : ChatObserve.windows) {
                    window.area.setText(text + "\n");
                    window.field.setText(null);
                }
            }
        });

        add(field);
        add(area);
    }
}
