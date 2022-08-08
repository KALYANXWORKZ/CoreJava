package com.xworkz.politicianInd.dto;

import com.xworkz.politicianInd.constants.PartyNameProperties;
import com.xworkz.politicianInd.constants.PartySymbolProperties;
import com.xworkz.politicianInd.constants.PresidentProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoliticianIndDTO {
	private Integer pId;
	private   String name;
	private PartyNameProperties partyname=PartyNameProperties.AAP;
	private PresidentProperties president=PresidentProperties.ARVINDKEJRIWAL;
	private Integer totalMember;
	private Double totalBudget;
	private PartySymbolProperties partySymbol=PartySymbolProperties.BROOM;
	private String location;
	private String headQuater;
	

}
