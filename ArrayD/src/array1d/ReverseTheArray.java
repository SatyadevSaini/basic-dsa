package array1d;

import java.util.Arrays;

public class ReverseTheArray {
	   
	public static void main(String[] args) {
		 int b[] = {23,45,35,68,89,46,54,78,2,4,289};
 		 System.out.println(Arrays.toString(b));
 		 
 		 reverse(b);
 		 
 		  
	}
	static void reverse(int b[]) {
		
		//reverseLogic
		for(int i=b.length-1;i>=0;i--) {
			System.out.println(b[i]);
			}
			
		}
		
		
	}
	


