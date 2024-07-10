package AWT;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ButtonDemo2 {
  Frame f;
  Button b1,b2,b3;
    ButtonDemo2(){
        f=new Frame("Using button");
       b1=new Button();

        b2=new Button("Submit");
        b3=new Button();
        b3.setLabel("Cancel");
        f.setVisible(true);
      f.setSize(600,300);
      f.add(b1);
      f.add(b2);
      f.add(b3);
      f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        ButtonDemo2 bd2=new ButtonDemo2();

    }
}
