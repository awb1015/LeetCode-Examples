

import java.util.*;
import java.lang.*;
import java.io.*;

//Given a string s and a string t, check if s is subsequence of t.
//You may assume that there is only lower case English letters in both
//s and t


class AlgoPractice
{
	public static void main (String[] args)
	{
		String s = "eho";
		String t = "hello";
		System.out.println(""+isSubstring(s, t));
	}
	
	public static Boolean isSubstring(String s, String t){
	    if(t.length()<s.length()){
	        return false;
	    }
	    int prev = 0;
	    for(int i = 0 ; i<s.length(); i++){
	        char tempChar = s.charAt(i);
	        prev = t.indexOf(tempChar, prev);
	        if(prev == -1){
	            return false;
	        }
	        prev++;
	    }
	    return true;
	}
}
