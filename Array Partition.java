
import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		int[] testing = {1,3,4,3,6,1};
		System.out.println(""+arrayPartition(testing));
	}
	
	public static int arrayPartition(int[] myArray){
	    int result = 0;
	    //Sort Array
	    Arrays.sort(myArray);
	    //Then add every other number
	    for(int i=0; i<myArray.length; i+=2){
	        result = result + myArray[i];
	    }
	    return result;
	}
}
