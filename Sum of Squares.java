

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args)
	{
		System.out.println(""+sumOfSquares(9));
	}
	
	public static Boolean sumOfSquares(int num){
	    //Check Negative 
	    if(num<0){
	        return false;
	    }
	    int a = 0;
	    int b = (int)Math.sqrt(num);
	    while(a<b){
	        int guess = a*a + b*b;
	        if(guess<num){
	            a++;
	        }
	        else if(guess>num){
	            b--;
	        }
	        else{
	            return true;
	        }
	    }
	    return false;
	}
}
