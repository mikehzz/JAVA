package com_pcwk_ehr08;

public class PcwkRunnable implements Runnable {
	Account account = new Account();
	@Override
	public void run() {
		//잔고가 0보다 크면
		while(account.getBalance()>0) {
			int money = ((int)(Math.random()*3)+1)*10_000_000;
		
			account.withdraw(money);
			System.out.println("잔고:"+account.getBalance());
		}
	}

}
