package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args)
	{
		int a[] = new int[5];
		
		   Scanner s = new Scanner(System.in);
		  System.out.println("Enter Array numbers ");
		   for(int i=0; i<5; i++)
		   {
		      a[i]=s.nextInt();
		   }
		   System.out.println("Entered array elements: "+Arrays.toString(a));
		   int min = a[0]; //we are storing here a[0] value in max int variable and then i'm using if condition to find out the largest number among numbers 
		   for(int i =1; i<5; i++)
		   {
		   
			   if (a[i]<min) //we are only changing > opereator to < to find minimum value and we changed max variable to min
		       {
			      min =a[i];
			   
		       }
	       }System.out.println("minimum Array element is: "+min);

	}

}
