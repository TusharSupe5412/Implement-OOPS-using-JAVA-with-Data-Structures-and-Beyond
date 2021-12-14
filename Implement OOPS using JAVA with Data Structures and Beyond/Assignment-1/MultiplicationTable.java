package myPackage;

import java.util.Scanner;

public class MultiplicationTable 
{

	public static void main(String[] args)
	{
		
//	Taking input from user

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int mul=sc.nextInt();
		
//		Condition check & printing output
		
		for (int j=1; j<=10; j++)
			System.out.println(+mul+"*"+j+"="+(mul*j));
			
		sc.close();
	}

}
