package com_pcwk_ehr08;

public class Account {
	private int balance = 100_000_000;//1억
	
	public Account() {}
	
	//현 잔고
	public int getBalance() {
		return balance;
	}
	
	//출금
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}