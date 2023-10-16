package arrays;

public class ArrangeElementsInAscendingOder {

	public static void main(String[] args)
	{
		int a[] =new int[] {4,1,7,3,2};
		System.out.println("unarranged numbers: 4,1,7,3,2"); 
		int tem;
		for (int i=0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
			if (a[i]>a[j])
			{
				tem =a[i];
				a[i]=a[j];
				a[j]=tem;
			}
			}
		}System.out.print("Above values are arranged: "); 
		for (int i=0;i<a.length; i++)
			{
			  System.out.print(a[i]+ " ");
			}

	}

}
