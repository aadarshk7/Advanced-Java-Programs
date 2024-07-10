package AWT;

import java.awt.*;

public class ButtonDemo1 extends Frame {
    public ButtonDemo1() {

        this.setSize(600, 300);
        this.setTitle("Demo1");
        this.setVisible(true);
        this.setLayout(null);
        //this.setBounds(100,100,150,50);
//     Font f=new Font("Consolas",Font.BOLD,15);
//       this.setFont(f);
        Button b = new Button();
        b.setLabel("Submit");
       // b.setBounds(100, 100, 150, 50);
        //Button b2 = new Button("Cancel");
        //b2.setBounds(300,100, 150, 50);
        this.add(b);
        //this.add(b2);
//        System.out.println(b.getLabel());
        //System.out.println("canceled");
    }

    public static void main(String args[]) {
        ButtonDemo1 bd = new ButtonDemo1();

    }


}
