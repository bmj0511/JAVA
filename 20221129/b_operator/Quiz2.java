package com.mc.b_operator;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) 
	{
		bestofthree();
	}
	public static void bestofthree() 
	{
		Scanner sc=new Scanner(System.in);
		int p1_count=0;
		int p2_count=0;
		while(true)
		{
			System.out.println("1P유저로부터 가위바위보 중 하나를 입력받으세요 : ");
			String p1=sc.nextLine();
			System.out.println("2P유저로부터 가위바위보 중 하나를 입력받으세요 : ");
			String p2=sc.nextLine();
			if(p1.equals("가위")&&p2.equals("보")||p1.equals("보")&&p2.equals("바위")||p1.equals("바위")&&p2.equals("가위"))
			{
				p1_count++;
				if(p1_count==2)
				{
					System.out.println("p1이 승리하였습니다!");
					break;
				}
			}
			if(p2.equals("가위")&&p1.equals("보")||p2.equals("보")&&p1.equals("바위")||p2.equals("바위")&&p1.equals("가위"))
			{
				p2_count++;
				if(p2_count==2)
				{
					System.out.println("p2가 승리하였습니다!");
					break;
				}
			}	
		}
	}
}
