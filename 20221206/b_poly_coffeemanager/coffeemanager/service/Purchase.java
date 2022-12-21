package com.mc.coffeemanager.service;
//매입 - 매입금액, 매입수량, 커피의 정보를 받아옴
public class Purchase {
private Coffee coffee;//커피 정보
private int purchaseCnt;//매입수량
private int budget;//매입금액

public Purchase(Coffee coffee, int purchaseCnt) {
	super();
	this.coffee = coffee;
	this.purchaseCnt = purchaseCnt;
	this.budget=coffee.getCost()*purchaseCnt;//매입금액
}

public boolean execute() {
if(Account.getInstance().registerExpenses(budget)) {//매입할 수량이 있다면
	coffee.addStock(purchaseCnt);//재고에 추가
	return true;
}
else
	return false;
}

public Coffee getCoffee() {
	return coffee;
}

public void setCoffee(Coffee coffee) {
	this.coffee = coffee;
}

public int getPurchaseCnt() {
	return purchaseCnt;
}

public void setPurchaseCnt(int purchaseCnt) {
	this.purchaseCnt = purchaseCnt;
}

public int getBudget() {
	return budget;
}

public void setBudget(int budget) {
	this.budget = budget;
}
}
