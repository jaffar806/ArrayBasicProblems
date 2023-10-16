package arrays;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args)
	{
		//== and equals(); comparing 
		//equal method is static method and check only array data
		//== will only check the reference variable (if the reference variable is not equal it show error)
		//two operands required for comparing array
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};
         if (Arrays.equals(a, b))
         {
        	 System.out.println("Both are equal");
         }else 
         {
        	 System.out.println("Both are not equal");
         }
        
	
	}

}
