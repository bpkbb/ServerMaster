package my_project.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anwenderinterface {
    private JFrame fenster;
    private JTextField textField1;
    private JPanel mainPanel;
    private JButton closeButton;
    private JButton startButton;
    private JTextPane textPane1;

    public Anwenderinterface(){
        fenster = new JFrame("Ngre Server");
        fenster.setContentPane(mainPanel);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(false);
        fenster.setBounds(400,300,400,300);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public void setFensterVisible(boolean b){
        fenster.setVisible(b);
    }
}