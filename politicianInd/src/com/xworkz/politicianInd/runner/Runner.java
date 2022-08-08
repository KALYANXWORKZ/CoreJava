package com.xworkz.politicianInd.runner;

import com.xworkz.politicianInd.constants.PartyNameProperties;
import com.xworkz.politicianInd.constants.PartySymbolProperties;
import com.xworkz.politicianInd.constants.PresidentProperties;
import com.xworkz.politicianInd.dao.PoliticianIndDAO;
import com.xworkz.politicianInd.dao.PoliticianIndDAOImpl;
import com.xworkz.politicianInd.dto.PoliticianIndDTO;

public class Runner {

	public static void main(String[] args) {
//		PoliticianIndDTO dto = new PoliticianIndDTO(1, "Kalyan", PartyNameProperties.AAP, 
//				PresidentProperties.ARVINDKEJRIWAL,
//				100, 20000000.00D, PartySymbolProperties.BROOM, "Delhi", "Delhi");
//		PoliticianIndDAO dao = new PoliticianIndDAOImpl();
//	//	dao.save(dto);
//		
//		PoliticianIndDTO dto1 = new PoliticianIndDTO(2, "RUPESH", PartyNameProperties.BJP, 
//				PresidentProperties.JPNADDA,
//				200, 30000000.00D, PartySymbolProperties.LOTUS, "Delhi", "Delhi");
//		PoliticianIndDAO dao1 = new PoliticianIndDAOImpl();
//	//	dao.save(dto1);
//		
//		PoliticianIndDTO dto2 = new PoliticianIndDTO(3, "ABHI", PartyNameProperties.INC, 
//				PresidentProperties.SONIAGANDHI,
//				100, 20000000.00D, PartySymbolProperties.HAND, "Delhi", "Delhi");
//		PoliticianIndDAO dao2 = new PoliticianIndDAOImpl();
//	//	dao.save(dto2);
//		
//		PoliticianIndDTO dto3 = new PoliticianIndDTO(4, "DARSHAN", PartyNameProperties.PK, 
//				PresidentProperties.UPENDRA,
//				100, 20000000.00D, PartySymbolProperties.AUTO, "Bangalore", "Bangalore");
//		PoliticianIndDAO dao3 = new PoliticianIndDAOImpl();
//	//	dao.save(dto3);
//		
//		PoliticianIndDTO dto4 = new PoliticianIndDTO(5, "Nandesh", PartyNameProperties.CPI,
//				PresidentProperties.DRAJA,
//				50, 20000000.00D, PartySymbolProperties.EAROFCORNSICKLE, "Mumbai", "Mumbai");
//	//	dao.save(dto4);
//
//		PoliticianIndDTO dto5 = new PoliticianIndDTO(6, "Arjun", PartyNameProperties.INC,
//				PresidentProperties.SONIAGANDHI,
//				180, 50000000.00D, PartySymbolProperties.HAND, "Delhi", "Delhi");
//		dao.save(dto5);
//
//		PoliticianIndDTO dto6 = new PoliticianIndDTO(7, "Raghu", PartyNameProperties.NCP,
//				PresidentProperties.SHARADPAWAR,
//				120, 60000000.00D, PartySymbolProperties.CLOCK, "Mumbai", "Mumbai");
//		dao.save(dto6);
//
//		PoliticianIndDTO dto7 = new PoliticianIndDTO(8, "Chandru", PartyNameProperties.NPP,
//				PresidentProperties.NANAAKUFOADDO,
//				200, 40000000.00D, PartySymbolProperties.BOOK, "Mumbai", "Mumbai");
//		dao.save(dto7);
//
//		PoliticianIndDTO dto8 = new PoliticianIndDTO(9, "Sachin", PartyNameProperties.PK,
//				PresidentProperties.UPENDRA,
//				30, 2000000.00D, PartySymbolProperties.AUTO, "Bengaluru", "Bengaluru");
//		dao.save(dto8);
//
//		PoliticianIndDTO dto9 = new PoliticianIndDTO(10, "Swati", PartyNameProperties.JDS,
//				PresidentProperties.DEVEGOWDA,
//				90, 350000000.00D, PartySymbolProperties.LADYFROMER, "Mandya", "Mandya");
//		dao.save(dto9);
		
//		PoliticianIndDTO id=dao.findById(1);
//		System.out.println(id);
//		System.out.println("====================================");

//		PoliticianIndDTO idAndPresident=dao.findBYIdAndPresident(1, "Kalyan");
//		System.out.println(idAndPresident);
//
//		System.out.println("======================================");
//
		PoliticianIndDTO idAndPresidentAndName=dao.findBYIdAndPresidentAndName(1, "ARVINDKEJRIWAL", "Kalyan");
	    System.out.println(idAndPresidentAndName);
//
//		System.out.println("***********************************");
//		PoliticianDTO idAndName	=dao.findBYIdAndName(8, "Chandru");
//		System.out.println(idAndName);
//
//		System.out.println("***********************************");
//		String name	=dao.findNameById(2);
//		System.out.println(name);
//
//		System.out.println("***********************************");
//		String president=dao.findPresidentByIdAndName(3, "Sunil");
//		System.out.println(president);
//
//		System.out.println("***********************************");
//		dao.getTotal();
//
//		System.out.println("***********************************");
//		String max=dao.findPartyByMaxMembers();
//		System.out.println(max);
//
//		System.out.println("***********************************");
//		List<PoliticianDTO> politician=dao.findAll();
//		System.out.println(politician);
//
//		System.out.println("=================================");
//		List<String> partyName=dao.findAllPartyName();
//		System.out.println(partyName);
//
//		System.out.println("====================================");
//		List<Integer>pid=dao.findAllIds();
//		System.out.println(pid);
//
//		System.out.println("=====================================");
//		List<Object>totalMembersAndtotalBudegtAndPartyName	=dao.findAllNoOfMembersAndTotalBudgetAndPartyName();
//		System.out.println(totalMembersAndtotalBudegtAndPartyName);



	}

}
