package com.mc.coffeemanager.service;
//판매 - 주문을 받고 결제를 수행
public class Sales {
	public Payment takeOrder(Order order) {
		order.execute();
		Payment payment = new Payment(order);
		payment.excute();
		return payment;
	}
}
