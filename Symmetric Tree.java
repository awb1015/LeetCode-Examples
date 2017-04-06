

import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) 
	{
		symmertricTree()
	}
	
	public static bool symmetricTree(Treenode* root){
	    //edge case of null tree
	    //this is why we require the helper function
	    //null is acceptable only at the root of the tree
	    if(root = null){
	        return true;
	    }
	    else{
	        return mirrorCheck(root.left, root.right);
	    }
	}
	
	public static bool mirrorCheck(Treenode p, Treenode q){
	    if(p == null && q == null){
	        return true;
	    }
	    //Given the prior line this functions like an XOR
	    if(p==null || q == null){
	        return false;
	    }
	    //values must be the same and we must have mirrorcheck as true for subsequent nodes
	    return p.value == q.value && mirrorCheck(p.left, q.right) && mirrorCheck(p.right, q.left);
	    
	}
	
	

}
