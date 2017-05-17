//Assume you are an awesome parent and want to give your children some cookies. 
//But, you should give each child at most one cookie. Each child i has a greed factor gi, 
//which is the minimum size of a cookie that the child will be content with; and each cookie 
//j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i
//will be content. Your goal is to maximize the number of your content children and output the maximum number.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AlgoPractice
{
	public static void main (String[] args)
	{
	    int[] kids = {1,2,3};
	    int[] cookies = {1,2};
		System.out.println(""+ satisfiedChildren(kids, cookies));
	}
	
	public static int satisfiedChildren(int[] kids, int[] cookies){
	    Arrays.sort(kids);
	    Arrays.sort(cookies);
	    int i = 0;
	    for(int j = 0; j<kids.length && i<cookies.length ; i++){
	        if(kids[j]<= cookies[i]){
	            i++;
	        }
	    }
	    return i;
	}
}
