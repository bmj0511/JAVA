package com.mc.e_poly;

public class Run {
	//다형성 : 객체를 여러 타입으로 다루는 것
	//         상속을 통해 부모클래스의 타임을 물려받기 때문
	//         상속 : 메서드,속성,타입
	public static void main(String[] args) {
	Computer com=new Computer("삼성","라이젠",50000,"i3",4);
	//제조사,상품명,가격,CPU,RAM,일체형여부
	Desktop desktop=new Desktop("삼성","울트라",2000000,"intel",16,true);
	//제조사,상품명,가격,CPU,RAM,통신사
	SmartPhone smartPhone=new SmartPhone("사과","아이폰",130000000,"긱벤치",8,"SKT");
	//제조사,상품명,가격, inch(크기)
	TV tv=new TV("LG","LG티비",3000000,52);
	//객체 생성 1
	Product p1=desktop;
	Product p2=smartPhone;
	Product p3=tv;
	//객체 생성 2
	Product[] products= {desktop,smartPhone,tv};
	
	System.out.println(desktop);
	System.out.println(smartPhone);
	System.out.println(tv);
	}
}
