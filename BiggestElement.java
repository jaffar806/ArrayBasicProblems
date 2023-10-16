package arrays;

import java.util.Scanner;

public class BiggestElement {

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		   Scanner s = new Scanner(System.in);
		  System.out.print("Enter Array numbers ");
		   for(int i=0; i<5; i++)
		   {
		      a[i]=s.nextInt();
		   }
		   int max = a[0]; //we are storing here a[0] value in max int variable and then i'm using if condition to find out the largest number among numbers 
		   for(int i =1; i<5; i++)
		   {
		   
			   if (a[i]>max)
		       {
			      max =a[i];
			   
		       }
	       }System.out.println("maximum number is: "+max);

	}
	}
