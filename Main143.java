package basic;

public class Main143 {

	public static void main(String[] args) {
		System.out.println("Main method");
	    First.m1();
	    Second obj=new Second();
	    obj.m2();
	}

}
class First
{
	static void m1()
	{
		System.out.println("First m1()");
	}
}
class Second
{
	void m2()
	{
		System.out.println("Second m2()");
	}
}
