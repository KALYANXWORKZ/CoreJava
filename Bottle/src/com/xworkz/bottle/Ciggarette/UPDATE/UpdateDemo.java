package com.xworkz.bottle.Ciggarette.UPDATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constants.DBProperties;

public class UpdateDemo {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		String update = "update cigarette.store set color = 'BLACK' where name = 'menthol'";
		Statement st = con.createStatement();

		int rowAffected = st.executeUpdate(update);
	System.out.println(rowAffected);
	}
}