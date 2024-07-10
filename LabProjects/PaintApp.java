package LabProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintApp extends JFrame {

    private Color currentColor = Color.BLACK;
    private int currentThickness = 3;
    private String currentTool = "Pencil";

    private JPanel drawingArea;
    private JButton colorPickerButton;
    private JButton pencilButton;
    private JButton eraserButton;
    private JButton clearButton;

    public PaintApp() {
        setTitle("Paint App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        drawingArea = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
        };
        drawingArea.setBackground(Color.WHITE);
        drawingArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Implement drawing logic here
            }
        });
        drawingArea.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Implement drawing logic here
            }
        });

        colorPickerButton = new JButton("Color Picker");
        colorPickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentColor = JColorChooser.showDialog(PaintApp.this, "Choose Color", currentColor);
            }
        });

        pencilButton = new JButton("Pencil");
        pencilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentTool = "Pencil";
            }
        });

        eraserButton = new JButton("Eraser");
        eraserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentTool = "Eraser";
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement clear drawing area logic here
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(colorPickerButton);
        controlPanel.add(pencilButton);
        controlPanel.add(eraserButton);
        controlPanel.add(clearButton);

        setLayout(new BorderLayout());
        add(drawingArea, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PaintApp paintApp = new PaintApp();
                paintApp.setVisible(true);
            }
        });
    }
}
