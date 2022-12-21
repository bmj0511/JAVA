package com.mc.b_operator;

public class H_복합대입연산자 
{
	public static void main(String[] args) 
	{
		String a="1번";
		String b="2번";
		String temp=b;
		b=a;
		a=temp;
		System.out.printf(a+"\n");
		System.out.printf(b);
	}
}