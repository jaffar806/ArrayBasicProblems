package arrays;

import java.util.Scanner;

public class SerchingElementsOfArray
{

	public static void main(String[] args) 
	{
		int a[] =new int[] {10,20,3,45,5};
		Scanner s = new Scanner(System.in);
	      
	      System.out.println("enter the searching value");
		   int sr= s.nextInt();
		  
			for (int j =0; j<5; j++) 
			{
			   if (a[j]== sr)
			   {
				System.out.println("value found");
		       }
			    	
             }System.out.println("value not found");
    
		

	}

}
