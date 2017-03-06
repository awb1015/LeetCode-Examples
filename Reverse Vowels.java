import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		String myString = "hello";
		System.out.println(""+ reverseVowels(myString));
	}
	
	public static String reverseVowels(String s)
	{
	    Set<Character> set = new HashSet<>();
	    set.add('a');
	    set.add('e');
	    set.add('i');
	    set.add('o');
	    set.add('u');
	    set.add('A');
	    set.add('E');
	    set.add('I');
	    set.add('O');
	    set.add('U');
	    char[] list = s.toCharArray();
	    //Working with the string until we reach the end no default iterator
	    for(int i = 0, j = list.length-1; i<j;){
	        //If the character is not a vowel the continue along the string
	        if(!set.contains(list[i])){
	            i++;
	            continue;
	        }
	        //If the character starting from the end is not a vowel continue
	        if(!set.contains(list[j])){
	            j--;
	            continue;
	        }
	        //now we've established that i and j are vowels
	        //swap them with a temp variable, could also use bit manipulation
	        char temp = list[i];
	        list[i] = list[j];
	        list[j] = temp;
	        //Now we carry on
	        i++;
	        j--;
	        
	    }
	    return String.valueOf(list); 
	}
	
}
