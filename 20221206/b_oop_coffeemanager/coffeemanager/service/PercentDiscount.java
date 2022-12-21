package com.mc.coffeemanager.service;

//final : 더이상 상속이 불가능한 클래스
public final class PercentDiscount {
	public static int calDiscountAboutOrderPrice(Order order) {
		//할인율이 10%로 동일하므로 static으로 설정
		int discount=0;
		if(order.getOrderPrice()>=10000)
		{
			discount=(int) (order.getOrderPrice()*0.1);
		}
		return discount;
	}

}
