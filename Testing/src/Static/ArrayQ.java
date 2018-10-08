package Static;

public class ArrayQ {
	public static void main (String[] args) {
		int [] A = new int[5];
		System.out.println(A);
		int arr[] = new int[2];  
	     System.out.println(arr[0]);
	     System.out.println(arr[1]);
		// This will print garbage value
		// new operator is used to allocate memory to array variable.
		//In java array is object
		//All object allocated on heap, so array also allocated on heap
		//int B[2];
	/*	System.out.println(B[0]);
		System.out.println(B[1]);*/
	}

}
