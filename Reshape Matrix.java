

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	}
	
	public static int[][] reshapeMatrix(int[][] input, int row, int column){
	    //Check if we can reshape first. We are assuming that the array is square
	    if(row*column != input.length *input[0].length || input.length==0){
	        return input;
	    }
	    int[][] reshapedArray = new int[row][column];
	    //Now we need to create a proper reshape
	    Queue<Integer> queue = new LinkedList<>();
	    for(int i=0; i<input.length; i++){
	        for(int j=0; j<input[0].length; j++){
	            //Add to queue
	            queue.add(input[i][j]);
	        }
	    }
	    //Populate new array
	    for(int i=0; i<row; i++){
	        for(int j=0; j<column; j++){
	            reshapedArray[i][j] = queue.remove();
	        }
	    }
	    return reshapedArray;
	}
}
