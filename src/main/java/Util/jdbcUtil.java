package Util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcUtil {
	public static Connection jdbcconnection() throws ClassNotFoundException, SQLException ,IOException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loading");
	//make the connection to the sql database(jdbc)
		  Connection connection=DriverManager.getConnection("jdbc:mysql:///library","Rahul","Rahul@123");
		  return connection;
	
	}
}
