package Projects;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form extends Frame {
    Form() {
//TextArea area=new TextArea("Online Hospital Registration form");
//area.setBounds(10,30,50,50);

        // Frame f=new Frame();
        Label UserName = new Label("Name");
        UserName.setBounds(20, 50, 80, 20);

        Label Password = new Label("Id");
        Password.setBounds(20, 80, 80, 20);
        Label email=new Label("email");
        email.setBounds(20,110,80,20);
        Label age=new Label("age");
        age.setBounds(20,140,80,20);
        Label phone=new Label("phone");
        phone.setBounds(20,170,80,20);
//        Label dateofbirth = new Label("dateofbirth");
//        dateofbirth.setBounds(20, 110, 80, 20);
        TextField UserNameTF = new TextField();
        UserNameTF.setBounds(120, 50, 100, 20);
        TextField PasswordTF = new TextField();
        PasswordTF.setBounds(120, 80, 100, 20);
        TextField emailtf=new TextField();
        emailtf.setBounds(120,110,100,20);
        TextField agetf = new TextField();
        agetf.setBounds(120, 140, 100, 20);
        TextField phonetf = new TextField();
        phonetf.setBounds(120, 170, 100, 20);
        //operations

        Button Login = new Button("INSERT");
        Login.setBounds(20, 210, 90, 20);
        Button Signup = new Button("UPDATE");
        Signup.setBounds(120, 210, 90, 20);
        Button delete = new Button("DELETE");
        delete.setBounds(220, 210, 90, 20);
        Button drop = new Button("DROP");
        drop.setBounds(320, 210, 90, 20);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(UserName);
        add(Password);
        add(email);
        add(age);
        add(phone);
//        add(dateofbirth);
        add(UserNameTF);
        add(PasswordTF);
        add(emailtf);
        add(agetf);
        add(phonetf);
//        add(dateofbirthTF);
        add(Login);
        add(Signup);
        add(delete);
        add(drop);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]) {
        Form f = new Form();
    }
}