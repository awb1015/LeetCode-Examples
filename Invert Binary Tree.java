//Invert a binary tree.

public static TreeNode invertTree(TreeNode* root){
    if(root == null){
        //Base case so return
        return null;
    }
    else{
        TreeNode tempVar = root.left;
        root.right = invertTree(root.left);
        root.left = invertTree(tempVar);
        return root;
    }
}