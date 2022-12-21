package com.mc.exception.runtime;
import java.util.*;

public class _Exception {
//Compile Exception : 컴파일 시점에 발생하는 예외,이클립스가 빨간 줄로 표시해주는 예외					  
//Runtime Exception : 컴파일이 끝나고 실제로 실행되는 상황에서 발생하는 예외

//checked Exception : 코드로 예외발생을 차단할 수 없기 때문에, 예외처리를 강제하는 Exception
//Unchecked Exception : 코드로 예외발생을 차단할 수 있기 때문에, 예외처리를 강제하지 않는 Exception

// 예외처리 방법
// try-catch문 : try블록에 예외가 발생할 수 있는 코드 작성, catch블록에 예외처리에 필요한 코드를 작성
// try-catch-finally : finally 블록에 예외 발생 여부와 상관없이 수행 되어야 하는 코드를 작성
public void arithEx() {
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		//ArithmeticException : try블록에
		//제수 : 나누는 수, 피제수 : 나누어지는 수
		System.out.println("피제수 하나를 정수로 입력하세요. ");
		int num=sc.nextInt();
		int random=(int)(Math.random()*4);
		if(random==0)
		{
			System.out.println("나누는 수가 0이므로 계산하지 못합니다.");
			continue;
		}
		else {
		int result=num/random;
		System.out.println("나누어진 몫은 "+result);
		}
	}
}
//2.try-catch문
public void artiEx2() {
	Scanner sc=new Scanner(System.in);
	while(true)
	{	try {
		//ArithmeticException : try블록에
		//제수 : 나누는 수, 피제수 : 나누어지는 수
		System.out.println("피제수 하나를 정수로 입력하세요 :  ");
		int num=sc.nextInt();
		int random=0;
		random=(int)(Math.random()*4);
		int result=num/random;
		System.out.println("나누어진 몫은 "+result);
		} catch(ArithmeticException e) {
			System.out.println("나누는 수가 0이므로 계산하지 못합니다.");
			continue;
		}
	}
}
//3.try-catch-finally
public void artiEx3() {
	Scanner sc=new Scanner(System.in);
	while(true)
	{	try {
		//ArithmeticException : try블록에
		//제수 : 나누는 수, 피제수 : 나누어지는 수
		System.out.println("피제수 하나를 정수로 입력하세요 :  ");
		int num=sc.nextInt();
		int random=0;
		random=(int)(Math.random()*4);
		int result=num/random;
		System.out.println("나누어진 몫은 "+result);
		} catch(ArithmeticException e) {
			System.out.println("나누는 수가 0이므로 계산하지 못합니다.");
			continue;
		}finally {
			System.out.println("=================================");
		}
	}
}
//try문 안에서 여러 종류의 예외가 발생할 때 처리하는 방법
public void studyMultiException(){
	try {
	//ClasCastException : 형변환 과정에서 문제가 생겼을 때 발생
	Object obj=new Object();
	//String str=(String)obj;//형변환
	
	//ArrayIndexOutOfBoundsException
	int[] arr=new int[2];
	arr[2]=3;
	
	//NullPointerException : 레퍼런스에 주소값 대신 null이 들어가 있는데 참조를 시도할 경우 발생하는 예외
	String nullStr=null;
	nullStr.equals("a");
	
/**발생하는 예외에 따라 필요한 예외처리가 다른 경우 사용*/
//	}catch(ClassCastException e) {
//		System.out.println("예외 발생!!");
//		System.out.println(e.getMessage());
//	}
//	
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("예외 발생!!");
//		System.out.println(e.getMessage());
//	}
//	catch(NullPointerException e) {
//		System.out.println("예외 발생!!");
//		System.out.println(e.getMessage());
//	}
/**다형성을 이용하여 모든 종류의 예외 처리하는 경우*/
//}catch(Exception e) { 
//	System.out.println("예외 발생!!");
//	System.out.println(e.getMessage());
//}
/** 자바 1.7부터 지원하는 새로운 예외처리 방식*/
	}catch(ClassCastException|ArrayIndexOutOfBoundsException|NullPointerException e) {
	System.out.println("예외 발생!!");
	System.out.println(e.getMessage());
	}
}
}
