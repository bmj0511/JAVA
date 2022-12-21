package com.mc.coffeemanager.service;
//매입 - 
public class Purchase {
private Coffee coffee;
private int purchaseCnt;
private int budget;

public Purchase(Coffee coffee, int purchaseCnt) {
	super();
	this.coffee = coffee;
	this.purchaseCnt = purchaseCnt;
	this.budget=coffee.getCost()*purchaseCnt;
}

public boolean execute() {
if(Account.getInstance().registerExpenses(budget)) {
	coffee.addStock(purchaseCnt);
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
