package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	private static Connection connection = null;

	public static Connection getConnection() throws Exception {
		if (connection != null)
			return connection;
		else {
			String dbUrl = "jdbc:mysql://localhost/data";
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(dbUrl, "root", "1234");
			return connection;
		}
	}
}