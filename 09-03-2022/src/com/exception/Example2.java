package com.exception;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		//Array error
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element:");
		for(int i=0; i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array of element");
		for(int i=0; i<a.length+1;i++)
		{
			try
			{
				System.out.println(a[i]);	
			}catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				sc.close();
			}
		}
		System.out.println("statment after the loop");




	}

}
