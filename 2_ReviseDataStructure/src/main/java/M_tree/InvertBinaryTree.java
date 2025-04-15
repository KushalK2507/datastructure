package M_tree;

import M_tree.node.TreeNode;

public class InvertBinaryTree {

  public void invertTree(TreeNode root) {

    if (root == null) {
      return;
    }
    var temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertTree(root.left);
    invertTree(root.right);
  }
}
