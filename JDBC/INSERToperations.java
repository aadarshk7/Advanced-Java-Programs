package JDBC;

import java.sql.*;

public class INSERToperations {
    public static void main(String[] args) throws Exception, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/myform","root","");
        PreparedStatement ps=conn.prepareStatement("insert into myallforms values('77','aadarshkunwar','akc@gmail.com')");
        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("Insert Success");
        } else{
            System.out.println("Fail");
        }
        conn.close();
    }
}
