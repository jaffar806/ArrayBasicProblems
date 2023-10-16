package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortMethod {

	public static void main(String[] args)
	{
	   int a[] = new int[5];
	   Scanner s = new Scanner(System.in);
	  System.out.print("Enter the random numbers");
	   for(int i=0; i<5; i++)
	   {
	      a[i]=s.nextInt();
	   }
	   Arrays.sort(a);  //sort method will directly sort the array elements to the ascending order
	   for(int i=0; i<5; i++)
	   {
	      System.out.print(a[i]+ " ");
	   }
	}

}
