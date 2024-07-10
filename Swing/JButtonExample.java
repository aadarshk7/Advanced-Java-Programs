package Swing;
import javax.swing.*;
public class JButtonExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("First Swing Example");
        JButton b=new JButton(new ImageIcon("C:\\Users\\aadar\\OneDrive\\Pictures\\coat6v2 (1).jpg"));
        b.setBounds(0,0,900,1000);
        f.add(b);
        f.setSize(900,900);
        f.setLayout(null);
        f.setVisible(true);
    }
}
