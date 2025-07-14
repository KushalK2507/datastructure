package M_tree;

import M_tree.node.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class M_MinimumAbsoluteDifference {

  public int minimumAbsoluteDifference(TreeNode node) {

    List<Integer> inorder = new ArrayList<>();
    inOrder(node, inorder);
    int minVal = Integer.MAX_VALUE;
    for (int i = 0; i < inorder.size() - 1; i++) {
      if (minVal > (inorder.get(i + 1) - inorder.get(i))) {
        minVal = inorder.get(i + 1) - inorder.get(i);
      }
    }
    return minVal;
  }

  private void inOrder(TreeNode node, List<Integer> inOrder) {
    if (node == null) {
      return;
    }
    inOrder(node.left, inOrder);
    inOrder.add(node.val);
    inOrder(node.right, inOrder);
  }
}
