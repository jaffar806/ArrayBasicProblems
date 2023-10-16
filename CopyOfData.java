package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfData {

	public static void main(String[] args)
	{
		int a[] = new int[5];
	
		   Scanner s = new Scanner(System.in);
		  System.out.print("Enter the a elements numbers ");
		   for(int i=0; i<5; i++)
		   {
		      a[i]=s.nextInt();
		   }
		   int b[] =Arrays.copyOf(a, 5);
		   System.out.println("a elements are copied in b: ");
		   for(int i=0; i<5; i++)
		   {
		      System.out.print(b[i]+ " ");
		   }
	}
	

}
