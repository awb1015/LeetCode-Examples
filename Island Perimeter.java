//You are given a map in form of a two-dimensional integer grid where 1 represents land 
//and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). 
//The grid is completely surrounded by water, and there is exactly one island (i.e., one or 
//more connected land cells). The island doesn't have "lakes" (water inside that isn't connected 
//to the water around the island). One cell is a square with side length 1. The grid is rectangular, 
//width and height don't exceed 100. Determine the perimeter of the island.

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
    //The key here is each island or '1' gives us four sides
    //However a neighboring island removes two sides where it joins
    //Therefore the permimeter is islands*4 - neighbors*2
	public static void main (String[] args)
	{
	    int[][] grid;
		int islands = 0;
		int neighbors = 0;
		for(int i = 0; i<grid.length; i++){
		    for(int j=0; j<.grid[i].length; j++){
		        if(grid[i][j]==1){
		            islands++;
		            if(i<grid.length-1 && grid[i+1][j] == 1){
		                neighbors++;
		            }
		            if(j<grid[i].length-1 && grid[i][j+1] == 1){
		                neighbors++;
		            }
		        }
		    }
		}
		return (islands*4)-(neighbord*2);
	}
}
