package M_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulateNextPointer {

  public void populateNextPointer(TreeNodeNextPointer root) {

    Queue<TreeNodeNextPointer> queue = new LinkedList<>();
    List<TreeNodeNextPointer> nodes = new ArrayList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      var currentNode = queue.poll();
      nodes.add(currentNode);
      if (currentNode.left != null) {
        queue.offer(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.offer(currentNode.right);
      }
    }

    for (int i = 1; i < nodes.size() - 1; i++) {
      nodes.get(i).nextPointer = nodes.get(i + 1);
    }
  }

  public TreeNodeNextPointer insert(TreeNodeNextPointer root, int val) {

    if (root == null) {
      TreeNodeNextPointer node = new TreeNodeNextPointer();
      node.value = val;
      return node;
    }
    if (val < root.value) {
      root.left = insert(root.left, val);
    } else if (val > root.value) {
      root.right = insert(root.right, val);
    }
    return root;
  }

  public void levelOrderTraversal(TreeNodeNextPointer root) {

    Queue<TreeNodeNextPointer> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      var currentNode = queue.poll();
      int next = currentNode.nextPointer != null ? currentNode.nextPointer.value : -1;
      System.out.print(currentNode.value + " Next = " + next + "\t");
      if (currentNode.left != null) {
        queue.offer(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.offer(currentNode.right);
      }
    }
  }
}

class TreeNodeNextPointer {

  int value;
  TreeNodeNextPointer left;
  TreeNodeNextPointer right;
  TreeNodeNextPointer nextPointer;
}
