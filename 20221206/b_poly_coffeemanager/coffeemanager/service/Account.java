package com.mc.coffeemanager.service;
//계좌 - 잔고, 매출액, 지출액, 매출등록, 지출등록
public class Account {
	private int balance;//잔고
	private int salesVolumn;//매출액
	private int expences;//지출액
	//계좌는 1번만 생성되어야 하고, 값이 누적적으로 변화해야 함(※ 계속 초기화 되면 안됨)
	//Singleton 패턴(1번만 생성해야 하는 클래스가 있을 경우 사용)
	private static final Account ACCOUNT=new Account();
	
	//Account.getInstance() : 읽는 개발자들이 singleton방식으로 생성된 인스턴스라는 것을 바로 앎.
	public static Account getInstance() {
		return ACCOUNT;
	}
	//외부에서 생성자를 사용해서 instance 생성을 못하도록 처리(∵계좌는 계속 생성되면 안됨(싱글턴 패턴))
	private Account()
	{
		
	}
	public boolean registerExpenses(int budget)//지출등록
	{
		if(balance>budget)
		{
			balance-=budget;
			expences+=budget;
			return true;
		}
		return false;
	}
	public void registerSales(int payPrice)//매출 등록 
	{
		// TODO Auto-generated method stub
		balance+=payPrice;
		
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getSalesVolumn() {
		return salesVolumn;
	}
	public void setSalesVolume(int salesVolumn) {
		this.salesVolumn = salesVolumn;
	}
	public int getExpences() {
		return expences;
	}
	public void setExpences(int expences) {
		this.expences = expences;
	}

	
	
	
}
