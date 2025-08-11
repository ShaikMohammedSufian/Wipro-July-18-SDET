package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

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
		
		Statement st = con.createStatement();
		
		//execute the queries
		
		String selectquery = "select * from Students;";
		
		//pass the selectquery to resultset
		
		ResultSet rs = st.executeQuery(selectquery);
		
		//result set in jdbc is object 
		
		while(rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("gender"));
		}
	
	}
	
}


