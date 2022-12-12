package com.mc.c_control;
import java.util.Scanner;

public class A_if {
	
	public static void main(String[] args) 
	{
		testif();
		testif2();
	}
	
	public static void testif() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요 : ");
		int input=sc.nextInt();
		if(input>=1) {
			System.out.println("앙수입니다.");
		}
	}
	
	public static void testif2() {
		int milkCnt=1;
		boolean isExists=true;
		if(isExists) {
			milkCnt=6;	
		}
		System.out.println("우유 "+milkCnt+"개 사옴");
	}
}
