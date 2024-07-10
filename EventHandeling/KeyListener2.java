package EventHandeling;

// importing the necessary libraries

import java.awt.*;
import java.awt.event.*;

// class which inherits Frame class and implements KeyListener2 interface
public class KeyListener2 extends Frame implements KeyListener {
    // object of Label and TextArea
    Label l;
    TextArea area;

    // class constructor
    KeyListener2() {
        Button b= new Button("CLick me");
        b.setBounds(100,100,100,100);
        // creating the label
        l = new Label();
// setting the location of label
        l.setBounds(20, 50, 200, 20);
// creating the text area
        area = new TextArea();
// setting location of text area
        area.setBounds(20, 80, 300, 300);
// adding KeyListener2 to the text area
        area.addKeyListener(this);
        // adding label and text area to frame
        add(l);
        add(area);
// setting size, layout and visibility of frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // even if we do not define the interface methods, we need to override them
    public void keyPressed(KeyEvent e) {
    }

    // overriding the keyReleased() method of KeyListener2 interface
    public void keyReleased(KeyEvent e) {
// defining a string which is fetched by the getText() method of TextArea class
        String text = area.getText();
// splitting the string in words
        String words[] = text.split("\\s");
// printing the number of words and characters of the string
        l.setText("Words: " + words.length + " Characters:" + text.length());
    }

    public void keyTyped(KeyEvent e) {
    }

    // main method
    public static void main(String[] args) {
        new KeyListener2();
    }
}