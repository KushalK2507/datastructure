package M_tree;

import M_tree.node.TreeNode;
import java.util.List;

public class J_RightSideViewOfTree {

  public void rightSideView(TreeNode node, List<Integer> rightView, int level) {

    if (node == null) {
      return;
    }

    if (level == rightView.size()) {
      rightView.add(node.val);
    }

    rightSideView(node.right, rightView, level + 1);
    rightSideView(node.left, rightView, level + 1);
  }
}
