package com_pcwk_ehr02;

public class Book {
	
	String title;//제목
	int price;	 //가격
	
	Book(){
		this("Java의 정석", 30000);
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	
	
}
