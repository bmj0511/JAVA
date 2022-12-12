package com.mc.f_array;
import java.util.Arrays;
import java.util.Scanner;

public class B_dimensionArray {
	public static void main(String[] args) 
	{
		DArr();
		int[][] dArr=new int[2][];
		dArr[0]=new int[3];
		dArr[1]=new int[2];
		int count=1;
		for(int i=0;i<dArr.length;i++)
		{
			for(int j=0;j<dArr[i].length;j++)
			{
				dArr[i][j]=count++;
			}
			System.out.println(Arrays.toString(dArr[i]));
		}
		
	}

	private static void DArr() //고정배열
	{
		int[][] dArr=new int[3][4];
		dArr[0][0]=1;
		dArr[0][1]=2;
		dArr[0][2]=3;
		dArr[0][3]=4;
		
		System.out.println(System.identityHashCode(dArr));
		System.out.println(System.identityHashCode(dArr[0]));
		System.out.println(System.identityHashCode(dArr[0][0]));
	}
}
