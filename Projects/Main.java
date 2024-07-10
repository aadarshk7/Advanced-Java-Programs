package Projects;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the driver class.
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create a connection.
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                ""
        );

        // Create a statement.
        Statement statement = connection.createStatement();

        // Execute the query.
        ResultSet rs = statement.executeQuery("SELECT * FROM users");

        // Process the results.
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }

        // Close the connection.
        connection.close();
    }
}
