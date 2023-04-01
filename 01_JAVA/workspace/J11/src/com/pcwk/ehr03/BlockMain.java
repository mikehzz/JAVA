package com.pcwk.ehr03;

public class BlockMain {

	static { 
		System.out.println("static { }");	// 클래스 초기화 블럭
		
	}
	
	{
		System.out.println("{ }"); 			// 인스턴스 초기화 블럭
	}
	
	public BlockMain() {
		System.out.println("BlockMain() 생성자");
		
	}

	public static void main(String[] args) {
		System.out.println("BlockMain 테스트");
		
		BlockMain bm = new BlockMain();
		System.out.println("=====================================");
		
		BlockMain bm2 = new BlockMain();
		

	}

}
/*
static { }
BlockMain 테스트
{ }
BlockMain() 생성자
=====================================
{ }
BlockMain() 생성자
*/