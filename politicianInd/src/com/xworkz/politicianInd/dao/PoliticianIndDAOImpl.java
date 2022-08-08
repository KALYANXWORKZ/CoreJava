package com.xworkz.politicianInd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.politicianInd.constants.MySqlProperties.URL;
import static com.xworkz.politicianInd.constants.MySqlProperties.USERNAME;
import static com.xworkz.politicianInd.constants.MySqlProperties.SECRET;

import com.xworkz.politicianInd.constants.PartyNameProperties;
import com.xworkz.politicianInd.constants.PartySymbolProperties;
import com.xworkz.politicianInd.constants.PresidentProperties;
import com.xworkz.politicianInd.dto.PoliticianIndDTO;

public class PoliticianIndDAOImpl implements PoliticianIndDAO {

	@Override
	public boolean save(PoliticianIndDTO dto) {
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insertSql = "insert into politician.politician_info value(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, dto.getPId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getPartyname().getName());
			statement.setString(4, dto.getPresident().getPresident());
			statement.setInt(5, dto.getTotalMember());
			statement.setDouble(6, dto.getTotalBudget());
			statement.setString(7, dto.getPartySymbol().getBySymbol());
			statement.setString(8, dto.getLocation());
			statement.setString(9, dto.getHeadQuater());
			int rowsAffected = statement.executeUpdate();
			System.out.println(rowsAffected);
			return rowsAffected > 0 ? true : false;
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianIndDTO findById(int id) {
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(),
					USERNAME.getValue(), SECRET.getValue());
			String insertSql = "insert into politician.politician_info value(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Integer pk = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMemebres = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headquater = resultSet.getString(9);
				PoliticianIndDTO politicianDTO = new PoliticianIndDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(name);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyName));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMemebres);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headquater);
				return politicianDTO;
			}
			} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

		return null;
	}

	@Override
	public PoliticianIndDTO findBYIdAndPresident(int id, String president) {
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(), 
					USERNAME.getValue(), SECRET.getValue());
			
			String selectSql = "SELECT * FROM politician.politician_info where pid=? and president=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			statement.setString(2, president);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Integer pk = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headQuater = resultSet.getString(9);
				PoliticianIndDTO politicianIndDTO = new PoliticianIndDTO();
				politicianIndDTO.setPId(pk);
				politicianIndDTO.setName(name);
				politicianIndDTO.setPartyname(PartyNameProperties.getByValue(partyName));
				politicianIndDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianIndDTO.setTotalMember(totalMember);
				politicianIndDTO.setTotalBudget(totalBudget);
				politicianIndDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymbol));
				politicianIndDTO.setLocation(location);
				politicianIndDTO.setHeadQuater(headQuater);
				return politicianIndDTO;
			}
		}
				
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
	
	@Override
	public PoliticianIndDTO findBYIdAndPresidentAndName(int id, String president, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "Select * from politician.politician_info where pid=? and president=? and name=?";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			statament.setString(2, president);
			statament.setString(3, name);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				Integer pk = resultSet.getInt(1);
				String names = resultSet.getString(2);
				String partyname = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymabol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headQuater = resultSet.getString(9);
				PoliticianIndDTO politicianDTO = new PoliticianIndDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(names);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyname));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMember);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymabol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headQuater);
				return politicianDTO;		
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

	@Override
	public PoliticianIndDTO findBYIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPresidentByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findPartyByMaxMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
