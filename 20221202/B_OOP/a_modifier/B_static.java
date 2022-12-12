package com.mc.a_modifier;

public class B_static {
	//static : [클래스의] 의미를 지니는 modifier
	//변수 앞에 static을 붙이면 해당 변수는 JVM의 static 영역에 올라가게 됨
	//static영역에 올라간 데이터는 클래스 로더가 클래스를 메모리에 올릴 때 올라가게 되며
	//프로그램이 종료될 때까지 메모리에서 내려오지 않는다.
	//static변수나 메소드는 Type.이름 형태로 사용할 수 있다.
	//필드변수  - 인스턴스 변수/클래스 변수
		//필드변수 - 인스턴스 변수(인스턴스가 생성될 때 변수가 생성)
		String nonstatic="static 아님";
		//필드변수 - 클래스 변수(static 변수)
		static String staticVal="static임";
		//일반 메서드
		public void testMethod()
		{
			System.out.println("일반 메서드 입니다.");
		}
		//static 메서드
		public static void testStatic() {
			System.out.println("static 메서드 입니다.");
		}
	
}
