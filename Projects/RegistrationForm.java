package Projects;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class RegistrationForm extends Frame
{
    TextField t,email1,nm1,enrollment_no1,address1,password1;
    Checkbox hobby1,hobby2,hobby3,hobby4,hobby5,male,female,Other,ce,me,ec;
    CheckboxGroup gender1,branch1;
    Button signup;
    Choice clg1;
    Label nm,enrollment_no,address,email,password,hobby,gender,branch,clg;
    Button b1;
    public RegistrationForm()
    {

        setTitle("RegsrationForm");
        setBackground(Color.cyan);
        setSize(353,350);
        setVisible(true);

        setLayout(new FlowLayout());

        nm=new Label("Enter Name");
        add(nm);
        nm1=new TextField(20);
        add(nm1);

        enrollment_no=new Label("Enter Your Enrollment No");
        add(enrollment_no);
        enrollment_no1=new TextField(18);
        add(enrollment_no1);

        address=new Label("Enter Your Address");
        add(address);
        address1=new TextField(20);
        add(address1);

        hobby=new Label("Select Your Hobby");
        add(hobby);
        hobby1=new Checkbox("Coding");
        hobby2=new Checkbox("Study");
        hobby3=new Checkbox("Programming");
        hobby4=new Checkbox("photography");
        hobby5=new Checkbox("Cricket");
        add(hobby1);
        add(hobby2);
        add(hobby3);
        add(hobby4);
        add(hobby5);

        gender=new Label("Select Your Gender");
        add(gender);
        gender1=new CheckboxGroup();
        male=new Checkbox("Male",gender1,false);
        female=new Checkbox("Female",gender1,false);
        Other=new Checkbox("Other",gender1,false);
        add(male);
        add(female);

        branch=new Label("Select Branch");
        add(branch);
        branch1=new CheckboxGroup();
        ce=new Checkbox("CE.",branch1,false);
        me=new Checkbox("Mech",branch1,false);
        ec=new Checkbox("EC",branch1,false);
        add(ce);
        add(me);
        add(ec);

        clg=new Label("Select Your Collage");
        add(clg);
        clg1=new Choice();
        clg1.add("GTU");
        clg1.add("MSU");
        clg1.add("LD Engg");
        clg1.add("NIRMA");
        add(clg1);

        email=new Label("Enter Your email");
        add(email);
        email1=new TextField(20);
        add(email1);

        password=new Label("Enter Your Password");
        add(password);
        password1=new TextField(20);
        password1.setEchoChar('*');
        add(password1);

        signup=new Button("Sign Up Now");
        add(signup);

    }
    public static void main(String s[])
    {
        RegistrationForm r1=new RegistrationForm();
    }

}

//<applet code="RegistrationForm.class" height=355 width=350></applet>