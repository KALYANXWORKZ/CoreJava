package com.xworkz.bottle.Ciggarette.READ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constants.DBProperties;

public class ReadDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		String sql ="Select * from cigarette.store where name = 'menthol'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		boolean result = rs.next();
		System.out.println(result);

		if(result) {
			int pid = rs.getInt(1);
			System.out.println(pid);
			//	String name = rs.getString(2);
			//	System.out.println(name);
			int price = rs.getInt(3);
			System.out.println(price);
			String color = rs.getString(4);
			System.out.println(color);
			String tc = rs.getString(5);
			System.out.println(tc);

		}
		else 
		{
			System.out.println("Table details not founs");
		}

	}
}
