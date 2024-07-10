package Projects;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GymFormV2 extends Frame {
    GymFormV2() {
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(620, 600);
        Label area = new Label("Online Gym Registration Form");
        area.setBackground(Color.CYAN);
        area.setBounds(200, 20, 185, 40);

        //For Fonts
//        Font fn=new Font("Arial",Font.PLAIN,13);
        Font fn = new Font("TimesRoman", Font.ITALIC, 13);
//        setFont(new Font("TimesRoman", Font.ITALIC,13));
        setFont(fn);
// For Name
        Label l = new Label("FirstName:");
        l.setBounds(20, 70, 80, 20);
        TextField tf = new TextField();
        tf.setBounds(100, 70, 90, 20);
        Label l2 = new Label("MiddleName:");
        l2.setBounds(210, 70, 80, 20);
        TextField tf2 = new TextField();
        tf2.setBounds(300, 70, 90, 20);
        Label l3 = new Label("LastName:");
        l3.setBounds(400, 70, 80, 20);
        TextField tf3 = new TextField();
        tf3.setBounds(480, 70, 90, 20);
        //For date of Birth
        Label dateofbirth = new Label("DateOfBirth:");
        dateofbirth.setBounds(20, 110, 80, 20);
        TextField dateofbirth1 = new TextField();
        dateofbirth1.setBounds(100, 110, 90, 20);
        //For Gender
        Label gender = new Label("Gender:");
        gender.setBounds(210, 110, 80, 20);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox gender1 = new Checkbox("Male", false, cbg);
        gender1.setBounds(290, 110, 100, 20);
        Checkbox gender2 = new Checkbox("Female", cbg, false);
        gender2.setBounds(400, 110, 100, 20);
        Checkbox gender3 = new Checkbox("Others", cbg, false);
        gender3.setBounds(510, 110, 100, 20);
        //For Address
        Label address = new Label("Address:");
        address.setBounds(20, 150, 80, 20);
        TextField address1 = new TextField();
        address1.setBounds(100, 150, 90, 20);
        //For Phone
        Label number = new Label("Number:");
        number.setBounds(210, 150, 80, 20);
        TextField number1 = new TextField();
        number1.setBounds(290, 150, 90, 20);
        //For Email
        Label email = new Label("Email:");
        email.setBounds(400, 150, 80, 20);
        TextField email1 = new TextField();
        email1.setBounds(480, 150, 90, 20);
        //For Schedule
        Label schedule = new Label("Schedule:");
        CheckboxGroup cbg2 = new CheckboxGroup();
        schedule.setBounds(20, 190, 80, 20);
        Checkbox schedule1 = new Checkbox("Morning- 6:00am to 7:00am", cbg2, false);
        schedule1.setBounds(100, 190, 180, 20);
        Checkbox schedule2 = new Checkbox("Morning- 7:00am to 8:00am", cbg2, false);
        schedule2.setBounds(100, 210, 180, 20);
        Checkbox schedule3 = new Checkbox("Afternoon- 4:00pm tp 5:00pm", cbg2, false);
        schedule3.setBounds(100, 230, 180, 20);
        Checkbox schedule4 = new Checkbox("Afternoon- 5:00pm tp 6:00pm", cbg2, false);
        schedule4.setBounds(100, 250, 180, 20);
        //Class Level
        Label type = new Label("Class Level:");
        CheckboxGroup cbg3 = new CheckboxGroup();
        type.setBounds(20, 290, 80, 20);
        Checkbox type1 = new Checkbox("Level 1- Beginner Class", cbg3, false);
        type1.setBounds(100, 290, 180, 20);
        Checkbox type2 = new Checkbox("Level 2- Intermediate Class", cbg3, false);
        type2.setBounds(100, 310, 180, 20);
        Checkbox type3 = new Checkbox("Level 3- Advanced Class", cbg3, false);
        type3.setBounds(100, 330, 180, 20);
        Checkbox type4 = new Checkbox("All Level Class", cbg3, false);
        type4.setBounds(100, 350, 180, 20);
        //Packages
        Label packages = new Label("Packages:");
//        packages.setBackground(Color.);
        CheckboxGroup cbg4 = new CheckboxGroup();
        packages.setBounds(20, 390, 80, 20);
        Checkbox packages1 = new Checkbox("Rs.1500 for 1 month", cbg4, false);
        packages1.setBounds(100, 390, 180, 20);
        Checkbox packages2 = new Checkbox("Rs.4000 for 3 months", cbg4, false);
        packages2.setBounds(100, 410, 180, 20);
        Checkbox packages3 = new Checkbox("Rs.8000 for 6 months", cbg4, false);
        packages3.setBounds(100, 430, 180, 20);
        Checkbox packages4 = new Checkbox("Rs.16500 for 12 months", cbg4, false);
        packages4.setBounds(100, 450, 180, 20);
        //Submit and Reset
        Button submit = new Button("Submit");
        submit.setBounds(160, 500, 100, 30);
        submit.setBackground(Color.green);
        Button reset = new Button("Reset");
        reset.setBounds(290, 500, 100, 30);
        reset.setBackground(Color.red);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.add(area);
        this.add(l);
        this.add(tf);
        this.add(l2);
        this.add(tf2);
        this.add(l3);
        this.add(tf3);
        this.add(dateofbirth);
        this.add(dateofbirth1);
        this.add(gender);
        this.add(gender1);
        this.add(gender2);
        this.add(gender3);
        this.add(address);
        this.add(address1);
        this.add(number);
        this.add(number1);
        this.add(email);
        this.add(email1);
        this.add(schedule);
        this.add(schedule1);
        this.add(schedule2);
        this.add(schedule3);
        this.add(schedule4);
        this.add(type);
        this.add(type1);
        this.add(type2);
        this.add(type3);
        this.add(type4);
        this.add(packages);
        this.add(packages1);
        this.add(packages2);
        this.add(packages3);
        this.add(packages4);
        this.add(submit);
        this.add(reset);
    }

    public static void main(String[] args) {

        new GymFormV2();
    }
}
//© Adarsha Kunwar
