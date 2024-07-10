package Adapter;
import java.awt.*;
import java.awt.event.*;
public class WindowAdapterExample {
    Frame f;
    WindowAdapterExample(){
       f= new Frame("Window Adapter");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        WindowAdapterExample wae=new WindowAdapterExample();
    }
}
