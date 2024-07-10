package AWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListExample {
    ListExample(){
        Frame f= new Frame();
        List l= new List(5);
        l.setBounds(100,100,95,75);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        l.add("item1");
        l.add("item2");
        l.add("item3");
        l.add("item4");
        l.add("item5");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new ListExample();
    }

}
