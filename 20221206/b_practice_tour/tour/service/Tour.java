package com.mc.tour.service;

public class Tour{
	
	private Airline[] al;
	private Tourist tt;
	
	public Tour(Airline[] al, Tourist tt) {
		this.al=al;
		this.tt=tt;
	}
	
	public boolean isAble(int num){
	// 보유 금액으로 티켓 구매 가능 여부 확인
		return tt.getMyMoney()>=al[num].getAirfare();
	}

	// 미국/중국/일본 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
	public void buyTicket(int num) {
		tt.setMyMoney(tt.getMyMoney() - al[num].getAirfare());
		tt.setMyMile(tt.getMyMile() + al[num].getMileage());
	}
	public int bringMyMoney() {
	// 여행객의 보유금액을 리턴
		return tt.getMyMoney();
	}
	public int bringMyMile() {
	// 여행객의 마일리지를 리턴
		return tt.getMyMile();
	}
}

