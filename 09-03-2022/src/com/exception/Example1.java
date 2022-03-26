package com.exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		// Exception handling:handle run time error
		int a, b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first name:");
        a=sc.nextInt();
        System.out.println("enter the second name:");
        b=sc.nextInt();
        System.out.println("Before Division");
        try {
        c=a/b;
        }catch(ArithmeticException e)
        {
        	e.printStackTrace();
        	System.out.println("catch block");
        }
        finally
        {
        	System.out.println("finally block");
        }
        System.out.println("Ater division");
        System.out.println("Program other statment");
        sc.close();
        
        
	}

}
