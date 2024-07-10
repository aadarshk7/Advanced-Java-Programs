package LabProjects;

import java.sql.*;

public class CRUDjdbc {
    // JDBC driver and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";

    // Database credentials
    static final String USER = "your_mysql_username";
    static final String PASS = "your_mysql_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Perform CRUD operations here

            // Example 1: Insert a record
            insertRecord(conn, "John Doe", "john@example.com", "Male");

            // Example 2: Retrieve records
            retrieveRecords(conn);

            // Example 3: Update a record
            updateRecord(conn, 1, "Jane Smith", "jane@example.com", "Female");

            // Example 4: Delete a record
            deleteRecord(conn, 2);

            // Clean-up environment
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Helper methods for CRUD operations
    private static void insertRecord(Connection conn, String name, String email, String gender) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            String sql = "INSERT INTO users (name, email, gender) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, gender);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        } finally {
            if (pstmt != null) pstmt.close();
        }
    }

    private static void retrieveRecords(Connection conn) throws SQLException {
        Statement stmt = null;
        try {
            String sql = "SELECT * FROM users";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Gender: " + gender);
            }
        } finally {
            if (stmt != null) stmt.close();
        }
    }

    private static void updateRecord(Connection conn, int id, String name, String email, String gender) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE users SET name=?, email=?, gender=? WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, gender);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            System.out.println("Record with ID " + id + " updated successfully.");
        } finally {
            if (pstmt != null) pstmt.close();
        }
    }

    private static void deleteRecord(Connection conn, int id) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            String sql = "DELETE FROM users WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Record with ID " + id + " deleted successfully.");
        } finally {
            if (pstmt != null) pstmt.close();
        }
    }
}
