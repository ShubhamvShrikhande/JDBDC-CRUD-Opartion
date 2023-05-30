package com.Insert.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveEmployeeDetails {
	/*
	 * Program for retrieve the student data using prepared statements.
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseOpartion", "root",
					"root");
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println("ID=" + rs.getInt(1));
				System.out.println("firstName=" + rs.getString(2));
				System.out.println("lastName=" + rs.getString(3));
				System.out.println("Address=" + rs.getString(4));
				System.out.println("City=" + rs.getString(5));
				System.out.println("Salary=" + rs.getString(6));

			}

			con.close();
			ps.close();
			rs.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
