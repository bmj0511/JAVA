package com.mc.e_poly;
//object->Product
public class Product {
//3개의 클래스가 모두 가지고 있는 속성 : 제조사, 상품명,가격
protected String brand;
protected String pName;
protected int price;
public Product() {

}
public Product(String brand, String pName, int price) {
	super();
	this.brand = brand;
	this.pName = pName;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
