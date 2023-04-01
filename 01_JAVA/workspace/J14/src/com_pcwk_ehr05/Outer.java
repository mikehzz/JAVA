package com_pcwk_ehr05;

public class Outer {
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void pcwkMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
	
	
}
