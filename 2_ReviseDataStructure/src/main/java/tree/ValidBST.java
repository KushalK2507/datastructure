package tree;

import tree.node.TreeNode;

public class ValidBST {

  public boolean isValidBst(TreeNode node) {

    if (node == null) {
      return true;
    }

    if ((node.left != null && node.left.val < node.val)
        || (node.right != null && node.right.val > node.val)) {
      return true;
    }

    return isValidBst(node.left) && isValidBst(node.right);
  }
}
