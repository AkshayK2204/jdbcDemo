import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate-schema", "root", "rootpass");

            Statement statement = con.createStatement();
            String query = "SELECT  * FROM EMPLOYEE WHERE SALARY>50000";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString("FirstName"));
                System.out.print(" ");
                System.out.println(rs.getString("LastName"));

            }
        }
        catch (SQLException e) {
        e.printStackTrace();
    }
}}

