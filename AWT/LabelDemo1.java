package AWT;
import java.awt.*;
public class LabelDemo1 extends Frame{
    LabelDemo1(){
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(600,300);
        Label l=new Label();
        l.setText("My Name is Aadarsh Kunwar");
        l.setBounds(100,100,200,50);
        this.add(l);
        Label l1=new Label();
        l1.setText("I am 20 years old");
        l1.setBounds(300,100,150,50);
        this.add(l1);


    }

    public static void main(String[] args) {
        LabelDemo1 lm1=new LabelDemo1();
    }
}
