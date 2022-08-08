package com.xworkz.politicianInd.dao;

import java.util.Collections;
import java.util.List;

import com.xworkz.politicianInd.dto.PoliticianIndDTO;

public interface PoliticianIndDAO {
	boolean save(PoliticianIndDTO dto);

	PoliticianIndDTO findById(int id);

	PoliticianIndDTO findBYIdAndPresident(int id, String president);

	PoliticianIndDTO findBYIdAndPresidentAndName(int id, String president, String name);

	PoliticianIndDTO findBYIdAndName(int id, String name);

	String findNameById(int id);

	String findPresidentByIdAndName(int id, String name);

	int getTotal();

	String findPartyByMaxMembers();

	default void test() {
		System.out.println("default impl of test");
	}

	default List<PoliticianIndDTO> findAll() {
		return Collections.EMPTY_LIST;
	}
		
      default List<String> findAllPartyName() {
		return null;
	}
      default List<Integer> findAllIds(){
		return null;
    	  
      }
      default List<Object> findAllNoOfMembersAndTotalBudgetAndPartyName(){
		return null;
    	  
      }

}


