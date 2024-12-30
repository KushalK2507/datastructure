package I_BinaryTree.C_Interview;

import I_BinaryTree.node.TreeNodeNext;

public class B_PopulateNextPointer {

  TreeNodeNext root;

  public void populateNextPointer(TreeNodeNext nodeNext) {}

  public TreeNodeNext createTree(int val) {

    return root;
  }

  public TreeNodeNext insert(TreeNodeNext next, int val) {
    if (root == null) {
      return createTree(val);
    }
    return addNode(val);
  }

  public TreeNodeNext addNode(int val) {

    return null;
  }

  public void levelOrderTraversal(TreeNodeNext node) {}
}
