package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultSets {
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
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("name"));
//			System.out.println(rs.getString("gender"));
			for(int i = 1;i<=5;i++) {
				String a = rs.getString(i);
				System.out.print(a +" ");
			}
			System.out.println();
			
			
			
			
			//basic syntax
			//fetch person id
//			
//			int id = rs.getInt("id");
//			System.out.println(id);
			
			//fetch name
//			String n =rs.getString("name");
//			System.out.println(n);
//			
			
			//use columninderxing
			
//			String s=rs.getString(2);
//			System.out.println(s);
			
//			int id = rs.getInt("id");
//			String n = rs.getString("name");
//			String c =rs.getString("class");
//			int m = rs.getInt("marks");
//			String g= rs.getString("gender");
//			
//			System.out.println(id+" "+n+" "+c+" "+m+" "+g);
			
			
		}
	
	}
}




//this is another way of doing the same output

/*package java_database;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class HandlingResultSet {
	public static void main(String[] args) {
		
		
		try {
			//Connect to database - use psaDB (SQL)
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");
		
			
			//Write & execute SQl query
			Statement stmnt =  con.createStatement();
			
			//stmnt.executeUpdate("INSERT INTO registration (name, gmail, phone_no) VALUES ('aman', 'adam@gmail.com', '9632629555')");
			
			//execute the queries
			String selectquery="select * from registration;";
			
			ResultSet rs=stmnt.executeQuery(selectquery);
			
			//while(rs.next()) {
				//basic syntax for resultset
				
				//int id=rs.getInt("id");
				//System.out.println(id);
				
				
				//String fname=rs.getString("name");
				//System.out.println(fname);
				
				
//we can use column indexing
				//int id=rs.getInt(1);
			//	System.out.println(id);
				
				//String fname=rs.getString(2);
				//System.out.println(fname);
				
							
				
			//}
			
			while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gmail = rs.getString("gmail");
                String mobileno = rs.getString("phone_no");
 
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Gmail: " + gmail);
                System.out.println("Mobile No: " + mobileno);
                System.out.println("----------------------------");
            }
			//Close database connection
			con.close();	
			
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		
	}
 
}
 */
