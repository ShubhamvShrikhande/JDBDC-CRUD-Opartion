package com.Insert.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class UpdateEmployeeDetails {
	/*
	 * Program for update the student data using prepared statements.
	 */
	
	public static void main(String[] args) {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseOpartion","root","root");
	        PreparedStatement ps = con.prepareStatement("UPDATE employee SET firstName=?, lastName=?, Address=?, City=?, Salary=? where id=?");

	        ps.setString(1, "ashok");
	        ps.setString(2, "mh");
	        ps.setString(3, "pk");// Replace employeeId with the actual ID of the employee
            ps.setString(4, "mh");
            ps.setString(5, "67677");
            ps.setString(6, "1");
	        int i = ps.executeUpdate();

	        System.out.println("Record updated: " + i);

	        con.close();
	        ps.close();

	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
}







