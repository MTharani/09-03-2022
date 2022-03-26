package com.exception;

public class Example5 {

	public static void main(String[] args)
	{
		String s="abc";
		System.out.println("Before Parse");
		try {
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e)
		{
			System.out.println("name format exception");
			e.printStackTrace();
		}
		System.out.println("after Parse");
		System.out.println(s);
		

	}

}
