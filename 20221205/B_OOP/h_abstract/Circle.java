package com.mc.h_abstract;

public class Circle extends Figure{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Overriding : 부모클래스로부터 상속받은 메서드를 재정의
	//@Override(오버라이드 어노테이션) : 해당 메서드가 부모 클래스로부터 상속받은 메서드를 알맞게 Override를 하였는지 검증 가능
	@Override
	public double calArea()
	{
		return Math.PI*radius*radius;
	}
	public String getName()
	{
		return "동그라미";
	}
	//getName()함수는 Circle에만 존재하므로 오버라이딩 불가능
	//Figure figure=new CirCle();에서 figure는 Circle()에만 있는 getName()을 오버라이딩 하지 못함.
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
}
