package com.mc.a_variable;

public class C_형변환 {
	public static void main(String[] args) 
	{
		extracted();

	}

	private static void extracted() {
		char ch='A';
		int ch2=ch;
		System.out.println(ch2);
		int inum=128;
		byte bnum=(byte)inum;
		System.out.println(bnum);
	}

}
