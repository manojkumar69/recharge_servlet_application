package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	private static Connection connection = null;

	public static Connection getConnection() throws Exception {
		if (connection != null)
			return connection;
		else {
			// Store the database URL in a string
			String serverName = "localhost";
			String portNumber = "3306";
			String dbUrl = "jdbc:mysql://"+serverName+":"+portNumber+"/data";
			Class.forName("com.mysql.jdbc.Driver");

			// set the url, username and password for the databse
			connection = DriverManager.getConnection(dbUrl, "root", "1234");
			return connection;
		}
	}
}