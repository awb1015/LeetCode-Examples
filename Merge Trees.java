

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AlgoPractice
{
	public static treeNode mergeNodes(treeNode T, treeNode S)
	{
		if(T == null && S == null){
		    return null;
		}
		
		//Therefore at least one node has a value so we need to create our need node
		treeNode newNode = new treeNode(-1);
		if(T==null){
		    newNode.val = S.val;
		    newNode.right = mergeNodes(null, S.right);
		    newNode.left = mergeNodes(null, S.left);
		}
		
		if(S==null){
		    newNode.val = T.val;
		    newNode.right = mergeNodes(T.right, null);
		    newNode.left = mergeNodes(T.left, null);
		}
		
		else{
		    newNode.val = T.val + S.val;
		    newNode.right = mergeNodes(T.right, S.right);
		    newNode.left = mergeNodes(T.left, S.left);
		}
		
		return newNode;
	}
}
