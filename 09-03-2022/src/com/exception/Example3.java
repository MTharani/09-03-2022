package com.exception;

public class Example3 {

	public static void main(String[] args)
	{
		//  try and multiple catch
		int a=2, b=0, c=0;
		int arr[]=new int[5];
		System.out.println("before exception ");
		try
		{
			System.out.println("inside try");
			c=a/b;
			arr[6]=12;
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		
		

	}

}
