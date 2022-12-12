package com.mc.f_array;
import java.util.*;
public class NewNew {

	public static void main(String[] args) 
 {
	int[] data= {1,2,3,4,5};
	Scanner sc=new Scanner(System.in);
	System.out.println("시작인덱스와 끝 인덱스를 입력하세요 : ");
	int start=sc.nextInt();
	int end=sc.nextInt();
	int[] subArr=new int[end-start];
	for(int i=start-1;i<end-1;i++)
	{
		subArr[i-start+1]=data[i];
	}
	System.out.println("결과 : "+Arrays.toString(subArr));
  }
}
