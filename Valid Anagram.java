import java.util.*;
import java.lang.*;
import java.io.*;

//Given two strings s and t, write a function to determine if t is an anagram of s.
//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
//You may assume the string contains only lowercase alphabets.

class AlgoPractice
{
	public static void main (String[] args)
	{
	    String str1 = "hello";
	    String str2 = "loleh";
		System.out.println(""+anagramCheck(str1, str2));
	}
	
    //26 index array, add one for string s, subtract one for string t
    //if the array is all 0 at the end, return true
	public static boolean anagramCheck(String stringone, String stringtwo)
	{
	    int letterArray[] = new int[26];
	    for(int i=0; i<stringone.length();i++){
	        letterArray[stringone.charAt(i) - 'a']++;
	    }
	    for(int i=0; i<stringtwo.length(); i++){
	        letterArray[stringtwo.charAt(i) - 'a']--;
	    }
	    //Now ensure that array is empty
	    for(int i=0; i<letterArray.length; i++){
	        if(letterArray[i]!=0){
	            return false;
	        }
	    }
	    return true;
	}
	
	
}