package com.mc.d_encapsulation.before;

public class Run {
	public static void main(String[] args) {
		
		//제조사,상품명,가격,CPU,RAM,일체형여부
		Desktop desktop=new Desktop("삼성","울트라",2000000,"intel",16,true);
		//제조사,상품명,가격,CPU,RAM,통신사
		SmartPhone smartPhone=new SmartPhone("사과","아이폰",130000000,"긱벤치",8,"SKT");
		//제조사,상품명,가격, inch(크기)
		Tv tv=new Tv("LG","LG티비",3000000,52);
		
		System.out.println(desktop.toString());
		System.out.println(smartPhone);
		System.out.println(tv);
		//3개의 클래스가 모두 가지고 있는 속성 : 제조사, 상품명,가격
		//Desktop,SmartPhone이 모두 공통으로 가지고 있는 속성 : CPU,RAM
	}
}
