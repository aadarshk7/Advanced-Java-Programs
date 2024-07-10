package LabProjects;


import java.applet.Applet;
import java.awt.*;

public class FormApplet extends Applet {

    private Label nameLabel, emailLabel, passwordLabel;
    private TextField nameField, emailField, passwordField;
    private Button submitButton;

    public void init() {
        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        passwordLabel = new Label("Password:");
        nameField = new TextField(20);
        emailField = new TextField(20);
        passwordField = new TextField(20);
        submitButton = new Button("Submit");

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);
    }

    public void paint(Graphics g) {
    }
}