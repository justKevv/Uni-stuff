package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextArea result;
    private JPanel panel1;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton division;
    private JButton a3Button;
    private JButton a0Button;
    private JButton comma;
    private JButton multiply;
    private JButton subtraction;
    private JButton addition;
    private JButton equals;

    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";

    public Calculator() {
        // Initialize components
        result = new JTextArea(3, 20);
        result.setEditable(false);
        panel1 = new JPanel();
        a7Button = new JButton("7");
        a8Button = new JButton("8");
        a9Button = new JButton("9");
        a4Button = new JButton("4");
        a5Button = new JButton("5");
        a6Button = new JButton("6");
        a1Button = new JButton("1");
        a2Button = new JButton("2");
        a3Button = new JButton("3");
        a0Button = new JButton("0");
        comma = new JButton(".");
        division = new JButton("/");
        multiply = new JButton("*");
        subtraction = new JButton("-");
        addition = new JButton("+");
        equals = new JButton("=");

        // Set layout manager
        panel1.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add buttons to buttonPanel
        buttonPanel.add(a7Button);
        buttonPanel.add(a8Button);
        buttonPanel.add(a9Button);
        buttonPanel.add(division);
        buttonPanel.add(a4Button);
        buttonPanel.add(a5Button);
        buttonPanel.add(a6Button);
        buttonPanel.add(multiply);
        buttonPanel.add(a1Button);
        buttonPanel.add(a2Button);
        buttonPanel.add(a3Button);
        buttonPanel.add(subtraction);
        buttonPanel.add(a0Button);
        buttonPanel.add(comma);
        buttonPanel.add(equals);
        buttonPanel.add(addition);

        // Add components to panel1
        panel1.add(new JScrollPane(result), BorderLayout.NORTH);
        panel1.add(buttonPanel, BorderLayout.CENTER);

        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                result.append(source.getText());
            }
        };

        a0Button.addActionListener(numberListener);
        a1Button.addActionListener(numberListener);
        a2Button.addActionListener(numberListener);
        a3Button.addActionListener(numberListener);
        a4Button.addActionListener(numberListener);
        a5Button.addActionListener(numberListener);
        a6Button.addActionListener(numberListener);
        a7Button.addActionListener(numberListener);
        a8Button.addActionListener(numberListener);
        a9Button.addActionListener(numberListener);
        comma.addActionListener(numberListener);

        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                num1 = Double.parseDouble(result.getText());
                operator = source.getText();
                result.setText("");
            }
        };

        addition.addActionListener(operatorListener);
        subtraction.addActionListener(operatorListener);
        multiply.addActionListener(operatorListener);
        division.addActionListener(operatorListener);

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(result.getText());
                double output = 0;
                switch (operator) {
                    case "+":
                        output = num1 + num2;
                        break;
                    case "-":
                        output = num1 - num2;
                        break;
                    case "*":
                        output = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            output = num1 / num2;
                        } else {
                            result.setText("Error");
                            return;
                        }
                        break;
                }
                result.setText(String.valueOf(output));
            }
        });
    }

    public static void main(String[] args) {
        try {
            new Calculator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}