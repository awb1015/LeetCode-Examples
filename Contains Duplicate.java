

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		int[] testArray = {1,2,3,4,5};
		System.out.println(""+containsDup(testArray));
	}
	
	public static boolean containsDup(int[] myArray){
	    //Check list, if there are duplicates return false, otherwise return true
	    //Create new charset
	    Set<Integer> mySet = new HashSet<>();
	    for(int i=0; i<myArray.length;i++){
	        if(mySet.contains(myArray[i])){
	            return false;
	        }
	        else{
	            mySet.add(myArray[i]);
	        }
	    }
	    return true;
	}
}
