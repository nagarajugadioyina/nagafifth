package basic;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(6==sum)
	{
		System.out.println("perfect");
	}
	else 
	{
	System.out.println("not perfect");
	}
	}
	}
