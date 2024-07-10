package AWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample extends Frame{
    ChoiceExample(){
//        Frame f=new Frame();
        Label l=new Label("Courses");
        l.setBounds(25,60,75,75);
        Choice c=new Choice();
        c.add("Item1");
        c.add("Item2");
        c.add("Item3");
        c.setBounds(100,100,75,75);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(l);
        add(c);
        setTitle("hello");
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}