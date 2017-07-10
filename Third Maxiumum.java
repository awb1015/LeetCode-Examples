

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		int[] myArray = {4,2,3,4,7,8};
		System.out.println(""+thirdMaxNum(myArray));
	}
	
	public static int thirdMaxNum(int[] numbers){
	    Integer max1 = null;
	    Integer max2 = null;
	    Integer max3 = null;
	    for(int i =0; i<numbers.length; i++){
	        Integer a = numbers[i];
	        if(a.equals(max1) || a.equals(max2) || a.equals(max3)){
	            continue;
	        }
	        if(max1 == null || a.equals(max1)){
	            max3 = max2;
	            max2 = max1;
	            max1 = a;
	        }
	        if(max2 == null || a.equals(max2)){
	            max3 = max2;
	            max2 = a;
	        }
	        if(max3 == null || a.equals(max3)){
	            max3 = a;
	        }
	    }
	    if(max3 == null){
	        return max1;
	        
	    }
	    else{
	        return max3;
	    }
	}
}
