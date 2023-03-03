package array1d;

import java.util.Arrays;

public class MaximumElementInRange {
      public static void main(String[] args) {
    	  
    	  int a[] = {23,45,35,68,89,46,54,78,2,4,289};
  		  System.out.println(Arrays.toString(a));
  		  maxrange(a, 0, 6);
  		  
    	  
	}
      
      static void maxrange(int a[] , int start , int end ) {
    	  int max = a[0];
    	  for(int i=start ; i<end; i++) {
    		  if(max<a[i]) {
    			  max = a[i];
    		  }
    	  }
    	  System.out.println(max);
      }

	}

