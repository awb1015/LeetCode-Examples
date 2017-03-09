//Write a function that takes an unsigned integer and returns the number of 1 bits it has

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) 
	{
	    System.out.println(""+hammingWeight(1));
	    System.out.println(""+hammingWeight(2));
	    System.out.println(""+hammingWeight(3));
	}
	
	public static int hammingWeight(int n){
	    int numOfBits = 0;
	    while(n!=0){
	        //Check if right most bit is a 1 or 0
	        //And add it to our total
	        numOfBits = numOfBits + (n & 1);
	        //Now bit shift to the right
	        n = n>>>1;
	    }
	    return numOfBits;
	}
}
