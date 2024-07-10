package JDBC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CRUDForm extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField emailField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton loadButton;

    private Connection connection;

    public CRUDForm() {
        initializeGUI();
        connectToDatabase();
    }

    private void initializeGUI() {
        setTitle("Java SQL Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        idField = new JTextField(10);
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        addButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        loadButton = new JButton("Search");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertData();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadData();
            }
        });

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(loadButton);
        pack();

        setVisible(true);
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/myform";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect with database");
        }
    }

    private void insertData() {
        String id = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();

        try {
            String sql = "INSERT INTO myallforms (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.executeUpdate();
            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void updateData() {
        String id = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();

        try {
            String sql = "UPDATE myallforms SET name=?, email=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, id);
            statement.executeUpdate();
            System.out.println("Data updated successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void deleteData() {
        String id = idField.getText();

        try {
            String sql = "DELETE FROM myallforms WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
            System.out.println("Data deleted successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void loadData() {
        String id = idField.getText();

        try {
            String sql = "SELECT * FROM myallforms WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                nameField.setText(resultSet.getString("name"));
                emailField.setText(resultSet.getString("email"));
            } else {
                nameField.setText("");
                emailField.setText("");
                System.out.println("No data found for the given ID!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

             CRUDForm cr= new CRUDForm();
    }
}
