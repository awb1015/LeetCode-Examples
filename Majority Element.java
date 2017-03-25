//Given an array of size n, find the majority element. The majority element is the element
//that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AlgoPractice
{
	public static void main (String[] args)
	{
		int myArray[] = {1,2,3,5,5,2,1,5,5};
		int count = 1;
		int major = myArray[0];
		for(int i = 0; i<myArray.length; i++){
		    if(count == 0 ){
		        count++;
		        major = myArray[i];
		    }
		    if(myArray[i]==major){
		        count++;
		    }
		    else{
		        count--;
		    }
		}
		System.out.println(""+major);
	}
	
	
}
