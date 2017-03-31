//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the 
//root node down to the farthest leaf node.

//We'll use a simple recursive function, the  key is the max function to determine
//which path is greatest and add 1 to the return value for each level verified
public static int treeDepth(TreeNode root){
	if(root == null){
        return 0;
	}
	else{
	    return 1 + math.max(treeDept(root.left), treeDepth(root.right));
	}
}

