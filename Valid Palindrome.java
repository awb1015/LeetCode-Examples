//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String testString = ":baB";
		System.out.println(""+validPalindrome(testString));
	}
	
	public static boolean validPalindrome(String myString){
	    //Check for empty string before running algorithm
	    if(myString.isEmpty() || myString.length()==0){
	        return false;
	    }
	    //Two pointer solution
	    //Verify char at pointer is a letter or digit, once both are we check they're the same
	    //Exit loop when we've pointers pass each other
	    int i = 0;
	    int j = myString.length()-1;
	    while(i<j){
	        if(!Character.isLetterOrDigit(myString.charAt(i))){
	            i++;
	            continue;
	        }
	        
	        if(!Character.isLetterOrDigit(myString.charAt(j))){
	            j--;
	            continue;
	        }
	        //Account for capitals when comparing
	        if(Character.toLowerCase(myString.charAt(i))==Character.toLowerCase(myString.charAt(j))){
	            i++;
	            j--;
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	    
	}
}
