package arrays;

import java.util.Scanner;

public class LetgthOfArray
{
	static  int a[] = new int[5]; 
  
	void rever()
	{
		 for (int i=0; i<5; i++ )
	      {
	    	 
	    	  System.out.print(a[i]+ " ");
	    	
	      }  
	       System.out.println("reverse");
	      for (int i=a.length-1; i>=0; i-- )
	      {
	    	 
	    	  System.out.print(a[i]+ " ");
	    	
	      }
	         
	}

	public static void main(String[] args) 
	{
     //creating an array of size 5
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the element of an array");
      a[0]=s.nextInt();
      a[1]=s.nextInt();
      a[2]=s.nextInt();
      a[3]=s.nextInt();
      a[4]=s.nextInt();
     
      LetgthOfArray ds = new LetgthOfArray();
      ds.rever();
			
	}
		
		
		
		
}

	
