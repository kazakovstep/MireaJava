package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task3 extends JFrame {
    private JTextField serviceField;
    private JTextField usernameField;
    private JTextField passwordField;
    private JLabel resultLabel;

    public task3() {
        setTitle("Проверка пароля");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel serviceLabel = new JLabel("Сервис:");
        serviceField = new JTextField(20);
        JLabel usernameLabel = new JLabel("Имя пользователя:");
        usernameField = new JTextField(20);
        JLabel password = new JLabel("Пароль:");
        passwordField = new JTextField(20);

        passwordPanel.add(serviceLabel);
        passwordPanel.add(serviceField);
        passwordPanel.add(usernameLabel);
        passwordPanel.add(usernameField);
        passwordPanel.add(password);
        passwordPanel.add(passwordField);

        resultLabel = new JLabel();
        mainPanel.add(passwordPanel, BorderLayout.CENTER);
        mainPanel.add(resultLabel, BorderLayout.SOUTH);

        JButton checkButton = new JButton("Проверить");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText();
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (checkPassword(password)) {
                    resultLabel.setText("Пароль допустим для " + service + " пользователь " + username);
                    resultLabel.setForeground(Color.GREEN);
                } else {
                    resultLabel.setText("Пароль недопустим для " + service + " пользователь " + username);
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        mainPanel.add(checkButton, BorderLayout.PAGE_END);

        add(mainPanel);
    }

    private boolean checkPassword(String password) {
        return password.length() > 5;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                task3 passwordChecker = new task3();
                passwordChecker.setVisible(true);
            }
        });
    }
}