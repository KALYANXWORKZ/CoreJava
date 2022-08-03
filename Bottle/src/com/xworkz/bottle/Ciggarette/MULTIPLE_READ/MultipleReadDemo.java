package com.xworkz.bottle.Ciggarette.MULTIPLE_READ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.bottle.constants.DBProperties;

public class MultipleReadDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		String sql ="select * from cigarette.store";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		AtomicInteger auto = new AtomicInteger();

		while(rs.next()) {
			auto.incrementAndGet();

			int pid = rs.getInt(1);
			System.out.println(pid);
			String name = rs.getString(2);
			System.out.println(name);
			int price = rs.getInt(3);
			System.out.println(price);
			String color = rs.getString(4);
			System.out.println(color);
			String tc = rs.getString(5);
			System.out.println(tc);
			
			System.out.println(pid+" "+name+" "+price+" "+color+" "+tc);
		}
  
		System.out.println(auto.get());
	}
}
