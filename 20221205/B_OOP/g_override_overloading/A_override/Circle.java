package com.mc.g_override_overloading.A_override;

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
	//이 함수는 Override가 아니라 Circle클래스에 testExtends라는 메서드를 새롭게 정의한 것
	//@Override을 지정하면 에러가 발생함
	private void testExtends() {
		System.out.println("private 메서드는 상속이 안됩니다.");
	}
	
	//Static 메서드도 Override 불가능
	public static void testStaticExtends()
	{
		System.out.println("static 메서드이여서 상속이 안 됩니다.");
	}
	
}
