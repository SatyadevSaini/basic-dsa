package array1d;

import java.util.Arrays;

public class SwapIndex {

	public static void main(String[] args) {
	
		// create array 
		int a[] = {23,45,35,68,89,46,54,78,2,4,289};
		System.out.println(Arrays.toString(a));
		 swap(a, 1, 3);
		 System.out.println(Arrays.toString(a));
     
	}
	public static void swap(int a[] , int index1 , int index2) {
		
		 int temp = a[index1];
		 a[index1]= a[index2];
		 a[index2] = temp;	
		 
	}

}
