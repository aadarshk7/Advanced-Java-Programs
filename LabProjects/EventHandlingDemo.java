import java.awt.event.*;
import java.awt.*;

public class EventHandlingDemo extends Frame implements ActionListener {

    private Label label;
    private TextField textField1;
    private TextField textField2;
    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonMultiply;
    private Button buttonDivide;

    public EventHandlingDemo() {
        label = new Label("Enter two numbers:");
        textField1 = new TextField(20);
        textField2 = new TextField(20);
        buttonAdd = new Button("Add");
        buttonSubtract = new Button("Subtract");
        buttonMultiply = new Button("Multiply");
        buttonDivide = new Button("Divide");

        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);

        add(label);
        add(textField1);
        add(textField2);
        add(buttonAdd);
        add(buttonSubtract);
        add(buttonMultiply);
        add(buttonDivide);

        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text1 = textField1.getText();
        String text2 = textField2.getText();
        int number1 = Integer.parseInt(text1);
        int number2 = Integer.parseInt(text2);

        if (e.getSource() == buttonAdd) {
            label.setText(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (e.getSource() == buttonSubtract) {
            label.setText(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (e.getSource() == buttonMultiply) {
            label.setText(number1 + " * " + number2 + " = " + (number1 * number2));
        } else if (e.getSource() == buttonDivide) {
            label.setText(number1 + " / " + number2 + " = " + (number1 / number2));
        }
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}