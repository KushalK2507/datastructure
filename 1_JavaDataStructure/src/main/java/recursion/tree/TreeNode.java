package recursion.tree;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(){

    }

    public TreeNode getLeftNode(){
        return this.left;
    }

    public  TreeNode getRightNode(){
        return this.right;
    }

    public int getValue(){
        return this.value;
    }

}
