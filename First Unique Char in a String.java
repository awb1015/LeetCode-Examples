//Given a string, find the first non-repeating character in it and return it's index.
//If it doesn't exist, return -1.
//Can assume all lower case

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		System.out.println("Index is "+ firstUnique("balloonba"));
	}
	
	public static int firstUnique(String s){
	    int frequency[] = new int[26];
	    //Create bins for letters and count all
	    //This is similar to string anagram checks
	    for(int i = 0; i<s.length(); i++){
	        frequency[s.charAt(i) - 'a']++;
	    }
	    for(int i = 0; i<s.length(); i++){
	        if(frequency[s.charAt(i) - 'a'] == 1){
	            return i;
	        }
	    }
	    return -1;
	}
}
