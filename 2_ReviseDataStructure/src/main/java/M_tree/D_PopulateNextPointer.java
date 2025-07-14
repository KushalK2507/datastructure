package M_tree;

import M_tree.node.TreeNodeNextPointer;
import java.util.LinkedList;
import java.util.Queue;

public class D_PopulateNextPointer {

  public void populateNextPointer(TreeNodeNextPointer root) {

    Queue<TreeNodeNextPointer> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      var size = queue.size();
      TreeNodeNextPointer prev = null;

      for (int i = 0; i < size; i++) {
        TreeNodeNextPointer node = queue.poll();

        if (prev != null) {
          prev.nextPointer = node;
        }
        prev = node;

        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      }
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
