package org.example;

import javax.swing.*;
public class HelloGui {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("HelloGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
}
