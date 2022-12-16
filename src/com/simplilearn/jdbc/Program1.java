package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Program1 {
	private static Connection con;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		con = DriverManager.getConnection(url, user, ""); // I did not set a password on my root
		System.out.println("Connection established");
		
		String sql = "Create database simpli_check1"; //creates new db
		int x = con.createStatement().executeUpdate(sql);
		
		if(x > 0) {
			System.out.println("Database created");
		} else {
			System.out.println("Database not created");
		}
		
		con.close();
	}

}
