package arrays;

public class ArrangeElementsInDecendingOder {

	public static void main(String[] args) 
	{
		int a[] =new int[] {4,1,7,3,2};
		 System.out.println("unarranged : 4,1,7,3,2"); 
		int tem;
		for (int i=0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
			if (a[i]<a[j])  //only changing here > to < will arrange the number to descending order
			{
				tem =a[i];
				a[i]=a[j];
				a[j]=tem;
			}
			}
		}System.out.println("arranged values are: "); 
		for (int i=0;i<a.length; i++)
			{
			  System.out.print(a[i]+ " ");
			}
	

	}

}
