package com.mc.tour.presentation;
import java.util.*;

import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;


public class MainMenu{ 
	Scanner sc=new Scanner(System.in);
	private Tour tour;
	private Airline[] al;
	private Tourist tt;
	public MainMenu() {
		// TODO Auto-generated constructor stub
	}
	public MainMenu(Tour tour, Airline[] al, Tourist tt) {
		// TODO Auto-generated constructor stub
		this.al=al;
		this.tt=tt;
	}
	
		public void mainMenu(){
		while(true) 
		{
			System.out.println("******KH항공사에 오신 고객님 환영합니다******");
			System.out.println("====================================");
			System.out.println("현재 보유 금액:"+tour.bringMyMoney());//현재 보유 금액 출력
			System.out.println("현재 보유 마일리지:"+tour.bringMyMile());//현재 마일리지 출력
			System.out.println("====================================");
			System.out.println("번호 목적지 가격 마일리지");
			for(int i=0;i<al.length;i++)
			{
				System.out.println(i+"\t"+al[i].getCountry()
						+"\t"+al[i].getAirfare()
						+"\t"+al[i].getMileage());
			}
			System.out.println("====================================");
			System.out.println("목적지 선택(번호입력) :");
			int destination=sc.nextInt();
			if(destination!=1&&destination!=2&&destination!=3) {
				System.out.println("알맞은 번호가 아닙니다.");
				break;}
			System.out.println("====================================");
			// 보유금액으로 티켓 구매 가능 여부를 확인하여 불가능하면
			// 현재 보유 금액이 부족합니다. 라고 출력 후 반복 종료
			// 보유금액이 없을 때까지 반복 출력
						if(!tour.isAble(destination))
						{
						System.out.println("현재 보유 금액이 부족합니다.");
						break;
						}
						tour.buyTicket(destination);
						System.out.println("티케팅 후 잔액은 : " + tour.bringMyMoney());
						System.out.println("티케팅 후 마일리지는 : " + tour.bringMyMile());
		}
		
		}
	
	}


