package arrays;

import java.util.Scanner;

public class CopyArrayElements {

	public static void main(String[] args) 
	{
	int a[] =new int[5];
	int b[] =new int[5];

	  Scanner s = new Scanner(System.in);
      System.out.println("Enter the element of an array");
      a[0]=s.nextInt();
      a[1]=s.nextInt();
      a[2]=s.nextInt();
      a[3]=s.nextInt();
      a[4]=s.nextInt();
	
      System.out.println("below values are stored in b array");
      for (int i=0; i<5; i++ )
      {
    	 
    	  b[i] = a[i];
    	  
    	  System.out.print(b[i]+ " ");
    	
      } 
	}

}
