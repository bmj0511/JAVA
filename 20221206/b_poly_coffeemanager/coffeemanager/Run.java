package com.mc.coffeemanager;

import com.mc.coffeemanager.presentation.Menu;
import com.mc.coffeemanager.service.Account;
import com.mc.coffeemanager.service.Coffee;
import com.mc.coffeemanager.service.Sales;
import com.mc.coffeemanager.service.SeasonCoffee;

// 화면에 보여질 수 있게 들어가는 값을 입력하는 과정
public class Run {
	public static void main(String[] args) {
		Coffee[] drinks= {new Coffee("아메리카노",10,0,3,2000,3000),
						  new Coffee("모카",10,0,3,3000,4000),
						  new Coffee("라떼",10,0,3,4000,5000),
						  new SeasonCoffee("자몽허니블랙티",10,0,3,6000,5000,new int[] {11,10,9})};
		new Menu(new Sales(),drinks).mainMenu();
	}
}
