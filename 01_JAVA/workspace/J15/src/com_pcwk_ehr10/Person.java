package com_pcwk_ehr10;

public class Person {
	long id;//회원 ID
	
	Person(long id){
		this.id = id ;
	}

	@Override
	public boolean equals(Object obj) {
		//Person long id 값이 같으면 같다.  -> 새 정의
		if(null != obj && obj instanceof Person) {
			//System.out.println(this.id == ((Person)obj).id);
			return this.id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	
	
}
