import java.util.*;
import java.lang.*;
import java.io.*;


//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
//find the one that is missing from the array.

class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int nums[] = {0,1,2,3,4,6};
		int missingNo = missingNo(nums);
		System.out.println("The missing numbers is "+missingNo);
	}
	
	public static int missingNo(int nums[]){
	    //Process empty array and empty set first
	    if(nums == null || nums.length ==0){
	        return 0;
	    } 
	    
	    int sum = 0;
	    for(int i = 0; i<nums.length; i++){
	        sum = sum + nums[i];
	    }
	    int triangularNum = 0;
	    triangularNum = (nums.length*(nums.length+1))/2;
	    return (triangularNum - sum);
	}
}
