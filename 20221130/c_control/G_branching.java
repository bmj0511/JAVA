package com.mc.c_control;
import java.util.Scanner;

public class G_branching {
	public static void main(String[] args) 
	{
	  //studyBranching();
	  int sum=0;
	  for(int i=1;i<11;i++)
	  {
		  if(i%4==0)
			  continue;
		  else
			  sum+=i;	  
	  }
	  System.out.println("수의 합 : " +sum);
	}

	private static void studyBranching() {
		Scanner sc=new Scanner(System.in);
		  while(true)
		  {
			  System.out.println("문자열을 입력하시오 : ");
			  String message=sc.nextLine();
			  if(message.equals("end"))
			  {
				  System.out.println("프로그램을 종료합니다.");
				  break;
			  }
			  else
				  continue;
		  }
	}
}
