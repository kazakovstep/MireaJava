package lab15;

import java.awt.*;
import java.awt.event.*;

public class task1 {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        final TextField num1Field = new TextField();
        final TextField num2Field = new TextField();
        final TextField resultField = new TextField();

        num1Field.setBounds(50, 50, 100, 20);
        num2Field.setBounds(50, 80, 100, 20);
        resultField.setBounds(50, 110, 100, 20);
        resultField.setEditable(false);

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        addButton.setBounds(170, 50, 50, 20);
        subtractButton.setBounds(230, 50, 50, 20);
        multiplyButton.setBounds(170, 80, 50, 20);
        divideButton.setBounds(230, 80, 50, 20);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 * num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    if (num2 != 0) {
                        int result = num1 / num2;
                        resultField.setText(String.valueOf(result));
                    } else {
                        resultField.setText("Cannot divide by zero");
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        f.add(num1Field);
        f.add(num2Field);
        f.add(resultField);
        f.add(addButton);
        f.add(subtractButton);
        f.add(multiplyButton);
        f.add(divideButton);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
