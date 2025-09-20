package M_tree;

import M_tree.node.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class F_TreeFromPreAndInOrder {

  Map<Integer, Integer> inOrderValueToIndex;

  public F_TreeFromPreAndInOrder() {
    inOrderValueToIndex = new HashMap<>();
  }

  public TreeNode binaryTree(int[] preOrder, int[] inOrder) {

    for (int i = 0; i < inOrder.length; i++) {
      inOrderValueToIndex.put(inOrder[i], i);
    }

    return buildBinaryTree(
        preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, inOrderValueToIndex);
  }

  private TreeNode buildBinaryTree(
      int[] preOrder,
      int preOrderStart,
      int preOrderEnd,
      int[] inOrder,
      int inOrderStart,
      int inOrderEnd,
      Map<Integer, Integer> inOrderValueToIndex) {

    if (preOrderStart > preOrderEnd || inOrderStart > inOrderEnd) {
      return null;
    }

    var rootValue = preOrder[preOrderStart];
    var root = new TreeNode(rootValue);
    var rootValueIndex = inOrderValueToIndex.get(rootValue);
    int lengthOfLeftSubTree = rootValueIndex - inOrderStart;

    root.left =
        buildBinaryTree(
            preOrder,
            preOrderStart + 1,
                preOrderStart  + lengthOfLeftSubTree - 1,
            inOrder,
            inOrderStart,
            rootValueIndex - 1,
            inOrderValueToIndex);
    root.right =
        buildBinaryTree(
            preOrder,
            preOrderStart + lengthOfLeftSubTree + 1,
            preOrderEnd,
            inOrder,
            rootValueIndex + 1,
            inOrderEnd,
            inOrderValueToIndex);

    return root;
  }
}
