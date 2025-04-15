package M_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import M_tree.node.TreeNode;

public class AverageOfEachLevelOfLevelOrderTraversal {

  public List<Double> averageOfLevelOrder(TreeNode node) {

    if (node == null) {
      return List.of();
    }
    List<Double> avgList = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    int sum = 0;
    double avg;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        var currentNode = queue.poll();
        sum = sum + currentNode.val;
        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }
      }
      avg = (double) sum / queueSize;
      sum = 0;
      avgList.add(avg);
    }
    return avgList;
  }
}
