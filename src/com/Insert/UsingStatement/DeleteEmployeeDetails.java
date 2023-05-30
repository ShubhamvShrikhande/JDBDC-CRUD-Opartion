package com.Insert.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEmployeeDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseOpartion","root","root");
			PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, 3); 
			int i = ps.executeUpdate();

			System.out.println("Record deleted." + i);

			con.close();
			ps.close();
		}

		catch (Exception e) {
			e.getMessage();
		}
	}
}
