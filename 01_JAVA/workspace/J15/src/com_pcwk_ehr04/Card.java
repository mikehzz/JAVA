package com_pcwk_ehr04;

public class Card {
	private String Kind;
	private int number;
	
	Card(){
		this("spade",1);
	}

	public Card(String kind, int number) {
		super();
		Kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [Kind=" + Kind + ", number=" + number + ",toString()=" + super.toString() + "]";
	}

	

	
	
	
}
