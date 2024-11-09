package tree.interviewQuestions;

public class MaxPathSum {


    public int maxPathSum(TreeNode root) {

        if(root == null){
            return 0;
        }

        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathSum(root, maxValue);
        return maxValue[0];
    }

    public int maxPathSum(TreeNode node, int[] maxValue){

        if(node == null){
            return 0;
        }
        int leftpathMaxSum = Math.max(0,maxPathSum(node.left, maxValue));
        int rightpathMaxSum = Math.max(0,maxPathSum(node.right, maxValue));

        maxValue[0] = Math.max(maxValue[0],leftpathMaxSum+rightpathMaxSum+node.val);

        return Math.max(leftpathMaxSum,rightpathMaxSum) + node.val;

    }
}
