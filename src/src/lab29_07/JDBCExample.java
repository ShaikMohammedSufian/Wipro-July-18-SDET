package lab29_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbURL = "jdbc:mysql://localhost:3306/companydb";
        String username = "root";
        String password = "tiger";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        //create table
        
       /* String createTable = "CREATE TABLE employees("+"id int ,"+"name varchar(15),"+"department varchar(30),"+"salary int)";
        Statement st = con.createStatement();
        st.executeUpdate(createTable);
        
        System.out.println("table is created");
        //insert values
        
        String insertQuery = "INSERT INTO employees(id,name,department,salary)VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(insertQuery);
        
        //first data
        
        ps.setInt(1, 101);
        ps.setString(2, "Alice");
        ps.setString(3, "HR");
        ps.setInt(4, 50000);
        ps.executeUpdate();
        
        
        //second data
        
        ps.setInt(1, 102);
        ps.setString(2, "Bob");
        ps.setString(3, "IT");
        ps.setInt(4, 65000);
        ps.executeUpdate();
        
        //third data
        
        ps.setInt(1, 103);
        ps.setString(2, "Charlie");
        ps.setString(3, "Sales");
        ps.setInt(4, 60000);
        ps.executeUpdate();
        
        System.out.println("Data is inserted");
        
        */
        //select all employees
        
        Statement st1 = con.createStatement();
        String select = "SELECT * FROM Employees";
        ResultSet rsAll = st1.executeQuery(select);
        while(rsAll.next()) {
        	 System.out.println("ID: " + rsAll.getInt("id"));
             System.out.println("Name: " + rsAll.getString("name"));
             System.out.println("Department: " + rsAll.getString("department"));
             System.out.println("Salary: " + rsAll.getInt("salary"));
             System.out.println("----------------------------");
        }
        
        
        // SELECT * FROM employees WHERE id = 102;
        System.out.println("id 102");
        Statement st2 = con.createStatement();
        String where = "SELECT * FROM Employees WHERE id = 102";
        ResultSet rsid = st2.executeQuery(where);
        while (rsid.next()) {
        	System.out.println("ID: " + rsid.getInt("id"));
            System.out.println("Name: " + rsid.getString("name"));
            System.out.println("----------------------------");
        }
        
        //SELECT * FROM employees WHERE department = 'IT';

        //System.out.println(" IT DEPARTMENT");
        String dept="SELECT * FROM employees WHERE department = ?";
        PreparedStatement psd = con.prepareStatement(dept);
        psd.setString(1, "IT");
        ResultSet rsd = psd.executeQuery();
        while(rsd.next()) {
        	 System.out.println("ID: " + rsd.getInt("id"));
             System.out.println("Name: " + rsd.getString("name"));
             System.out.println("Department: " + rsd.getString("department"));
             System.out.println("----------------------------");
        
        }
        //UPDATE employees SET salary = 70000 WHERE id = 102;
        //Statement st3 =con.createStatement();
        String update = "UPDATE employees SET salary = ? WHERE id = ?";
        PreparedStatement psu=con.prepareStatement(update);
        psu.setInt(1, 70000);
        psu.setInt(2, 102);
        psu.executeUpdate();//updated
        
        String select1 = "SELECT * FROM employees WHERE id = ?";
        PreparedStatement pss = con.prepareStatement(select1);
        pss.setInt(1, 102);
        ResultSet rsu = pss.executeQuery();
        while(rsu.next()) {
        	 System.out.println("ID: " + rsu.getInt("id"));
             System.out.println("Name: " + rsu.getString("name"));
             System.out.println("Department: " + rsu.getString("department"));
             System.out.println("Salary: " + rsu.getInt("salary"));
             System.out.println("----------------------------");
        }
        System.out.println("UPDATE FINANCE");
        String Dept = "UPDATE employees SET department = ? WHERE name = ?";
        PreparedStatement psDept = con.prepareStatement(Dept);
        psDept.setString(1, "Finance");
        psDept.setString(2, "Alice");
        psDept.executeUpdate();
        
        String select2 = "SELECT * FROM employees WHERE name = ?";
        PreparedStatement pss2=con.prepareStatement(select2);
        pss2.setString(1, "Alice");
        ResultSet rss=pss2.executeQuery();
        while(rss.next()) {
       	 System.out.println("ID: " + rss.getInt("id"));
            System.out.println("Name: " + rss.getString("name"));
            System.out.println("Department: " + rss.getString("department"));
            System.out.println("Salary: " + rss.getInt("salary"));
            System.out.println("----------------------------");
       }
        System.out.println("DELETE 103");
        
        String delete = "DELETE FROM employees WHERE id = ?";
        PreparedStatement psDelete = con.prepareStatement(delete);
        psDelete.setInt(1, 103);
        psDelete.executeUpdate();
        
        
        String select3 = "SELECT * FROM employees WHERE id = ?";
        PreparedStatement psde=con.prepareStatement(select3);
        psde.setInt(1, 103);
        ResultSet rsde=psde.executeQuery();
        while(rsde.next()) {
       	 System.out.println("ID: " + rsde.getInt("id"));
         System.out.println("Name: " + rsde.getString("name"));
         System.out.println("Department: " + rsde.getString("department"));
         System.out.println("Salary: " + rsde.getInt("salary"));
         System.out.println("----------------------------");
        }
        System.out.println("no data will be printed becuase 103 is deleted in here");
        
        System.out.println("FINAL DATA IN EMPLOYEES TABLE:");

        String finalSelect = "SELECT * FROM employees";
        Statement St = con.createStatement();
        ResultSet finalRs = St.executeQuery(finalSelect);

        while (finalRs.next()) {
            System.out.println("ID: " + finalRs.getInt("id"));
            System.out.println("Name: " + finalRs.getString("name"));
            System.out.println("Department: " + finalRs.getString("department"));
            System.out.println("Salary: " + finalRs.getInt("salary"));
            
        }
 
        
}
}
