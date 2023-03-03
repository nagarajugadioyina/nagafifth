package basic;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Code3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter integer:");		
		    int n=sc.nextInt();
		   System.out.println("Input n value:"+n);
	      }
	      catch(InputMismatchException e){
		           System.out.println("Exception:Please enter integer only");// TODO Auto-generated method stub

	}

}
}
