package tree;

import tree.node.TreeNode;

public class MaxPathSum {

  public int maxPathSum(TreeNode node) {

    if (node == null) {
      return 0;
    }

    var leftMaxSum = Math.max(Integer.MIN_VALUE, maxPathSum(node.left) + node.val);
    var rigthMaxSum = Math.max(Integer.MIN_VALUE, maxPathSum(node.right) + node.val);

    return Math.max(leftMaxSum, rigthMaxSum);
  }
}
