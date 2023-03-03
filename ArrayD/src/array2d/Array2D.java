package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// 2 d array 
	  //take size of 2 d Array 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array Rows & Columns:");
	  int rs= sc.nextInt();	 // rowSize
	  int cs= sc.nextInt();	 // ColumnSize
	  
	  
	  int a[][] = new int[rs][cs];
	  
	  
	  System.out.println("Enter the Elements in the Array");
	  // enter the elements now 
	  for(int row =0;  row<a.length; row++ ) {
		  
		  for(int col=0; col<a[row].length;col++) {
			  
			  a[row][col] = sc.nextInt();  
		  }
		  
	  }
	  
	  System.out.println("Here's the array");
	  for (int[] d : a) {
		System.out.println(Arrays.toString(d) );
	}
	 
	  
	

	}

}
