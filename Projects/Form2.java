package Projects;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form2 extends Frame {
    Form2() {
        // Frame f=new Frame();
        Label firstName = new Label("first name");
        firstName.setBounds(20, 50, 80, 20);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label lastname = new Label("lastname");
        lastname.setBounds(20, 80, 80, 20);
        Label dateofbirth = new Label("dateofbirth");
        dateofbirth.setBounds(20, 110, 80, 20);
        TextField firstnameTF = new TextField();
        firstnameTF.setBounds(120, 50, 100, 20);
        TextField lastnameTF = new TextField();
        lastnameTF.setBounds(120, 80, 100, 20);
        TextField dateofbirthTF = new TextField();
        dateofbirthTF.setBounds(120, 110, 100, 20);
        Button submit = new Button("submit");
        submit.setBounds(20, 160, 100, 30);
        Button reset = new Button("reset");
        reset.setBounds(120, 160, 100, 30);
        add(firstName);
        add(lastname);
        add(dateofbirth);
        add(firstnameTF);
        add(lastnameTF);
        add(dateofbirthTF);
        add(submit);
        add(reset);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]) {
        Form2 f = new Form2();
    }
}