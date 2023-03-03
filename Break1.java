package basic;
import java.util.Scanner;
public class Break1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter num:");
			int n=sc.nextInt();
			if(n%2==0)
				System.out.println("Even number");
			else
			System.out.println("Odd number");
			System.out.print("Do you want to check another number(y/n)");
			 char ch=sc.next().charAt(0);
			 if(ch=='n') 
				 break;
		}

	}

}
