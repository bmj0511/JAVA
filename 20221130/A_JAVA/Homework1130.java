package com.mc.z_homework;
import java.util.Scanner;

public class Homework1130 {
	public static void main(String[] args) 
	{
	//q1();
	//q2();
	//qspecial();
	//qspecial2();
	//q3();
	//q4();
	//q5();
	}
	
	private static void q1() 
	{
		//   사용자로부터 줄 수와 칸수를 입력받아서
		//	 사각형을 별로 그리는 이중반복문 작성하시오
			Scanner sc=new Scanner(System.in);
			System.out.println("줄 수를 입력하세요 : ");
			int row=sc.nextInt();
			System.out.println("칸 수를 입력하세요 : ");
			int column=sc.nextInt();
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
	
	private static void q2()
	{
			//사용자로부터 정수를 하나 입력받아
		   //    사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
		   //    숫자는 1~사용자가 입력한 숫자까지.
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i==j)
				{
					System.out.printf("%d",j);
				}
				else
				{
					System.out.printf("*");
				}
					
			}
			System.out.println();
		}
	}
	
	private static void qspecial() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num3=sc.nextInt();
		for(int i=1;i<=num3;i++)
		{
			for(int k=0;k<=(num3-1-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int h=(num3-1);h>=1;h--)
		{
			for(int p=num3-h;p>=1;p--)
			{
				System.out.printf(" ");
			}
			for(int m=2*h-1;m>=1;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void qspecial2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num3=sc.nextInt();
		for(int i=1;i<=num3;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j==(i-1))
				{
					System.out.print(i);
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void q3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("다운로드 받을 프로그램 개수를 입력해주세요 : ");
		int num4=sc.nextInt();
		for(int i=1;i<=num4;i++)
		{
			System.out.printf("%d번째 프로그램 다운로드 받습니다.\n",i);
			for(int j=0;j<=5;j++)
			{
				System.out.printf("%d%% 진행 중...\n",20*j);
			}
			if(i==num4)
			{
				System.out.println("-------------------");
				System.out.println("모든 프로그램 다운로드 완료");
			}
		}
	}
	
	public static void q4()
	{
	//   사용자로부터 숫자와 방향(+,-) 를 입력받아
			   //   사용자가 입력한 방향에 따라 삼각형 밑변의 위치를 다르게 출력하시오.
			   //   
			   //   출력예시
			   //      숫자 : 4
			   //      방향(+ 또는 -) : -
			   //      ****
			   //      ***
			   //      **
			   //      *
	      Scanner sc = new Scanner(System.in);
	      System.out.print("숫자 : ");
	      int cnt = sc.nextInt();
	      System.out.print("방향(+ 또는 -) : ");
	      String direction = sc.next();
	      if(direction.equals("+")||direction.equals("-"))
	      {
	    	  if(direction.equals("+"))
	    	  {
	    		  for(int i=1;i<=cnt;i++)
	    		  {
	    			  for(int j=1;j<=i;j++)
	    			  {
	    				  System.out.print("*");
	    			  }
	    			System.out.println();
	    		  }
	    	  }
	    	  else if(direction.equals("-"))
	    	  {
	    		  for(int k=cnt;k>=1;k--)
	    		  {
	    			  for(int m=1;m<=k;m++)
	    			  {
	    				  System.out.print("*");
	    			  }
	    			  System.out.println();
	    		  }
	    	  }
	      }
	      else
	      {
	    	  System.out.println("올바른 문장을 입력하세요.");
	      }
	}
	public static void q5()
	{
	//   숫자 : 5
		   //   방향(+ 또는 -) : +
		   //       *
		   //      ***
		   //     *****
		   //    *******
		   //   *********
		   
		   //   숫자 : 5
		   //   방향(+ 또는 -) : -
		   //   *********
		   //    *******
		   //     *****
		   //      ***
		   //       *
		 Scanner sc = new Scanner(System.in);
	      System.out.print("숫자 : ");
	      int num3 = sc.nextInt();
	      System.out.print("방향(+ 또는 -) : ");
	      String direction = sc.next();
	      if(direction.equals("+")||direction.equals("-"))
	      {
	    	  if(direction.equals("+"))
	    	  {
	    		  for(int i=1;i<=num3;i++)
	    			{
	    				for(int k=0;k<=(num3-1-i);k++)
	    				{
	    					System.out.print(" ");
	    				}
	    				for(int j=1;j<=(2*i-1);j++)
	    				{
	    					System.out.print("*");
	    				}
	    				System.out.println();
	    			}
	    	  }
	    	  else if(direction.equals("-"))
	    	  {
	    		  for(int h=(num3-1);h>=1;h--)
	    			{
	    				for(int p=num3-h;p>=1;p--)
	    				{
	    					System.out.printf(" ");
	    				}
	    				for(int m=2*h-1;m>=1;m--)
	    				{
	    					System.out.print("*");
	    				}
	    				System.out.println();
	    			}
	    	  }
	      }
	      else
	      {
	    	  System.out.println("올바른 문장을 입력하세요.");
	      }
	}
}
