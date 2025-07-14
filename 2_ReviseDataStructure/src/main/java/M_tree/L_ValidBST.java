package M_tree;

import M_tree.node.TreeNode;

public class L_ValidBST {

  public boolean isValidBst(TreeNode node) {

    return isValid(node, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private boolean isValid(TreeNode node, long min, long max) {
    if (node == null) return true;

    if (node.val <= min || node.val >= max) return false;

    return isValid(node.left, min, node.val) &&
            isValid(node.right, node.val, max);
  }
}
