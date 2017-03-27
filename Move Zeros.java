//Given an array nums, write a function to move all 0's to the end of 
//it while maintaining the relative order of the non-zero elements.
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		int[] nums = {1,2,0,3,4,2,3};
		moveZeros(nums);
		System.out.println(nums);
	}
	
	public static void moveZeros(int[] nums){
	    //Verify the input exists and has a non-zero value
	    if(nums == null || nums.length == 0){
	        return;
	    }
	    int insertPosition = 0;
	    for(int i=0; i < nums.length; ++i){
	        if(nums[i]!=0){
	            int temp = nums[insertPosition];
	            nums[insertPosition++] = nums[i];
	            nums[i] = temp;
	        }
	    }
	}
}
