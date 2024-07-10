package JDBC;

import java.sql.*;

public class JDBC1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select * from student");
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
        connection.close();
    }
}
