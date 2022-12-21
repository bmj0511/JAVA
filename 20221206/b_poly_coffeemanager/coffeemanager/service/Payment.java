package com.mc.coffeemanager.service;
//결제 - 주문,결제금액,계좌 정보를 받아옴,결제를 수행
public class Payment {
private Order order;//주문
private int payPrice;//결제금액
private Account account;//계좌 정보

public Payment(Order order) {
	super();
	this.order = order;
	this.payPrice=order.getOrderPrice();//주문 금액을 Order 클래스에서 받아옴
}

public void excute() {
	payPrice-=PercentDiscount.calDiscountAboutOrderPrice(order);//10% 할인
	Account.getInstance().registerSales(payPrice);
	//Account 클래스에 10% 할인한 금액을 다시 등록
}

public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public int getPayPrice() {
	return payPrice;
}
public void setPayPrice(int payPrice) {
	this.payPrice = payPrice;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
}
