package com.mc.c_control;
import java.util.Scanner;

public class B_ifelse {
	public static void main(String[] args) 
	{
		testifelse();
	}
	public static void testifelse(){
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name=sc.nextLine();
		String myname="백민정";
		if(name.equals(myname))
		{
			System.out.println("안녕하세요!");
		}
		else
		{
			System.out.println("당신누구야!");
		}
	}
}
