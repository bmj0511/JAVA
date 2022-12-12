package com.mc.z_homework;
import java.util.Scanner;

public class bestofthree {
	public static void main(String[] args) 
	{
		CalResult();
	}
	public static void CalResult()
	{
		Scanner sc=new Scanner(System.in);
		int p1_win=0;
		int p1_equal=0;
		int p1_loose=0;
		int p2_win=0;
		int p2_equal=0;
		int p2_loose=0;
		String msg=" ";
		
		while(true)
		{
			if(p1_win==2||p2_win==2)
			{
				System.out.printf("%d승 %d무 %d패 하셨습니다.",p1_win,p1_equal,p1_loose);
			    return;
			}
		System.out.println("나 : ");
		String p1=sc.next();
		System.out.println("너 : ");
		String p2=sc.next();
			if(p1.equals(p2))
			{
				p1_equal++;
				p2_equal++;
				msg="비겼습니다.";
			}
			else if(p1.equals("가위")&&p2.equals("보")||p1.equals("바위")&&p2.equals("가위")||p1.equals("보")&&p2.equals("가위"))
			{
				msg="이겼습니다.";
				p1_win++;
				p2_loose++;
			}
			else if(p2.equals("가위")&&p1.equals("보")||p2.equals("바위")&&p1.equals("가위")||p2.equals("보")&&p1.equals("가위"))
			{
				msg="졌습니다.";
				p1_loose++;
				p2_win++;
			}
			GetResult(msg);
		}
	}
	public static void GetResult(String msg)
	{
		System.out.println(msg);
	}
}
