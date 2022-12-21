package com.mc.coffeemanager.service;
//판매 - 주문을 받고 결제를 수행
public class Sales {
	public Payment takeOrder(Order order) {
		order.execute();//주문을 받음
		Payment payment = new Payment(order);
		payment.excute();//결제 수행
		return payment;//결제정보 반환
	}
}
