package basic;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		char[] a= {'a','b','c','@','1','2','3','b'};
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a char:");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
        	if(a[i]==ch)
        	{
        		count++;
        	}
        }
        if(count==0)
        {
        	System.out.println("not present");
        	
        }
        else if(count==1)
        {
        	System.out.println("present");
        }
        else
        {
        	System.out.println("duplicate");
        }

	}
}




