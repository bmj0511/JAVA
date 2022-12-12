package com.mc.f_array;
import java.util.*;

public class C_ArrayUtil {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] iArr= {5,1,3,7,9};
		int[] data= {1,2,3,4,5};
		int[] data2= {6,7,8,9,10};
		int num=1000;
		
		System.out.println("제거할 인덱스 위치를 입력하세요 : ");
		int index=sc.nextInt();
		System.out.println("결과 : "+ Arrays.toString(remove(data,index)));
		
		System.out.println("시작인덱스와 끝 인덱스를 입력하세요 : ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("결과 : "+Arrays.toString(subArr(data,start,end)));
		
		bubblesort(iArr);
		System.out.println("배열 추가 : "+Arrays.toString(add(iArr,num)));
		System.out.println("배열 합병 결과 : "+ Arrays.toString(merge(data,data2)));
	}
	
	public static int[] add(int[] iArr, int num) 
	{
	      int[] bigArr = new int[iArr.length+1];
	      for (int i = 0; i < iArr.length; i++) 
	      {
	         bigArr[i] = iArr[i];
	      }
	      bigArr[bigArr.length -1] = num;
	      return bigArr;
	   }
	
	public static int[] merge(int[] data,int[] data2)
	{
		int[] bigArr= new int[data.length+data2.length];
		for(int i=0;i<data.length;i++)
		{
			bigArr[i]=data[i];
		}
		for(int i=data.length;i<data.length+data2.length;i++)
		{
			bigArr[i]=data2[i-data.length];
		}
		return bigArr;
	}
	
	public static int[] bubblesort(int[] iArr) {
		int temp;
		for(int i=0;i<iArr.length;i++)
		{
			for(int j=i+1;j<iArr.length;j++)
			{
				if(iArr[i]>iArr[j])
				{
					temp=iArr[i];
					iArr[i]=iArr[j];
					iArr[j]=temp;
				}
			}
		}
		return iArr;
	}
	
	public static int[] remove(int[] data,int index)
	{
		int[] remove=new int[data.length-1];
		int tidx=0;//remove에 저장할 인덱스 위치를 알려줌
		for(int i=0;i<data.length;i++)//i는 data의 인덱스 위치를 알려줌
		{
		 if(i==index) continue;
		 remove[tidx]=data[i];
		 tidx++;
		}
		return remove;
	}
	
	public static int[] subArr(int[] data,int start,int end)
	{
		int[] subArr=new int[end-start];
		for(int i=0;i<subArr.length;i++)
		{
			subArr[i]=data[start+i];
		}
		return subArr;
	}
}
