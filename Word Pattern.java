//Given a pattern and a string str, find if str follows the same pattern.
//ou may assume pattern contains only lowercase letters, and str contains 
//lowercase letters separated by a single space.

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String words = "cat dog cat";
		String pattern = "aba";
		System.out.println(""+wordPattern(pattern, words));
	}
	
	public static Boolean wordPattern(String pattern, String words){
	    //take care of edge cases before running algo
	    if(pattern.isEmpty() || words.isEmpty() || words.length()==0 || pattern.length()==0){
	        return false;
	    }
	    String[] wordlist = words.split(" ");
	    //Double check the inputs are correct length first
	    if(wordlist.length != pattern.length()){
	        return false;
	    }
	    //Now create our hashmap
	    HashMap<Character, String> patternDict = new HashMap<Character, String>();
	    for(int i=0; i<pattern.length(); i++){
	        //if key isn't in hashmap we add
	        if(patternDict.get(pattern.charAt(i))==null){
	            patternDict.put(pattern.charAt(i), wordlist[i]);
	            continue;
	        }
	        //if the key is in the hashmap retrieve the value and compare
	        else{
	            //if the values don't match return a false
	            if(!wordlist[i].equals(patternDict.get(pattern.charAt(i)))){
	                return false;
	            }
	        }
	   }
	   return true;
	}
}
