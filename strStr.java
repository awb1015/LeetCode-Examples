
import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String haystack = "help";
		String needle = "LP";
		System.out.println(""+strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle){
	    if(haystack.length()<= needle.length()||needle.length()==0 || haystack.length()==0){
	        return -1;
	    }
	    //Need to ensure all chars compared are the same case
	    for(int i=0; i<haystack.length(); i++){
	        for(int j=0; j<needle.length(); j++){
	            //If there's a mismatch at any point move to the next char in haystack
	            if(haystack.toLowerCase().charAt(i+j)!= needle.toLowerCase().charAt(j)){
	                break;
	            }
	            //Now if we get to j==length-1 without a break we've had success
	            if(j==needle.length()-1){
	                return i;
	            }
	            //Now we need to address if there's a match thus far but we go beyond haystack.length
	            if(i+j==haystack.length()-1){
	                break;
	            }
	        }
	    }
	    //If we get to the end without returning i then we've exhausted possibilities
	    return -1;
	}
}
