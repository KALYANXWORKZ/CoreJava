package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStarterExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/Lipstick_Info", "root","1BE18CV411");
		System.out.println(connection);

	   String sql = "select * from Lipstick_Info ";
	   
	   Statement statement = connection.createStatement();
	   ResultSet resultSet = statement.executeQuery(sql);
	   System.out.println(resultSet);
	   
	            boolean returnresultset = resultSet.next();
	            
	            int pid = resultSet.getInt("pid");
	            System.out.println();
		
	}

}
