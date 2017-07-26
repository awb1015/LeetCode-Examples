

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] myArray = {1,2,4,4};
		System.out.println(""+setMismatch(myArray));
	}
	
	public static int[] setMismatch(int[] numset){
	    //Array is not sorted, some input validation?
	    Set<Integer> mySet = new HashSet<>();
	    int n = numset.length;
	    long sum = (n*(n+1))/2;
	    int duplicate = 0;
	    //Run through array and subtract from sum
	    for(int i=0; i<n;i++){
	        if(mySet.contains(numset[i])){
	            duplicate = numset[i];
	        }
	        sum -= numset[i];
	        mySet.add(numset[i]);
	    }
	    int[] resultArray = {duplicate, (int)sum+duplicate};
	    return resultArray;
	}
}
