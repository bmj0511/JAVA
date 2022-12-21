package com.mc.c_control;
import java.util.Scanner;

public class D_switch {
	public static void main(String[] args) 
	{
		//studyswitch();
		
	}

	private static void studyswitch() {
		Scanner sc = new Scanner(System.in);
	      System.out.print("첫번째 값 : ");
	      int firstNum = sc.nextInt();
	      System.out.print("두번째 값 : ");
	      int secondNum = sc.nextInt();
	      System.out.print("연산자 : ");
	      String op = sc.next();
	    int result=0;
	    
		    switch (op) {
				case "+":
			        result=firstNum+secondNum;
					break;
				case "/":
					result=firstNum/secondNum;
					break;
				case "%":
					result=firstNum%secondNum;
					break;
				case "*":
					result=firstNum*secondNum;
					break;
				case "-":
					result=firstNum-secondNum;
					break;
				default:
					System.out.println("산술 연산자를 넣어주세요.");
					break;
			}
		    System.out.println("산술연산 값 : "+result);
	}
}
