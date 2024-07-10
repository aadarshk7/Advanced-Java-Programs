package AWT;
import java.awt.*;
public class ButtonDemofun extends Frame{
    //Button Example using inheritance
ButtonDemofun(){
    this.setVisible(true);
    this.setAlwaysOnTop(true);
    this.setSize(600,300);
    this.setTitle("Demo for fun");
    this.setLayout(null);
    Button b=new Button("Login");
    b.setBounds(100,100,100,50);
    this.add(b);
    Button b2=new Button("Signup");
    b2.setBounds(300,100,100,50);
    this.add(b2);
}

    public static void main(String[] args) {
        ButtonDemofun bdf = new ButtonDemofun();
    }
}
