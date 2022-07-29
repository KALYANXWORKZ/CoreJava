package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume", "root","1BE18CV411");
		System.out.println(connection);


//		String insert = "INSERT INTO PERFUME.COMPANY_INFO VALUES(2,'AXE','PERFUME',200,'CHOCOLATE')";
//		
//		Statement statement = connection.createStatement();
//		int noOfRows = statement.executeUpdate(insert);
//		System.out.println(noOfRows);

		String DELETE ="	DELETE FROM PERFUME.COMPANY_INFO WHERE PRICE = 200";
		Statement statement = connection.createStatement();
		int noOfRows = statement.executeUpdate(DELETE);
		System.out.println(noOfRows);
	}

}
