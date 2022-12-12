package com.mc.b_encapsulation;
import java.util.*;

public class Coffee {
	private String name;
	private int price;
	private int cost;
	private int stock;
	private int safetyStock;
	private int salesCnt;
	
	public Coffee() 
	{
		
	}
	
	public Coffee(String name,int price,int cost,int stock,int safetyStock,int salesCnt)
	{
		this.name=name;
		this.price=price;
		this.cost=cost;
		this.stock=stock;
		this.safetyStock=safetyStock;
		this.salesCnt=salesCnt;
	}
	//getter : get+필드변수명 ex)getName() ->필드 변수값을 읽을 때 사용
	public String getName()
	{
		return this.name;
	}
	
	//setter : set+필드변수명 ex)setName(String name) ->필드 변수값을 사용할 때 사용
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price){
		this.price = price;
		if(price<0) System.out.println("0 이하의 값은 들어올 수 없습니다.");
		return;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}

	public int getSalesCnt() {
		return salesCnt;
	}

	public void setSalesCnt(int salesCnt) {
		this.salesCnt = salesCnt;
	}
}
