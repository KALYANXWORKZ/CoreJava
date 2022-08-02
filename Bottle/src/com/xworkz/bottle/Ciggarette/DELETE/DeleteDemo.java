package com.xworkz.bottle.Ciggarette.DELETE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constants.DBProperties;

public class DeleteDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		String delete = "delete from cigarette.store where name = 'menthol'";
		Statement st = con.createStatement();

		int rowAffected = st.executeUpdate(delete);
	System.out.println(rowAffected);
	}
}
