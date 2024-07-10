package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MyForm extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JFrame jf;
    JPanel p1,p2,p3;
    JTextField nameField,mailField,phoneField,ageField;
//    JPasswordField passwordField;
    JButton insert,update,delete,search;
    JButton updateName,updateMail,updatePhone,updateage;
    JLabel newName,newMail,newPhone,newAge;
    JTextField name,mail,phone,age;
    public MyForm() throws Exception{
        jf=new JFrame();
        setSize(1100,600);
        setTitle("Form simple");
        setLocation(100,100);
        setLayout(new BorderLayout());
        setResizable(false);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p3.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        add(p3,BorderLayout.CENTER);

        JLabel jLabel=new JLabel("LCC STUDENT RECORDS");
        p1.add(jLabel);

        b1=new JButton("Insert");
        b2=new JButton("Update");
        b3=new JButton("Delete");
        b4=new JButton("Search");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="Insert"){
            p3.removeAll();
            JPanel sp1=new JPanel();
            p3.setLayout(new BorderLayout());

            sp1.setLayout(new FlowLayout(FlowLayout.LEFT,500,12));


            JLabel name=new JLabel("Name");
            sp1.add(name);
            nameField=new JTextField(20);
            sp1.add(nameField);

            JLabel mail=new JLabel("Mail Id");
            sp1.add(mail);
            mailField=new JTextField(20);
            sp1.add(mailField);

            JLabel phone=new JLabel("Phone");
            sp1.add(phone);
            phoneField=new JTextField(20);
            sp1.add(phoneField);

            JLabel age=new JLabel("Age");
            sp1.add(age);
            ageField=new JTextField(20);
            sp1.add(ageField);

//            JLabel parentname=new JLabel("Parent's Name");
//            sp1.add(parentname);
//            parentField=new JTextField(20);
//            sp1.add(parentField);

//            JLabel password=new JLabel("Password");
//            sp1.add(password);
//            passwordField=new JPasswordField(20);
//            sp1.add(passwordField);


//            JLabel address=new JLabel("Address");
//            sp1.add(address);
//            addressField=new JTextField(20);
//            sp1.add(addressField);



//            JLabel course=new JLabel("Courses");
//            sp1.add(course);
//            courseField=new JTextField(20);
//            sp1.add(courseField);



            p3.add(sp1,BorderLayout.CENTER);
            setVisible(true);

            String Name=nameField.getText();
            String Mail=mailField.getText();
            int Phone=Integer.parseInt(phoneField.getText());
            int Age=Integer.parseInt(ageField.getText());
//            String Parentname=parentField.getText();
//            int Passwords=Integer.parseInt(passwordField.getText());
//            String Address=addressField.getText();

//            String Course=courseField.getText();


            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/myform";
                String username="root";
                String Password="";
                Connection connection= DriverManager.getConnection(url,username,Password);
                Statement stm= connection.createStatement();
                stm.executeUpdate("Insert into myallforms values('name','mail','phone','age')");
                System.out.println("Insert done");
                connection.close();
                JOptionPane.showMessageDialog(jf,"Record Inserted successfully","Insertion Complete",JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception x){
                System.out.println(x);
            }
        }
        if(e.getActionCommand()=="Update"){
            p3.removeAll();
            JPanel sp1=new JPanel();
            JPanel sp2=new JPanel();
            JPanel sp3=new JPanel();
            JPanel sp4=new JPanel();
            JPanel sp5=new JPanel();
            JPanel sp6=new JPanel();
            JPanel sp7=new JPanel();
            JPanel sp8=new JPanel();
            JPanel sp9=new JPanel();
            JPanel sp10=new JPanel();
            p3.setLayout(new BorderLayout());

            //update name
            updateName=new JButton("UName");
            updateage=new JButton("UAge");
//            updateParent=new JButton("UParent");
//            updatePassword=new JButton("UPassword");
//            updateAddress=new JButton("UAddress");
            updateMail=new JButton("UMail");
            updatePhone=new JButton("UPhone");
//            updateCourse=new JButton("UCourse");

            //level
            newName=new JLabel("Nname");
            newAge=new JLabel("Nage");
//            newParent=new JLabel("NPname");
//            newAddress=new JLabel("Naddress");
            newMail=new JLabel("Nmail");
            newPhone=new JLabel("Nphone");
//            newPassword=new JLabel("Npassword");
//            newCourse=new JLabel("Ncourse");
//            nameOfPerson=new JLabel("Name of Person");

            //textfield
            name=new JTextField(10);
            age=new JTextField(10);
//            parent=new JTextField(10);
//            password=new JTextField(10);
//            address=new JTextField(10);
            mail=new JTextField(10);
//            course=new JTextField(10);
            phone=new JTextField(10);
//            namePerson=new JTextField(20);

            sp1.setLayout(new FlowLayout(FlowLayout.CENTER,100,18));
            sp2.setLayout(new GridLayout(1,4));
            sp3.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp4.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp5.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp6.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp7.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp8.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp9.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));
            sp10.setLayout(new FlowLayout(FlowLayout.LEFT,5,18));

            sp1.setBorder(BorderFactory.createRaisedBevelBorder());
            sp2.setBorder(BorderFactory.createLoweredBevelBorder());
            sp3.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp4.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp5.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp6.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp7.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp8.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp9.setBorder(BorderFactory.createLineBorder(Color.RED));
            sp10.setBorder(BorderFactory.createLineBorder(Color.RED));

//            sp1.add(nameOfPerson);
//            sp1.add(namePerson);

            sp3.add(newName);
            sp3.add(name);
            sp3.add(updateName);
            sp4.add(newAge);
            sp4.add(age);
            sp4.add(updateage);
            sp9.add(newMail);
            sp9.add(mail);
            sp9.add(updateMail);
            sp10.add(newPhone);
            sp10.add(phone);
            sp10.add(updatePhone);

            updateName.addActionListener(this);
            updateage.addActionListener(this);
            updateMail.addActionListener(this);
            updatePhone.addActionListener(this);

            sp2.add(sp3);
            sp2.add(sp4);
            sp2.add(sp5);
            sp2.add(sp6);
            sp2.add(sp7);
            sp2.add(sp8);
            sp2.add(sp9);
            sp2.add(sp10);
            p3.add(sp1,BorderLayout.NORTH);
            p3.add(sp2,BorderLayout.CENTER);
            setVisible(true);
        }
    }
    public static void main(String []args) throws Exception{
        MyForm form=new MyForm();
    }
}