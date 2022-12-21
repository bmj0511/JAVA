package com.mc.h_abstract;

public class Run {
	public static void main(String[] args) {
		//추상 클래스는 객체 생성(인스턴스화) 불가능
		Figure[] figures= {new Circle(5),new Rectangle(4,7)};
		//추상클래스는 자식클래스로 인스턴스화 가능(오버라이딩)
		for(Figure figure : figures)
		{
			System.out.println(figure.calArea());
		}
		}
    }
