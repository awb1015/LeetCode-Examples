//Given two binary trees, write a function to check if they are equal or not.
//Two binary trees are considered equal if they are structurally identical
//and the nodes have the same value.

public static bool sameTree(struct Treenode* p, struct Treenode* q){
    if(p== null && q == null){
        return true;
    }
    //this next line effectively functions like an XOR
    if(p==null || q == null){
        return false;
    //if the current node is equal recurse and continue comparing
    if(p==q){
        return sameTree(p.left, q.left) && sameTree(p.right, q.right);
    }
    //Now reach here if the nodes are two different values
    return false;
}
