package jdbcproj;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/juhu";
			String username="root";
			String password="poonam";
			con= DriverManager.getConnection(url,username,password);
			Statement s=con.createStatement();
			s.execute("create table student(rno int primary key,name varchar(35),marks int,birth_date DATE)");
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		} 
	}


