//Given an arbitrary ransom note string and another string containing letters 
//from all the magazines, write a function that will return true if the ransom 
//note can be constructed from the magazines ; otherwise, it will return false.
//Each letter in the magazine string can only be used once in your ransom note.
//You may assume that both strings contain only lowercase letters.

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		String magazine = "goop";
		String note = "go";
		System.out.println(""+ransomNote(note, magazine));
	}
	
	public static boolean ransomNote(String note, String magazine){
	    //check edge cases first
	    if(magazine.length()<note.length() || magazine.isEmpty()){
	        return false;
	    }
	    
	    //create buckets and fill with available stock
	    int[] letterArray = new int[26];
	    for(int i = 0; i<magazine.length(); i++){
	        letterArray[magazine.charAt(i) - 'a']++;
	    }
	    //Check we have sufficient quantity of letters
	    for(int j = 0; j<note.length(); j++){
	        if(--letterArray[note.charAt(j) - 'a'] < 0){
	            return false;
	        }
	    }
	    return true;
	}
}
