package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button2;
    private JPanel panel;

    public MyInputForm(){
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton(){
        button = new JButton("Calculate Multiply");
        button2 = new JButton("Calculate Add");
        class MultiplyListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }
        }

        class AddListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil: " + c);
            }
        }


        button.addActionListener(new MultiplyListener());
        button2.addActionListener(new AddListener());

    }

    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
