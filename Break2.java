package basic;
import java.util.Scanner;
public class Break2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.quit");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result:"+(a+b));// TODO Auto-generated method stub
			}
			else if(ch==2)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result:"+(a-b));				
			}
			else if(ch==3)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result:"+(a*b));				
			}
			else if(ch==4)
			{
				System.out.println("Enter input:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result:"+(a/b));				
			}
			else if(ch==5)
			{
				System.out.println("End");
				System.exit(1);
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}

	}

}
