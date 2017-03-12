//Given an array of numbers nums, in which exactly two elements appear only once and 
//all the other elements appear exactly twice. Find the two elements that appear only once.

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
	    int numArray[] = {1,2,3,4,5,3,2,1};
	    int missingNums = 0;
	    for(int i = 0; i<numArray.length ;i++){
	        missingNums = missingNums ^ numArray[i];
	    }
	    //Now missingNums is the XOR of the two missing values
	    missingNums = missingNums & -missingNums;
	    int results[] = {0,0};
	    for(int i = 0; i<numArray.length;i++){
	        if((numArray[i]&missingNums) == 0){
	            results[0]=results[0]^numArray[i];
	        }
	        else{
	            results[1]=results[1]^numArray[i];
	        }
	        
	    }
	    System.out.println(""+results[0]+" "+results[1]);
	}
	
}
