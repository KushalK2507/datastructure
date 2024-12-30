package I_BinaryTree.B_AvlTree;

import I_BinaryTree.node.TreeNode;

public class A_AvlTree {

  TreeNode root;

  public TreeNode getRootNode() {
    return root;
  }

  public TreeNode createTree(int val) {
    root = new TreeNode(val);
    return root;
  }

  public void insert(int val) {

    if (root == null) {
      createTree(val);
    }
    addNode(val);
  }

  public void addNode(int val) {}

  public void levelOrder(TreeNode node) {}

  public TreeNode deleteNode(TreeNode node, int elementToBeDeleted) {

    return null;
  }
}
