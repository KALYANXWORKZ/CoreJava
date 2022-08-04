package com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.CONSTANTS.MysqlProperties;
import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DTO.BarDTO;

public class BarDAOImpl implements BarDAO {

	@Override
	public boolean save(BarDTO barDTO) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(MysqlProperties.URL.getValue(),
					MysqlProperties.USERNAME.getValue(),MysqlProperties.SECRET.getValue());

			String insert = "insert into pub.bar_info values("+barDTO.getId()+",'"+barDTO.getName()+
					"','"+barDTO.getLocation()+"','"+barDTO.getType().getName()+"','"
					+barDTO.getAvgCollectionPerDay()+","+barDTO.getCollectionPerMonth()+")";

			Statement st = con.createStatement();

			int rowAffected = st.executeUpdate(insert);
			System.out.println(rowAffected);

			if(rowAffected>0) {
				System.out.println("Data is Saved"+insert);
			}
			else {
				System.out.println("Data is not Saved");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}


