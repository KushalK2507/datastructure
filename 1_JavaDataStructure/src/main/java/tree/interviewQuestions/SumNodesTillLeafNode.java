package tree.interviewQuestions;

public class SumNodesTillLeafNode {

    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {

        return sumNodes(root,0);

    }

    private int sumNodes(TreeNode root, int sum){

        if(root == null){
            return 0;
        }

        int newSum = (sum*10)+root.val;

        if(root.left == null && root.right == null){
            return newSum;
        }

        int leftSum = sumNodes(root.left,newSum);
        int rightSum = sumNodes(root.right,newSum);

        return leftSum+rightSum;
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
