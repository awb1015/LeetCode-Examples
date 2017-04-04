//Find the sum of all left leaves in a given binary tree.

public static int sumLeftLeaves(Treenode* root){
    if(root == null){
        return 0;
    }
    int total = 0;
    //If the left leaf has no leaves below it then add to the total and no need to recurse deeper
    if(root.left != null && root.left.left == null && root.left.right == null){
        total = root.left.val;
    }
    //Otherwise recurse!
    else{
        total = total + sumLeftLeaves(root.left);
    }
    //And now include the left leaves that are below a right leaf
    total = total + sumLeftLeaves(root.right);
    return total;
}