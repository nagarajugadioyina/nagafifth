package basic;

import naga.com16_11_22.arrays.String11;

@SuppressWarnings("unused")
public class Naga {
	public static void main(String[] args)
	{
	String s="sathya";
	char[] a=s.toCharArray();
    int i=0,j=a.length-1;
    
    while(i<j)
    {
    	char temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    	i++;
    	j--;
    }
	
	s=new String(a);
	for(int n=0;n<=a.length-1;n++)
	{
		System.out.print (a[n]);
	}

}
}
