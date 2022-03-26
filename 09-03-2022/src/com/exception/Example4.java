package com.exception;

public class Example4 {

	public static void main(String[] args) 
	{
	//   multiple try and catch
			int a=2, b=0, c=0;
			int arr[]=new int[5];
			System.out.println("before exception ");
			try
			{
				System.out.println("inside try 1st block");
				c=a/b;
			}catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			try
			{
				System.out.println("inside try 2nd block");
				arr[6]=12;
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
