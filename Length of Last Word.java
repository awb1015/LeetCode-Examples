
import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		String testing = "this is a test";
		System.out.println("The length of the last word is " + lengthOfLastWord(testing));
	}
	
	public static int lengthOfLastWord(String words){
	    //Nothing is explained about what we should do if the last character is a space...
	    words = words.trim();
	    int i = 0;
	    i = words.length()-1;
	    int length = 0;
	    while(words.charAt(i)!= ' '){
	        length++;
	        i--;
	        if(i==-1){
	            return 0;
	        }
	    }
	    return length;
	}
}
