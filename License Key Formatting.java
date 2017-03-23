
//You are given a string S, which represents a software license key which we would like to format. 
//he string S is composed of alphanumerical characters and dashes. The dashes split the alphanumerical
//characters within the string into groups. (i.e. if there are M dashes, the string is split into M+1 groups).
//The dashes in the given string are possibly misplaced.

//We want each group of characters to be of length K (except for possibly the first group, which could
//be shorter, but still must contain at least one character). To satisfy this requirement, we will
//reinsert dashes. Additionally, all the lower case letters in the string must be converted to upper case.

//So, you are given a non-empty string S, representing a license key to format, and an integer K. 
//And you need to return the license key formatted according to the description above.

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		String myString = "2-4A0r7-4k";
		int n = 4;
		System.out.println(keyFormat(myString, n));
	}
	
	public static String keyFormat(String str, int n){
	    str = str.replace("-", "").toUpperCase();
	    //Create a new StringBuilder
	    StringBuilder newSB = new StringBuilder();
	    newSB.append(str);
	    //Now we need to insert "-"" in correct positions start at the end
	    int i = newSB.length() - n;
	    while(i>0){
	        newSB.insert(i, "-");
	        i = i - n;
	    }
	    return newSB.toString();
	}
	
	
}
