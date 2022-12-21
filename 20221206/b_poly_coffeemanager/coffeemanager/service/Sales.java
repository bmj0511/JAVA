package com.mc.coffeemanager.service;
//판매 - 주문을 받고 결제를 수행
/** 판매
 * @since 2022.12.06
 * @version 0.1
 * @author 백민정*/
public class Sales {
	/** 메뉴에서 고객의 주문에 따른 판매 로직 진행*/
	/**@param 주문
	 * @return 결제*/
	public Payment takeOrder(Order order) {
		order.execute();//주문을 받음
		Payment payment = new Payment(order);
		payment.excute();//결제 수행
		return payment;//결제정보 반환
	}
}
