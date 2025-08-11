package lab29_07;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertQuery {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbURL = "jdbc:mysql://localhost:3306/studentrepo";
        String username = "root";
        String password = "tiger";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // Insert new student
        String insert = "INSERT INTO Students (id, name, class, marks, gender) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement insertPs = con.prepareStatement(insert);
        insertPs.setInt(1, 11); // ID must be unique
        insertPs.setString(2, "Lisa");
        insertPs.setString(3, "Five");
        insertPs.setInt(4, 82);
        insertPs.setString(5, "female");

        insertPs.executeUpdate(); // execute the insert with update

        //  select the student
        String Query = "SELECT * FROM Students WHERE id = ?";
        PreparedStatement Ps = con.prepareStatement(Query);
        Ps.setInt(1, 11);

        ResultSet rs = Ps.executeQuery(); // execute the SELECT

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Class: " + rs.getString("class"));
            System.out.println("Marks: " + rs.getInt("marks"));
            System.out.println("Gender: " + rs.getString("gender"));     
        }
    }
}
