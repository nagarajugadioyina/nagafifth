package basic;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Code2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter 2 numbers:");
			int a=sc.nextInt();
	 		int b=sc.nextInt();
			int c=a+b;
			System.out.println("sum:"+c);// TODO Auto-generated method stub
		}
		catch(InputMismatchException obj)
		{
		System.out.println("Exception:Input must be integers only ");
		
		}

	}

}
