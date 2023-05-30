package com.Insert.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	// Program for insert the student data using statement through JDBC.
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			String sql = "insert into user(lastName,firstName,Address,City,Salary)"+ "values('pawar','ram','sangavi','pune',5000)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseOpartion", "root",
					"root");
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("Insertion successfully...");
			con.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
