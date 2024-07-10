package Projects;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {
    Label l1, l2;
    TextField tf1, tf2;
    Button b1;

    LoginForm() {
        setLayout(new FlowLayout());

        l1 = new Label("Username: ");
        l2 = new Label("Password: ");
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf2.setEchoChar('*');
        b1 = new Button("Login");

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

        b1.addActionListener(this);

        setTitle("Hospital Login Form");
        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = tf1.getText();
            String password = tf2.getText();

            if (username.equals("admin") && password.equals("password")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
