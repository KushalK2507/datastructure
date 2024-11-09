package tree.interviewQuestions;

public class ValidBST {

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {


        return isValidBST(root, null,null);

    }

    public boolean isValidBST(TreeNode root, TreeNode minNode,TreeNode maxNode) {

        if(root == null){
            return true;
        }

        if((minNode != null && root.val <= minNode.val) || (maxNode!= null && root.val >= maxNode.val)){
            return false;
        }

        return isValidBST(root.left, minNode,root) && isValidBST(root.right,root,maxNode);


    }
}
