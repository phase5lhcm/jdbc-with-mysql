package com.simplilearn.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * -Load the driver, paying close attention to the load source for sql version
 * -Establish the connection via the DriverManager
 * -Create a statement
 * -Execute and collect results
 * -Close all connections
 * (See Program1.java class)
 * 
 * 
 */

public class BasicConnectivity {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		DriverManager.getConnection(url, user, ""); // I did not set a password on my root
		System.out.println("Connection established");
	}

}
