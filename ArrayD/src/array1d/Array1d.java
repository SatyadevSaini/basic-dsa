package array1d;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array1d {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaration of Array
		int s = sc.nextInt();
		int a[] = new int[s];
		
		// enter the values in the Array //working 
		for(int i=0; i<a.length;i++) {
			
			a[i]= sc.nextInt();
		}
		
		//print values using for loop 
//           for(int i=0; i<a.length;i++) {
//			
//			System.out.print(a[i] +"  ");
//		}
           
           
        //print values using for each loop
          
//           for(int num : a) {
//        	   System.out.print(num + " ") ;
//           }
		
		
		
		// 3 way using Arrayclass ..
		
		System.out.println(Arrays.toString(a)); // best way ... // java.util.Arrays 
		
	}

}
