package com.mc.coffeemanager.service;
//커피 - 이름,재고,누적판매량,안전재고,매입가,판매가등을 기록
public class Coffee {
private String name;//이름
private int stock;//재고
private int totalSalesCnt;//누적판매량
private int safetyStock;//안전재고
private int cost;//매입가
private int price;//판매가

private static final String MSG=" ";

public Coffee(String name, int stock, int totalSalesCnt, int safetyStock, int cost, int price) {
	super();
	this.name = name;
	this.stock = stock;
	this.totalSalesCnt = totalSalesCnt;
	this.safetyStock = safetyStock;
	this.cost = cost;
	this.price = price;
}

public void offer(int orderCnt) {
	deductStock(orderCnt);//커피재고차감
	addTotalSalesCnt(orderCnt);//커피판매량추가
	
	if(stock<safetyStock)
	{
		addSafetyStock();//안전재고확보
	}
}

private void addTotalSalesCnt(int orderCnt) {//커피판매량추가
	totalSalesCnt+=orderCnt;
}

private void addSafetyStock() {//안전재고 확보
	System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
	Purchase purchase=new Purchase(this,safetyStock*2);
	if(purchase.execute())
	{
		System.out.println(" [system:log] 안전재고를 확보하였습니다.");
	}
	else
	{
		System.out.println(" [system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");
	}
}

private void deductStock(int orderCnt) {
	// TODO Auto-generated method stub
	this.stock-=orderCnt;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getTotalSalesCnt() {
	return totalSalesCnt;
}
public void setTotalSalesCnt(int totalSalesCnt) {
	this.totalSalesCnt = totalSalesCnt;
}
public int getSafetyStock() {
	return safetyStock;
}
public void setSafetyStock(int safetyStock) {
	this.safetyStock = safetyStock;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public String toString() {
	return "Coffee [name=" + name + ", stock=" + stock + ", totalSalesCnt=" + totalSalesCnt + ", safetyStock="
			+ safetyStock + ", cost=" + cost + ", price=" + price + "]";
}

public void addStock(int purchaseCnt) {
	this.stock+=purchaseCnt;
	
}

}
