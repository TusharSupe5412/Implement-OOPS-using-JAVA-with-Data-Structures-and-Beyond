package myPackage;

import java.util.Scanner;

public class Factorial 
{
	
	
	
	public static void main(String[] args) 
	{
//		Taking input from user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		
//		Executing the condition
		int fact = 1;
		for(int i=1; i<=a;i++)
		{
			fact=fact*i;
		}
		
//		Printing the output
		System.out.println("Factorial of "+a+" is: "+fact);

//		Closing object
		sc.close();
	}

}
