package AWT;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends Frame {
    //constructor
     MyWindow() {
         // set window title
         super("My Window");

         // create button
         Button myButton = new Button("Click me!");
         myButton.setBounds(100, 100, 100, 100);
         // add button to window
         add(myButton);

         // set window size
         setSize(300, 200);

         // set window layout manager
         setTitle("Basic AWT");
          setLayout(null);
         //b.setLayout(new FlowLayout());
         // add window listener to handle window events

     }
    public static void main(String[] args) {
        // create new window
        MyWindow window = new MyWindow();

        // show window
        window.setVisible(true);
    }
}