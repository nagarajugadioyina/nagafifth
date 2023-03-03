package basic;

public class Largest {

	public static void main(String[] args) {
		int[] a={2,6,7,3,4};
		int large=a[0];
		int small=a[0];
		int x=0,y=0;
		for(int i=1;i<a.length-1;i++)
		{
			if (a[i]>large)
			{
				large=a[i];
				x=i;// TODO Auto-generated method stub
			}
			if(a[i]<small)
			{
				small=a[i];
				y=i;
			}
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
		}		
System.out.println(a[x]);
System.out.println(a[y]);
	}

}
