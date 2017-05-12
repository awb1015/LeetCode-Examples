//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
//some elements appear twice and others appear once.
//Find all the elements of [1, n] inclusive that do not appear in this array.
//Could you do it without extra space and in O(n) runtime?

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] myList = {1,2,2};
		System.out.println(""+numsDisappeared(myList));
	}
	
	public static List<Integer> numsDisappeared(int[] nums){
	    List<Integer> toReturn = new ArrayList<Integer>();
	    for(int i = 0; i<nums.length; i++){
	        int value = Math.abs(nums[i]) -1;
	        //this if statement prevents duplicates from flipping an index to positive
	        if(nums[value] > 0 ){
	            nums[value] = -nums[value];
	        }
	    }
	    //Now run through and add the indicies with positive values to our array
	    for(int j = 0; j<nums.length; j++){
	        if(nums[j]>0){
	            toReturn.add(j+1);
	        }
	    }
	    return toReturn;
	    
	}
}
