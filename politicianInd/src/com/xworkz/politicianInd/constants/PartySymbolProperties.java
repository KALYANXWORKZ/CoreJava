package com.xworkz.politicianInd.constants;

public enum PartySymbolProperties {
	TWOFLOWERSWITHGRASS("Two Flowers with grass"),
	ELEPHANT("Elephant"),
	LOTUS("Lotus"),
	EAROFCORNSICKLE("Earofcornsickle"), HAND("Hand"), CLOCK("Clock"), BOOK("Book"),
	AUTO("Auto"), LADYFROMER("LadyFromer"), BROOM("Broom"),DEFAULT("NA");

	private String symbol;

	private PartySymbolProperties(String symbol) {
		this.symbol=symbol;

	}
	public String getBySymbol() {
		return symbol;
	}
	public static PartySymbolProperties getByValue(String Value) {
		PartySymbolProperties[] partySymbolProperties=PartySymbolProperties.values();
		for(PartySymbolProperties partySymbolProperties2:partySymbolProperties) {
			if(partySymbolProperties2.symbol.equals(Value)){
				return partySymbolProperties2;
			}
		}
		return null;


	}
}


