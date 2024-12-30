package I_BinaryTree.A_BinarySearchTree;

import I_BinaryTree.node.TreeNode;
import java.util.List;

public class A_BinaryTree {

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

  private void addNode(int val) {}

  public void preOrder(TreeNode node) {}

  public void postOrder(TreeNode node) {}

  public void inOrder(TreeNode node) {}

  public void levelOrder(TreeNode node) {}

  public void levelOrderUsingQueue(TreeNode node) {}

  public int heightOfTree(TreeNode node) {

    return -2;
  }

  public int sumOfAllNodes(TreeNode node) {

    return -2;
  }

  public void leafNodes(TreeNode node, List<Integer> leafNodes) {}

  public boolean searchElement(TreeNode node, int elementToBeSearched) {

    return false;
  }

  public boolean searchElementUsingLevelOrder(TreeNode node, int elementToBeSearched) {

    return false;
  }

  public TreeNode parentNode(TreeNode node, int nodeVal) {
    return null;
  }

  public TreeNode siblingOfNode(TreeNode node, int element) {

    return null;
  }

  public int kthSmallestElement(TreeNode node, int k) {

    return -1;
  }

  public int KthLargestElement(TreeNode node, int k) {

    return -1;
  }

  public void sortedTree(TreeNode node, List<Integer> sortedTree) {}

  public boolean deleteNode(TreeNode node, int elementToBeDeleted) {

    return false;
  }

  public int maxWidthOfTree(TreeNode node) {
    return -1;
  }

  public void sumOfLeafNodes(TreeNode node) {}
}
