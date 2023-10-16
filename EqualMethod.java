package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualMethod {

	public static void main(String[] args) 
	{
		 int a[] = new int[5];
		 int b[] = new int[5];
		   Scanner s = new Scanner(System.in);
		  System.out.print("Enter the a random numbers ");
		   for(int i=0; i<5; i++)
		   {
		      a[i]=s.nextInt();
		   }
		   System.out.print("Enter the b random numbers ");
		   for(int i=0; i<5; i++)
		   {
		      b[i]=s.nextInt();
		   }
	     System.out.println("true means a and b values are equal,\nfalse means a and b values are not equal\n");
		 boolean st = Arrays.equals(a, b);
		 System.out.println("Answer is: "+st);

	}

}
