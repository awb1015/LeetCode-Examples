

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] testArray = {1,2,3,4,5,6};
		int segmentlength = 2;
		System.out.println(""+maxArrayAv(testArray, segmentlength));
	}
	
	public static float maxArrayAv(int[] myArray, int length){
	    //First a sanity check
	    if(length>myArray.length){
	        return 0;
	    }
	    //Now calculate our current max
	    int localmax = 0;
	    for(int i=0; i<length;i++){
	        localmax += myArray[i];
	    }
	    int totalmax = 0;
	    //Now Use a Sliding Window and Hold onto the max from the sliding
	    for(int j=0, k=j+length; k<myArray.length;j++, k++){
	        //Calculate local maximum
	        localmax = localmax + myArray[k] - myArray[j];
	        //Compare local and total max
	        totalmax = Math.max(totalmax, localmax);
	    }
	    return (float)totalmax/length;
	}
}
