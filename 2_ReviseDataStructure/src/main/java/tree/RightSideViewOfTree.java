package tree;

import java.util.List;
import tree.node.TreeNode;

public class RightSideViewOfTree {

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
