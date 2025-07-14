package M_tree;

import M_tree.node.TreeNode;

public class H_FlattenTree {

  public void flattenTree(TreeNode node) {

    var curr = node;
    while (curr != null) {
      if (curr.left != null) {
        var runner = curr.left;
        while (runner.right != null) {
          runner = runner.right;
        }
                runner.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
