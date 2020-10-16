package jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectdata {

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
			ResultSet i=s.executeQuery("select rno,name,marks,birth_date from student ");
			while(i.next()) {
				
				
				String name=i.getString("name");
				System.out.println(name+"\n");
			}
			con.close();
			System.out.println(i+"record show");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	private static int getint(int rno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
