package com.mc.c_control;
import java.util.Scanner;

public class C_ifelseif {
	public static void main(String[] args)
	{
		//testifelseif();
		//score();
		//q1();	
	}
	public static void q1()
	{
		System.out.println("1P유저로부터 가위바위보 중 하나를 입력받으세요 : ");
		Scanner sc=new Scanner(System.in);
		System.out.println("1P: ");
		String p1=sc.nextLine();
		System.out.println("2P: ");
		String p2=sc.nextLine();
		if(p1==p2)
		{
			System.out.println("비김");
		}
		else if(p1=="가위"&&p2=="보")
		{
			System.out.println("승");
		}
		else if(p1=="보"&&p2=="가위")
		{
			System.out.println("패");
		}
	}
	public static void testifelseif() {
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
	public static void score() {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score=sc.nextInt();
		if(score>=90)
		{
			if((score%10)>=5)
			{
				System.out.println("A+입니다.");
			}
			else {
			System.out.println("A입니다.");
			}
		}
		else if(score>=80&&score<90)
		{
			if((score%10)>=5)
			{
				System.out.println("B+입니다.");
			}
			else {
			System.out.println("B입니다.");
			}
		}
		else if(score>=70&&score<80)
		{
			if((score%10)>=5)
			{
				System.out.println("C+입니다.");
			}
			else {
			System.out.println("C입니다.");
			}
		}
		else if(score>=60&&score<70)
		{
			if((score%10)>=5)
			{
				System.out.println("D+입니다.");
			}
			else {
			System.out.println("D입니다.");
			}
		}
		else
			System.out.println("F입니다.");
	}
}
