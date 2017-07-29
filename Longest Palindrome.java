

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
	    String myString = "aghaaee";
		System.out.println(""+longestPalindrome(myString));
	}
	
	public static int longestPalindrome(String inputLetters){
	    //Input validation first
	    if(inputLetters ==null || inputLetters.length()==0){
	        return 0;
	    }
	    int count = 0;
	    HashSet<Character> mySet = new HashSet<Character>();
	    for(int i=0; i<inputLetters.length(); i++){
	        if(mySet.contains(inputLetters.charAt(i))){
	            mySet.remove(inputLetters.charAt(i));
	            count++;
	        }
	        else{
	            mySet.add(inputLetters.charAt(i));
	        }
	    }
	    //Each count represents a pair of letters, if there's anything else left
	    //Then our palindrom has twice count plus an additional letter in the middle
	    if(!mySet.isEmpty()){
	        return count*2 + 1;
	    }
	    else{
	        return count*2;
	    }
	}
}
