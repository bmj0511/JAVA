package com.mc.g_override_overloading.A_override;

public class Run {
	public static void main(String[] args) {
		//반지름이 5인 원의 넓이를 구하시오.
		//너비가 4, 높이가 7인 직각사각형의 넓이를 구하시오.
		Figure[] figures= {new Circle(5),new Rectangle(4,7)};//오버라이딩
		figures[0].testStaticExtends();//figure 타입의 함수 내용 출력
		//왜냐하면 testStaticExtends()함수는 static이므로 override가 아님(static은 상속불가)
		Circle c=(Circle)figures[0];
		c.testStaticExtends();//Circle타입의 함수 내용 출력
		//Override가 안되므로 Circle에서 새로 정의된 함수내용 출력
		for(Figure figure : figures)
		{
			//강제형변환
			//선조타입으로 형변환 할 때는 (UpCasting) : 자동캐스팅
			//Why?자식타입에는 자식타입이 상속받은 선조타입에 대한 정보가 있다.따라서, 자동캐스팅 가능
			
			//선조타입을 후손타입으로 형변환 할 때에는(DownCasting) : 명시적 형변환 필요
			//Why? 선조타입은 자식을 상속받고 있는 클래스가 무엇인지에 대한 정보가 없음
			//오버라이딩과 강제형변환은 별개의 개념
			//Figure f=new Figure();
			//Circle c=(Circle)f;//DownCasting
			System.out.println(figure.calArea());
		}//방법1
		for(int i=0;i<figures.length;i++)
		{	Figure f=figures[i];
			System.out.println(f.calArea());
		}//방법2
    }
}