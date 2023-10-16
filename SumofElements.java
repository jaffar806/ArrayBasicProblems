package arrays;

import java.util.Scanner;

public class SumofElements 
{

	public static void main(String[] args)
	{
		int a[] =new int[5];

		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter the element of an array");
	     
		
	      int sum =0; 
	      for (int j=0; j<5; j++)
	      {
	    	  a[j] =s.nextInt();
	      }
	          for (int i=0; i<5; i++ )
	           {
	    	     sum =sum +a[i];
	           }
	      System.out.print("sum of the elements of an array is: " + sum);
	            
	}
}
