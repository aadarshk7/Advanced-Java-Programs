package AWT;

import java.awt.*;
import java.awt.event.*;

public class ScrollbarExample {
    // class constructor
    ScrollbarExample() {
        // creating a Frame with a title
        Frame f = new Frame("Scrollbar Example");

        // creating a final object of Label
        final Label label = new Label();

        // setting alignment and size of label object
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        // creating a final object of Scrollbar class
        final Scrollbar s = new Scrollbar();

        // setting the position of scroll bar
        s.setBounds(100, 100, 50, 100);

        // adding Scrollbar and Label to the Frame
        f.add(s);
        f.add(label);

        // setting the size, layout, and visibility of frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // adding AdjustmentListener to the scrollbar object
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:"+ s.getValue());
            }
        });
    }

    // main method
    public static void main(String args[]){
        new ScrollbarExample();
    }
}