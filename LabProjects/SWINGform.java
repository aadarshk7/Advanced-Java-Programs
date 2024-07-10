package LabProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SWINGform extends JFrame implements ActionListener {
    private JLabel usernameLabel, passwordLabel, messageLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public SWINGform() {
        // Set up the form properties
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        messageLabel = new JLabel("");

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Add components to the form
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button clicks and login verification
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Perform login verification (dummy check for demonstration)
            if (username.equals("user123") && password.equals("pass123")) {
                messageLabel.setText("Login successful!");
            } else {
                messageLabel.setText("Invalid username or password.");
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the login form
        SWINGform loginForm = new SWINGform();
        loginForm.setVisible(true);
    }
}