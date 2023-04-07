package com_pcwk_ehr05;

public enum Grade {
	//Gold, 100
	//silver, 80
	//Bronze, 60
	GOLD("Gold",100),
	SILVER("Silver",80),
	BRONZE("Bronze",60);
	
	
	private String name;
	private int minScore;
	
	Grade(String name, int minScore) {
		this.name = name;
		this.minScore = minScore;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMinScore() {
		return minScore;
	}

}
