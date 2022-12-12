package com.mc.d_encapsulation.after;
//object->Product->Computer
public class Computer extends Product {
//자바에서 상속은 단일 상속만 가능함
//어떤 클래스의 부모클래스는 1개만 존재함
//다중 상속이 불가능 하므로 
//Product내용도 상속 받아서 자식 클래스는 Product와 Computer을 모두 합친 내용을 가지고 있음
//Desktop,SmartPhone이 모두 공통으로 가지고 있는 속성 : CPU,RAM	
	protected String cpu;//protected는 desktop에서 사용할 수 있게 만듦(다른클래스 상속은 가능)
	protected int ram;
	public Computer() {
		super();

	}
	public Computer(String brand, String pName, int price,String cpu,int ram) {
		super(brand, pName, price);
		// super() : 부모클래스의 생성자,반드시 생성자의 가장 위에 위치 
		//super: 부모클래스의 주소를 저장하고 있는 레퍼런스
		this.cpu=cpu;
		this.ram=ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
}
