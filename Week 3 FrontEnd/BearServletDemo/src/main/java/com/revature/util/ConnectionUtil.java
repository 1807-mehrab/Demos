package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException, IOException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		return DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe", 
			"beardb", 
			"p4ssw0rd");
	}
}
