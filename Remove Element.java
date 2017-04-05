//Given an array and a value, remove all instances of that value in place and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.


import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		int[] arrayToEdit = {1,2,3,2,4,2};
		int numberToRemove = 2;
		System.out.println(""+arrayRemove(arrayToEdit, numberToRemove));
	}
	
	public static int arrayRemove(int[] A, int element){
	    int length = A.length;
	    int start = 0;
	    for(int i = 0; i<length; i++){
	        if(A[i]!=element){
	            A[start++] = A[i];
	        }
	    }
	    return start;
	}
}
