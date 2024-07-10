package Projects;
import java.sql.*;
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CRUDform extends JFrame{
    private JTextField idField;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField ageField;
    private JButton insertButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton loadButton;

    private Connection connection;
    public CRUDform() {
        initializeGUI();
        connectToDatabase();
    }

    private void initializeGUI() {
        setTitle("CRUD Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        idField = new JTextField(10);
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        loadButton = new JButton("Search");

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addData();
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
        add(insertButton);
        add(updateButton);
        add(deleteButton);
        add(loadButton);


        setVisible(true);
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/myform";
            String username = "root";
            String password = "";
          Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception occured");
        }
    }

    private void addData() {
        String id = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();

        try {
            String sql = "INSERT INTO myallforms (id, name, email) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.executeUpdate();
            System.out.println("Data added successfully!");
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
            System.out.println("Exception occured in Update operation "+e);
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
            System.out.println("Exception occured in Delete operation "+e);
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
            System.out.println("Exception occured in Load operation "+e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CRUDform();
            }
        });
    }
}
