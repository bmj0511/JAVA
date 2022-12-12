package com.mc.Menu;
import java.util.Scanner;
//내가 짠 CoffeeManager
public class MenuProcess {
	public static void main(String[] args) 
	{
		int cost=100000;
		int sell=0;
		int buy=0;
		
		int ame_sell=3000;//판매가
		int ame_sellcnt=0;//판매량
		int ame_buy=2000;//매입가
		int ame_buycnt=0;//매입량
		int ame_stock=10;//재고
		int ame_secure_stock=3;//안전재고
		
		int moca_sell=4000;
		int moca_sellcnt=0;
		int moca_buy=3000;
		int moca_buycnt=0;
		int moca_stock=10;
		int moca_secure_stock=3;
		
		int latte_sell=5000;
		int latte_sellcnt=0;
		int latte_buy=4000;
		int latte_buycnt=0;
		int latte_stock=10;
		int latte_secure_stock=3;
		
		while(true) 
		{
		System.out.println("===========Menu===========");
		System.out.println("판매등록(1)");
		System.out.println("현황(2)");
		System.out.println("종료(3)");
		Scanner sc=new Scanner(System.in);
		System.out.printf("입력 : ");
		int input=sc.nextInt();
		if(input==1)
		{
			int americano=1;
			int moca=2;
			int latte=3;
			System.out.println("아메리카노(1)");
			System.out.println("모카(2)");
			System.out.println("라떼(3)");
			System.out.println("* 판매한 커피코드 : ");
			int code=sc.nextInt();
			System.out.println("* 판매량 : ");
			int volume=sc.nextInt();
			if(code==1)
			{
				if(volume>ame_stock) 
				{
					System.out.println("주문을 취소합니다.");
					continue;
				}
					ame_sellcnt+=volume;
					ame_stock-=volume;
					cost+=ame_sellcnt*ame_sell;
					if(ame_stock<ame_secure_stock)
					{
						System.out.println("[system : log] 재고가 부족해 안전재고를 확보합니다.");
						if(cost<ame_secure_stock*2*ame_buy)
						{
							System.out.println("[system : log] 잔고가 부족해 안전재고 확보에 실패했습니다.");
						}
						else 
						{
						ame_buycnt+=ame_secure_stock*2;
						ame_stock+=ame_secure_stock*2;//안전재고의 2배만큼 매입한다.
						System.out.printf("[system : log] 아메리카노 재고 : %d\n",ame_stock);
						cost-=ame_secure_stock*2*ame_buy;//안전재고의 2배만큼 매입한 만큼 잔고에서 뺀다.
						}
					 }	
				System.out.println("제품명 : 아메리카노");
				System.out.printf("판매가 : %d\n",ame_sell);
				System.out.printf("판매수량 : %d\n",ame_sellcnt);
				System.out.printf("결재금액 : %d\n",ame_sell*ame_sellcnt);
				System.out.printf("남은 재고 : %d\n",ame_stock);
			}
			else if(code==2)
			{
				moca_sellcnt+=volume;
				if(volume<moca_stock)
				{
					moca_stock-=volume;
					cost+=moca_sellcnt*moca_sell;
					if(moca_stock<moca_secure_stock)
					{
						System.out.println("[system : log] 재고가 부족해 안전재고를 확보합니다.");
						if(cost<moca_secure_stock*2*moca_buy)
						{
							System.out.println("[system : log] 잔고가 부족해 안전재고 확보에 실패했습니다.");
						}
						else {
						moca_buycnt+=moca_secure_stock*2;
						moca_stock+=moca_secure_stock*2;//안전재고의 2배만큼 매입한다.
						System.out.printf("[system : log] 모카 재고 : %d\n",moca_stock);
						cost-=moca_secure_stock*2*moca_buy;//안전재고의 2배만큼 매입한 만큼 잔고에서 뺀다.
						}
					}	
				}
				else
				{
					System.out.println("주문을 취소합니다.");
				}
				System.out.println("제품명 : 모카");
				System.out.printf("판매가 : %d\n",moca_sell);
				System.out.printf("판매수량 : %d\n",moca_sellcnt);
				System.out.printf("결재금액 : %d\n",moca_sell*moca_sellcnt);
				System.out.printf("남은 재고 : %d\n",moca_stock);
			}
			else if(code==3)
			{
				latte_sellcnt+=volume;
				if(volume<latte_stock)
				{
					latte_stock-=volume;
					cost+=latte_sellcnt*latte_sell;
					if(latte_stock<latte_secure_stock)
					{
						System.out.println("[system : log] 재고가 부족해 안전재고를 확보합니다.");
						if(cost<latte_secure_stock*2*latte_buy)
						{
							System.out.println("[system : log] 잔고가 부족해 안전재고 확보에 실패했습니다.");
						}
						else {
						latte_buycnt+=latte_secure_stock*2;
						latte_stock+=latte_secure_stock*2;//안전재고의 2배만큼 매입한다.
						System.out.printf("[system : log] 라떼 재고 : %d\n",latte_stock);
						cost-=latte_secure_stock*2*latte_buy;//안전재고의 2배만큼 매입한 만큼 잔고에서 뺀다.
						}
					}	
				}
				else
				{
					System.out.println("주문을 취소합니다.");
				}
				System.out.println("제품명 : 라떼");
				System.out.printf("판매가 : %d\n",latte_sell);
				System.out.printf("판매수량 : %d\n",latte_sellcnt);
				System.out.printf("결재금액 : %d\n",latte_sell*latte_sellcnt);
				System.out.printf("남은 재고 : %d\n",latte_stock);
			}
		}
		else if(input==2)
		{
			System.out.printf("아메리카노 재고 : %d |판매량 : %d\n",ame_stock,ame_sellcnt);
			System.out.printf("모카 재고 : %d |판매량 : %d\n",moca_stock,moca_sellcnt);
			System.out.printf("라떼 재고 : %d |판매량 : %d\n",latte_stock,latte_sellcnt);
			sell=ame_sell*ame_sellcnt+moca_sell*moca_sellcnt+latte_sell*latte_sellcnt;
			buy=ame_buy*ame_buycnt+moca_buy*moca_buycnt+latte_buy*latte_buycnt;
			System.out.printf("잔고 : %d | 매출 : %d | 지출 : %d \n",cost,sell,buy);
		}
		else if(input==3)
		{
			Close();
			return;
		}
		}//while문 괄호닫기
	} //main문 괄호닫기
	public static void Close()
	{
		System.out.println("* 프로그램을 종료합니다.");
	}
}//전체 클래스 괄호닫기
