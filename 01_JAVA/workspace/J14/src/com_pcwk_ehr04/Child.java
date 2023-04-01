package com_pcwk_ehr04;

public class Child extends Parent implements PcwkInterface,PcwkInterface02{
	
	@Override
	public void pcwkMethod01() {
		System.out.println("pcwkMethod01()in child");
	}
}
