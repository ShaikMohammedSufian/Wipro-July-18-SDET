package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;


public class PreparedStatements {
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		//fetch the dbURL,username,password of mysql db
		String dbURL = "jdbc:mysql://localhost:3306/studentrepo";
		String username = "root";
		String password = "tiger";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//load my sql driver files
		
		// the line Class.forName("com.mysql.cj.jdbc.Driver"); it is used to explicitely load and register the mysql jdbc driver within
		
		//create a connection to the database - connecting database to java application
		
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		//create the statement obj
		
		
		
		//execute the queries
		
		String query = "select * from Students WHERE name = ?;";
		PreparedStatement ps = con.prepareStatement(query);
		//pass the selectquery to resultset
		ps.setString(1, "Arnold");
		
		ResultSet rs = ps.executeQuery();
		
		//result set in jdbc is object 
		while (rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("gender"));
		}
		System.out.println("------------------------");
		//hardcoded query
		
		String query1 = "select * from Students where marks=? and gender = ?";
		PreparedStatement ps1 = con.prepareStatement(query1);
		//set parameters
		ps1.setInt(1, 60);
		ps1.setString(2, "female");

		ResultSet rs1 = ps1.executeQuery();
		
		//result set in jdbc is object 
		while (rs1.next()) {
			System.out.println(rs1.getString("name"));
			System.out.println(rs1.getString("gender"));
		
		}
	}
}
