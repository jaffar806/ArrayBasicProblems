package arrays;

import java.util.Scanner;

public class AverageOfArry {

	
	public static void main(String[] args) 
	{
		int a[] =new int[5];

		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter the element of an array");
	      
	      int sum =0, avg = 0;
	      for (int i =0; i<5; i++)
	      {
	    	  a[i] =s.nextInt();
	    	  sum =sum + a[i];
	      }
	     
	           
	           avg =sum/5;
	       	System.out.println("Average of the elements :" +avg);

	            }

	}


