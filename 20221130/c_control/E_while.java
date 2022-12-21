package com.mc.c_control;
import java.util.Scanner;

public class E_while {
	public static void main(String[] args) 
	{
		//studywhile();
		pw();
	}
	private static void pw() {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("비밀번호를 입력하세요 : ");
			String pw=sc.nextLine();
			if(pw.equals("123abc")) {
				System.out.println("로그인 되었습니다.");
				break;
				}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
				continue;
			}
		}
	}

	private static void studywhile() {
		int i=1;
		while(i<=5)
		{
			System.out.println("멈추지 않아! 중요한 건 꺾이지 않는 마음");
			i++;
		}
	}
}
