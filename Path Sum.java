

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	}
	
	public static Boolean pathSum(TreeNode T, int sum){
	    if(T == null){
	        return false;
	    }
	    
	    if(T.right == null && T.left==null && sum - T.val ==0){
	        return true;
	    }
	    
	    return pathSum(T.right, sum-T.val)||pathSum(T.left. sum-T.val)
	    
	}
}
