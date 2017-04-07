//Given an 2D board, count how many battleships are in it. 
//The battleships are represented with 'X's, empty slots are represented with '.'s. 

//Assume valid board, ships are either vertical or horizontal, 

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) 
	{
	    char[][] shipBoard = ;
		System.out.println(""+countShips(shipBoard[][]));
	}
	
	public static int countShips(char[][] board){
	    int ships = 0;
	    for(int i=0; i<board.length; i++){
	        for(int j=0; j<board[0].length; j++){
	            //Check for blank case first
	            if(board[i][j] == '.'){
	                continue;
	            }
	            //We've now established the space contains a 'X'
	            //check for not horizontal
	            if(i>0 && board[i-1][j]== 'X'){
	                continue;
	            }
	            if(j>0 && board[i][j-1]=='X'){
	                continue;
	            }
	            //check for not vertical
	            ships++;
	        }
	    }
	    return ships;
	}

}
