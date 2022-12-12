package com.mc.a_modifier;

public class A_accessModifier {
//제한자(modifier) - 접근제한자(public/protected/private/default)
	             //- 그 외 제한자(static/final/abstract/void/synchronized)
	public static void publicMethod()
	{
		System.out.println("접근제한자가 public");
	}
	
	static void defaultMethod()
	{
		System.out.println("접근제한자가 default");
	}
	protected static void protectedMethod()
	{
		System.out.println("접근제한자가 protected");
	}
	private static void privateMethod()
	{
		System.out.println("접근제한자가 private");
	}
}
