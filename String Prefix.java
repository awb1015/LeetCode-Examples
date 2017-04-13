//Write a function to find the longest common prefix string amongst an array of strings.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] strs = {"hello", "hell"};
		System.out.println(""+prefixCheck(strs));
	}
	
	public static String prefixCheck(String[] strs){
	    //Make sure the array exists and has entries
	    if(strs.length==0||strs ==null){
	        return "";
	    }
	    //Now return 0 index item if there's only one string
	    if(strs.length == 1){
	        return strs[0];
	    }
	    //Now the algorithm after the edge cases
	    String first = strs[0];
	    int i = 1;
	    while(i<strs.length){
	        while(strs[i].indexOf(first)!=0){
	            first = first.substring(0, first.length()-1);
	        }
	    }
	    return first;
	}
}
