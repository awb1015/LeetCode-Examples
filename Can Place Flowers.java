

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args) 
	{
		int[] Bed = {1,0,0,0,1};
		int flowers = 1;
		System.out.println(""+flowerBed(Bed, flowers));
	}
	
	public static Boolean flowerBed(int[] flowerArray, int newFlowers){
	    for(int i=1; i<flowerArray.length-1; i++){
	        if(flowerArray[i]==0 && flowerArray[i-1]==0 && flowerArray[i+1]==0){
	            newFlowers--;
	        }
	    }
	    if(newFlowers<=0){
	        return true;
	    }
	    else{
	        return false;
	    }
	    
	}
}
