package Projects;

import java.sql.*;

public class jdbcinsert {
    public static void main(String[] args) {


        // Create a connection to the database
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Create an INSERT statement
            String sql = "INSERT INTO bidhyarthi (faculty, college,age,email) VALUES ('BIM', 'lcc','20','aadarshkunwar8@gmail')";

            // Execute the statement
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows affected: " + rowsAffected);
            // Close the connection
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        // Print the number of rows affected

    }
}
