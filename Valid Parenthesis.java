

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		String myString = "()";
		System.out.println(""+validParanthesis(myString));
	}
	
	public static boolean validParanthesis(String str){
	    //Odd length strings cannot have a valid parenthesis
	    //if(str.length() % 2!=0){
	      //  return false;
	    //}
	    
	    Stack<Character> stack = new Stack<Character>();
	    
	    //Now run through the string using a stack
	    for(int i = 0; i<str.length(); i++){
	        if(str.charAt(i) == '('){
	            stack.push(')');
	        }
	        else if(str.charAt(i) == '['){
	            stack.push(']');
	        }
	        else if(str.charAt(i) == '{'){
	            stack.push('}');
	        }
	        //If we reach this state the stack should have a char on it that matches the char read
	        if(stack.isEmpty() || stack.pop()!=str.charAt(i)){
	            return false;
	        }
	    }
	    return stack.isEmpty();
	}
}
