package jdbcproj;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Inserdatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/juhu";
			String username="root";
			String password="poonam";
			con= DriverManager.getConnection(url,username,password);
			Statement s=con.createStatement();
			int i=s.executeUpdate("insert into student values(102,'Shiv',70,'1997-06-27'),(103,'Shivram',90,'1992-06-09')");
			con.close();
			System.out.println(i+"record added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
