package com.mc.coffeemanager.service;
import java.time.LocalDateTime;

//주문 - 커피에 담긴 정보와 주문수량, 주문시간, 주문금액을 기록
public class Order {
	
	private Coffee coffee; // 주문한 커피
	private int orderCnt;//주문수량
	private LocalDateTime orderTime;//주문시간
	private int orderPrice;//주문금액
	private String orderTitle; //주문명
	
	public static Order createOrder(Coffee coffee, int orderCnt) {//주문생성
		
		if(coffee.getStock() < orderCnt) return null;
		return new Order(coffee, orderCnt);
		
	}
	
	private Order(Coffee coffee, int orderCnt) {
		super();
		this.coffee = coffee;
		this.orderCnt = orderCnt;
		this.orderTitle = coffee.getName() + "[" + orderCnt + "잔]";
		this.orderTime = LocalDateTime.now(); //현재 시간
		this.orderPrice = coffee.getPrice() * orderCnt;
	}
	
	public void execute() {//커피 제공
		coffee.offer(orderCnt);
	}

	public Coffee getCoffee() {
		return coffee;
	}
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	public int getOrderCnt() {
		return orderCnt;
	}
	public void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
		
	}
	public String getOrderTitle() {
		return orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	
	@Override
	public String toString() {
		return "Order [coffee=" + coffee + ", orderCnt=" + orderCnt + ", orderTime=" + orderTime + ", orderPrice="
				+ orderPrice + ", orderTitle=" + orderTitle + "]";
	}
}
