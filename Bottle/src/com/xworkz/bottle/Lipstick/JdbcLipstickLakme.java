package com.xworkz.bottle.Lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLipstickLakme { 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/Lipstick_Info", "root","1BE18CV411");
		System.out.println(connection);

		// INSERT
		//		String insert ="INSERT INTO Lipstick_Info.Lipstic_Brands VALUES(2,'LAKME','200','PINK','GLOSSY')";
		//		Statement statement = connection.createStatement();
		//		int noOfRows =statement.executeUpdate(insert); 
		//		System.out.println(noOfRows);

		//		String insert ="INSERT INTO Lipstick_Info.Lipstic_Brands VALUES(3,'SUGAR','250','COFFEE','MAT')";
		//		Statement statement = connection.createStatement();
		//		int noOfRows =statement.executeUpdate(insert); 
		//		System.out.println(noOfRows);

		//		String insert ="INSERT INTO Lipstick_Info.Lipstic_Brands VALUES(4,'WET N WILD','300','DEEP RED','GLOSSY')";
		//		Statement statement = connection.createStatement();
		//		int noOfRows =statement.executeUpdate(insert); 
		//		System.out.println(noOfRows);
		//		
		        String insert ="INSERT INTO Lipstick_Info.Lipstic_Brands VALUES(5,'FACES CANADA','400','RUBY RED','GLOSSY')";
		        Statement statement = connection.createStatement();
	        	int noOfRows =statement.executeUpdate(insert); 
	        	System.out.println(noOfRows);

		//		String update = "UPDATE Lipstic_Brands SET PRICE = 600 WHERE Lipstick_Name ='sugar'";
		//		Statement statement = connection.createStatement();
		//		int noOfRows =statement.executeUpdate(update); 
		//		System.out.println(noOfRows);

		//		
		//		        String DELETE ="DELETE FROM Lipstick_Info.Lipstic_Brands WHERE PRICE = 400";
		//				Statement statement = connection.createStatement(); int noOfRows =
		//				statement.executeUpdate(DELETE); System.out.println(noOfRows);

	        	
	        	
	}
}