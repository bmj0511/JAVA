package com.mc.b_operator;

import java.util.Scanner;

public class Quiz {

   public static void main(String[] args) {
      //q1();
      //q2();
      //q3();
      q4();
      //q5();
   }
   private static void q1() {
	      // q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오 
	      //사용자로 부터 정수를 하나 입력 받으세요
	      Scanner sc = new Scanner(System.in);
	      System.out.println("사다리꼴의 윗변을 입력하시오: ");
	      int up=sc.nextInt();
	      System.out.println("사다리꼴의 아랫변을 입력하시오: ");
	      int down=sc.nextInt();
	      System.out.println("사다리꼴의 높이를  입력하시오: ");
	      int height=sc.nextInt();
	      int area= (up+down)*height/2;
	      System.out.printf("사다리꼴의 넓이는 %d 입니다.\n",area);
	   }

   private static void q2() {
      //q2. 사용자로 부터 아이디와 비밀번호를 입력받아
	  // 아이디 : test / 비밀번호 : java
      // 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
      // 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요 
	  String id="test";
	  String pw="java";
      Scanner sc = new Scanner(System.in);   
      System.out.println("사용자 아이디를 입력하세요 : ");
      String input_id=sc.nextLine();
      System.out.println("사용자 비밀번호를 입력하세요 : ");
      String input_pw=sc.nextLine();
      String res2=input_id.equals(id)&&input_pw.equals(pw)?"로그인 되었습니다":"누구야 당신?";
      System.out.println(res2);
   }

   private static void q3() {
	      //q3. 사용자가 입력한 정수가 짝수 인지 판단하고
	      //짝수라면 '짝수 입니다.'
	      //홀수라면 '홀수 입니다.' 를 출력하세요. 
		  System.out.println("숫자를 입력하세요 : ");
	      Scanner sc = new Scanner(System.in);
	      int input=sc.nextInt();
	      String res= (input%2==0) ? "짝수":"홀수";
	      System.out.println(res);
	   }
   
   public static void q4()
		{
			System.out.println("1P유저로부터 가위바위보 중 하나를 입력받으세요");
			Scanner sc=new Scanner(System.in);
			System.out.println("1P: ");
			String p1=sc.nextLine();
			System.out.println("2P: ");
			String p2=sc.nextLine();
			if(p1.equals(p2))
			{
				System.out.println("비김");
			}
			else if(p1.equals("가위")&&p2.equals("보")||p1.equals("보")&&p2.equals("바위")||p1.equals("바위")&&p2.equals("가위"))
			{
				System.out.println("승");
			}
			else if(p1.equals("바위")&&p2.equals("보")||p1.equals("가위")&&p2.equals("바위")||p1.equals("보")&&p2.equals("바위"))
			{
				System.out.println("패");
			}
		}
   private static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		int su = 1;
		
		if(dan < 1 || dan > 9) {
			System.out.println("1~9사이의 숫자를 입력하세요");
			return;
		}
		else {
		while(su < 10) {
			System.out.println(dan + "*" + su++ + "=" +(dan*su));
		}
		}
   }
}
