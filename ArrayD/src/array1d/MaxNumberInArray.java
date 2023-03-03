package array1d;

import java.util.Arrays;

public class MaxNumberInArray {
	public static void main(String []arg) {
	
	int a[] = {23,45,35,68,89,46,54,78,2,4,289,3,4,6,5};
	System.out.println(Arrays.toString(a));
     max(a);
     
}
    public static void max(int a[] ) {
    	
    	int  max = a[0]; 
    	for(int i=0; i<a.length; i++) {
    		if(max<a[i]) {
    			max = a[i];
    		}
    	}
    	System.out.println(max);
    	
    }
	
}
