package M_tree.A_Basic;

import M_tree.node.TreeNode;
import java.util.*;
import lombok.Getter;

@Getter
public class A_BinaryTree {
  TreeNode rootNode;

  public void insert(int val) {
    rootNode = insert(rootNode, val);
  }

  private TreeNode insert(TreeNode node, int val) {

    if (isNodeNull(node)) {
      node = new TreeNode();
      node.val = val;
      return node;
    }
    if (val < node.val) {
      node.left = insert(node.left, val);
    }
    if (val > node.val) {
      node.right = insert(node.right, val);
    }

    return node;
  }

  public void preOrder(TreeNode node) {

    if (node == null) {
      return;
    }
    System.out.print(node.val + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(TreeNode node) {

    if (node == null) {
      return;
    }

    inOrder(node.left);
    System.out.print(node.val + " ");
    inOrder(node.right);
  }

  public void postOrder(TreeNode node) {

    if (node == null) {
      return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.val + " ");
  }

  public void levelOrder(TreeNode node) {

    int height = heightOfTree(node);
    for (int i = 0; i <= height; i++) {
      levelOrderTraversal(node, i + 1);
      System.out.println();
    }
  }

  private void levelOrderTraversal(TreeNode node, int level) {
    if (node == null) {
      return;
    }

    if (level == 1) {
      System.out.print(node.val + " ");
    }

    levelOrderTraversal(node.left, level - 1);
    levelOrderTraversal(node.right, level - 1);
  }

  public void levelOrderUsingQueue(TreeNode node) {

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      TreeNode currentNode = queue.poll();
      System.out.print(currentNode.val + " ");
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }
  }

  public int heightOfTree(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return Math.max(heightOfTree(node.left), heightOfTree(node.right)) + 1;
  }

  public int sumOfAllNodes(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return node.val + sumOfAllNodes(node.left) + sumOfAllNodes(node.right);
  }

  public void leafNodes(TreeNode node, List<Integer> leafNodes) {

    if (node == null) {
      return;
    }

    if (node.left == null && node.right == null) {
      leafNodes.add(node.val);
        }
        leafNodes(node.left,leafNodes);
        leafNodes(node.right,leafNodes);
    }

    public boolean searchElement(TreeNode node, int element){

        if (node == null){
            return false;
        }

        if (node.val == element){
            return true;
        }
        else if (element < node.val){
            return searchElement(node.left,element);
        }
        else{
          return   searchElement(node.right,element);
        }
    }

  public boolean searchUsingLevelOrder(TreeNode node, int element) {

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      var currentNode = queue.poll();
      if (currentNode.val == element) {
        return true;
      }
      if (currentNode.left != null) {
        queue.offer(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.offer(currentNode.right);
      }
    }

    return false;
  }

  public TreeNode parentNode(TreeNode node, int val) {

    if (node == null) {
      return null;
    }

    if (node.left != null && node.left.val == val) {
      return node;
    }

    if (node.right != null && node.right.val == val) {
      return node;
    }

    if (val < node.val) {
      return parentNode(node.left, val);
    } else {
      return parentNode(node.right, val);
    }
  }

  public TreeNode siblingNode(TreeNode node, int val) {

    TreeNode parentNode = parentNode(node, val);
    if (parentNode != null) {
      if (parentNode.left != null && parentNode.left.val == val) {
        return parentNode.right;
      }
      if (parentNode.right != null && parentNode.right.val == val) {
        return parentNode.left;
      }
    }
    return null;
  }

  public int KthSmallestElement(int k) {
    Stack<TreeNode> stack = new Stack<>();

    TreeNode curr = rootNode;

    while (curr != null || !stack.isEmpty()) {
      // Go to leftmost node
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }

      curr = stack.pop();
      k--;

      if (k == 0) return curr.val;

      curr = curr.right;
    }

    return -1; // Invalid input
  }

  public int KthLargestElement(int k) {
    var sortedTree = new ArrayList<Integer>();
    sortedTree(this.getRootNode(), sortedTree);

    int startIndex = sortedTree.size() - k;
    return sortedTree.get(startIndex);
  }

  public void sortedTree(TreeNode node, List<Integer> sortedTree) {

    if (node == null) {
      return;
    }
    sortedTree(node.left, sortedTree);
    sortedTree.add(node.val);
    sortedTree(node.right, sortedTree);
  }

  public TreeNode deleteNode(TreeNode node, int value) {

    if (node == null) {
      return node;
    }

    if (value < node.val) {
      node.left = deleteNode(node.left, value);
    } else if (value > node.val) {
      node.right = deleteNode(node.right, value);
    } else {
      if (node.left == null || node.right == null) {
        node = node.left == null ? node.right : node.left;
        return node;
      } else {
        var successor = getSuccessor(node);
        node.val = successor.val;
        node.right = deleteNode(node.right, node.val);
      }
    }
    return node;
  }

  private TreeNode getSuccessor(TreeNode node) {

    if (node.right != null) {
      node = node.right;
      while (node.left != null) {
        node = node.left;
      }
    }
    return node;
  }

  public int maxWidthOfTree(TreeNode node) {

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    int max = Integer.MIN_VALUE;

    while (!queue.isEmpty()) {
      int size = queue.size();
      max = Math.max(max, size);
      while (size > 0) {
        var currentNode = queue.poll();
        size--;
        if (currentNode.left != null) {
          queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.add(currentNode.right);
        }
      }
    }

    return max;
  }

    private boolean isNodeNull(TreeNode node){
        return node == null;
    }
}
