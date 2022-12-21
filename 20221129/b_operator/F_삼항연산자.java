package com.mc.b_operator;
import java.util.Scanner;

public class F_삼항연산자 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.print("y또는 Y를 입력하세요: ");
      String input=sc.nextLine();
      String res=input.equals("y")||input.equals("Y")?"y를 입력하였습니다":"잘못 입력하였습니다";
      //String은 equals함수로 동등한지 비교!
      System.out.println(res);
	  System.out.println("수를 입력하세요 : ");
      Scanner sc2=new Scanner(System.in);
      int input2=sc2.nextInt();
      String res2= input2 > 0 ? "양수": input2<0 ? "음수":"0" ;
      System.out.println(res2);
      testifelse();
	}
	public static void testifelse()
	{
		System.out.println("수를 입력하세요 : ");
	      Scanner sc=new Scanner(System.in);
	      int input3=sc.nextInt();
	      if(input3>0)
	    	  System.out.println("양수입니다.");
	      else if(input3==0)
	    	  System.out.println("0입니다.");
	      else
	    	  System.out.println("음수입니다.");  
	}
}
