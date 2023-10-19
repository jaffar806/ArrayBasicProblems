package  Array;
public class PrintArrayElements 
{ 
	 //method name and class name is same because of constructor
	 PrintArrayElements(int[] a) // array a arguments are int type
	{
	 for(int num : a) // store all array values of a in num
	 {
		 System.out.print(num+ " ");
		 
	 }
	}

	public static void main(String[] args)
	{
	  int a[] = new int[] {10, 20, 30, 40, 50};
		//call using constructor method 
		PrintArrayElements ae = new PrintArrayElements(a);//a means arguments passing a arguments to constructor
	   
		//above array a contains int values identified as ae
	}

}
