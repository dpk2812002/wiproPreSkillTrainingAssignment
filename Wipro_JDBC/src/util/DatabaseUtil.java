package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	public static Connection getConnection() {
		
		Connection con= null;
		
		 try {
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "root");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return con;	
	}
}
