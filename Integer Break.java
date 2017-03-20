//Given a positive integer n, break it into the sum of at least two positive 
//integers and maximize the product of those integers. Return the maximum product you can get.

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		System.out.println(numBreak(10));
	}
	
	public static int numBreak(int n){
	    if (n==2){
	        return 1;
	    }
	    if(n==3){
	        return 2;
	    }
	    int product = 1;
	    while(n>4){
	        product = product * 3;
	        n = n - 3;
	    }
	    //Now multiply by whatever is left over from n
	    product = product*n;
	    
	    return product;
	}
}
