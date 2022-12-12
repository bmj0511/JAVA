package com.mc.a_modifier;

public class StaticTest {
	public static void main(String[] args) {
		//static변수
		System.out.println(B_static.staticVal);
		//Heap영역에 인스턴스변수의 공간을 확보하고 초기화
		B_static nonstatic=new B_static();
		B_static ns2=new B_static();
		//Heap영역에 올라간 객체주소를 저장하고 있는 레퍼런스를 호출
		System.out.println("nonstatic : "+nonstatic.nonstatic);
		System.out.println("ns2 : "+ ns2.nonstatic);
		
		nonstatic.nonstatic="not static";
		System.out.println("nonstatic : "+nonstatic.nonstatic);
		System.out.println("ns2 : "+ ns2.nonstatic);//ns2의 nonstatic은 바뀌지 않음
		
		System.out.println("nonstatic : "+nonstatic.staticVal);
		nonstatic.staticVal="yes static";
		System.out.println("nonstatic : "+nonstatic.staticVal);
		System.out.println("nonstatic : "+ns2.staticVal);
		
		B_static.testStatic();//static이므로 바로 호출 가능
		nonstatic.testMethod();//testMethod()가 static이 아니므로 객체호출
	}
}
