package com.xworkz.bottle.Ciggarette.INSERT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constants.DBProperties;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		String insert = "insert into cigarette.store values(2,'KING_LIGHT',20,'WHITE',80)";
		String insert1 = "insert into cigarette.store values(3,'FLAKE',10,'BLACK',90)";
		String insert2 = "insert into cigarette.store values(4,'LIGHT',19,'WHITE',50)";
		String insert3 = "insert into cigarette.store values(5,'MENTHOL',18,'WHITE',100)";

		Statement st = con.createStatement();

		int rowAffected = st.executeUpdate(insert);
		int rowAffected1 = st.executeUpdate(insert1);
		int rowAffected2= st.executeUpdate(insert2);
		int rowAffected3 = st.executeUpdate(insert3);

		System.out.println(rowAffected);
		System.out.println(rowAffected1);
		System.out.println(rowAffected2);
		System.out.println(rowAffected3);


	}

}
