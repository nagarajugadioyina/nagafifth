package basic;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Code {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter 2 nums:" );
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Result:"+c);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Exception:Input must be integers only ");
		}
	    catch(ArithmeticException e2)
		{
		System.out.println("Exception:Denominator should not be zero");
		}
	}

}
