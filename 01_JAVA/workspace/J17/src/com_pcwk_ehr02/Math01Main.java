package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.*;

public class Math01Main implements pcwLog{

	//주어진 값에 절대값 반환
	public static void pcwkAbs() {
		int x = -10;
		LOG.debug("Math.abs(x)="+Math.abs(x));
	}
	
	//주어진 값을 올림 처리한다.
	public void pcwkCeil() {
		double x = 23.025;
		LOG.debug("Math.ceil(x) = "+Math.ceil(x));
	}
	
	//주어진 값을 버림하여 반환한다.
	public void pcwkFloor() {
		double x = 3.99;
		LOG.debug("Math.floor(x) = " + Math.floor(x));
	}
	
	//주어진 값 반올림(소수점 첫째 자리에서 반올림 한다.
	public void pcwkRound() {
		double x = 3.84455;
		LOG.debug("Math.Round(x) = " + Math.round(x));
	}
	
	//90.7552 를 반올림 -> 90.76
	//90.7552 소숫점 두째자리에서 반올림 처리
	//1.원래값에 곱하기 100 : 90.7552 * 100
	//2. Math.round() : 9075.52 -> 9076
	//3. 2번 결과에 100.0으로 나누기 -> 9076/100.0 -> 90.76
	
	public void pcwkRound2() {
		double x = 77.549;
		//1.
		x = x*100;			//7754.9
		//2.
		x = Math.round(x);  //7755
		//3.
		x=x/100.0;			//77.55
		LOG.debug("Math.Round02(x) = "+x);
	}
	
	//max(x,y) 주어진 두 값 중 큰 값 
	public void pcwkMax() {
		double x = 12;
		double y = 14;
		LOG.debug("Math.max(x,y) = " + Math.max(x, y));
	}
	
	//두 점 사이의 거리 구하기
	public void pcwkDistance() {
		int x1 = 1, y1 = 1;
		int x2 = 2, y2 = 2;
		
		double x = 2.0;
		double y = 3.0;
		double z = Math.pow(x, y);
		LOG.debug("Math.pow(2.0,3.0): "+z);
		
		x= 16.0;
		LOG.debug(Math.sqrt(x));
		double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		LOG.debug("sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)) = " + Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
	}
	
	//random()
	//0.0 <=x<1.0
	//1~6사이 난수 구하기
	public void pcwkRandom() {
		//0.0<=x<1.0
		//0.0<=x<6.0
		int x = (int)(Math.random()*6)+1;
		LOG.debug("x = "+ x);
		
	}
	
	public static void main(String[] args) {
		LOG.debug("----------");
		
		Math01Main m = new Math01Main();
		m.pcwkCeil();
		m.pcwkFloor();		
		m.pcwkRound();
		m.pcwkRound2();
		m.pcwkMax();
		m.pcwkDistance();
		for(int i=0;i<6;i++) {
			m.pcwkRandom();
			
		}
	}
	
	
	
	
	
}
