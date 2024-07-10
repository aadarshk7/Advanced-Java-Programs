package AWT;
import java.awt.*;
public class MenuExample {
    MenuExample(){
        Frame f=new  Frame("Menu");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("MyMenu");
        Menu submenu=new Menu("MySubMenu");
        MenuItem i1=new MenuItem("Item1");
        MenuItem i2=new MenuItem("Item2");
        menu.add(i1);
        menu.add(i2);
        submenu.add(menu);
        menu.add(submenu);
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new MenuExample();
    }

}
