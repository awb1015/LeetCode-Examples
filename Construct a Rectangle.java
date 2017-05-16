/*For a web developer, it is very important to know how to design a web page's size. 
So, given a specific rectangular area, your job by now is to design a rectangular
web page, whose length L and width W satisfy the following requirements:

1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
You need to output the length L and the width W of the web page you designed in sequence.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class AlgoPractice
{
	public static void main (String[] args)
	{
		System.out.println(""+constructRectangle(26));
	}
	
	public static int[] constructRectangle(int area){
	    int[] sides = new int[2];
	    //Check to ensure we avoid the algorithm for zero case
	    if(area == 0){
	        return sides;
	    }
	    int a = (int)Math.sqrt(area);
	    //Now decrement a until we have a factor of area
	    while(area%a != 0){
	        a--;
	    }
	    sides[0] = area/a;
	    sides[1] = a;
	    return sides;
	    
	}
}
