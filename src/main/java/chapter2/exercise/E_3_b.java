package chapter2.exercise;

import javax.swing.JButton;

public class E_3_b {
    public static void main(String[] args) {
        JButton button = new JButton();
        button.addActionListener(event ->
                System.out.println(event.getActionCommand()));
    }
}
