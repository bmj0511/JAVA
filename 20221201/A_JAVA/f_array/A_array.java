package com.mc.f_array;
import java.util.Arrays;
import java.util.Scanner;

public class A_array {
	public static void main(String[] args) 
	{
	shallowcopy();
	DeepCopy();
	DeepCopy2();
	}
	
	public static void shallowcopy()
	{
		String[] foodArr= {"치킨","피자","감튀","떡볶이","순대"};
		String[] copyArr=foodArr;//얕은복사
		copyArr[2]="장어덮밥";
		System.out.println("<얕은 복사>");
		System.out.println(Arrays.toString(foodArr));
		System.out.println(Arrays.toString(copyArr));//배열내용 한 번에 다 보여줌
	}
	public static void DeepCopy()
	{
		String[] foodArr= {"치킨","피자","감튀","떡볶이","순대"};
		String[] copyArr=foodArr.clone();//깊은복사
		copyArr[2]="장어덮밥";
		System.out.println("<깊은 복사>");
		System.out.println(Arrays.toString(foodArr));
		System.out.println(Arrays.toString(copyArr));//배열내용 한 번에 다 보여줌
	}
	public static void DeepCopy2()
	{
		String[] foodArr= {"치킨","피자","감튀","떡볶이","순대"};
		String[] copyArr=new String[foodArr.length];
		for(int i=0;i<copyArr.length;i++)
		{
			copyArr[i]=foodArr[i];
		}
		copyArr[2]="장어덮밥";
		System.out.println("<깊은 복사2>");
		System.out.println(Arrays.toString(foodArr));
		System.out.println(Arrays.toString(copyArr));
		
	}
}
