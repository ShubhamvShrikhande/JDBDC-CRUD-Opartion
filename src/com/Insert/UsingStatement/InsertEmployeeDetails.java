package com.Insert.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
import java.util.Scanner;


public class InsertEmployeeDetails {
	/*
	 * Program for insert the student data using prepared statement.
	 */

	public void insertDetails(String firstName, String lastName, String Address, String City, String Salary) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseOpartion", "root",
					"root");
			PreparedStatement ps = con.prepareStatement("insert into employee(firstName,lastName,Address,City,Salary)values(?,?,?,?,?)");
			ps.setString(1, firstName);
			ps.setString(2,  lastName);
			ps.setString(3, Address);
			ps.setString(4, City);
			ps.setString(5, Salary);
			int i = ps.executeUpdate();
			System.out.println("record inserted successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter First Name");
			String LastName = sc.next();
			System.out.println("Enter Last name ");
			String FirstName = sc.next();
			System.out.println("Enter Address");
			String Address = sc.next();
			System.out.println("Enter City");
			String City = sc.next();
			System.out.println("Enter salary");
			String Salary = sc.next();

			InsertEmployeeDetails emp = new InsertEmployeeDetails();
			emp.insertDetails(LastName, FirstName, Address, City, Salary);
		}

	}

}
