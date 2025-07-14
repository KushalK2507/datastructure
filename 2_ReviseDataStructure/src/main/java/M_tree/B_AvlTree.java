package M_tree;

import M_tree.node.AvlTreeNode;
import java.util.LinkedList;
import java.util.Queue;
import lombok.Getter;

@Getter
public class B_AvlTree {

  AvlTreeNode rootNode;

  public void insert(int val) {
    rootNode = insert(rootNode, val);
  }

  private AvlTreeNode insert(AvlTreeNode node, int val) {

    if (node == null) {
      node = new AvlTreeNode();
      node.val = val;
      node.height = 1;
      return node;
    }
    if (val < node.val) {
      node.left = insert(node.left, val);
    } else if (val > node.val) {
      node.right = insert(node.right, val);
    } else {
      return node;
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    return balanceTree(node, val);
  }

  public AvlTreeNode deleteNode(AvlTreeNode node, int val) {

    if (node == null) {
      return node;
    }

    if (val < node.val) {
      node.left = deleteNode(node.left, val);
    } else if (val > node.val) {
      node.right = deleteNode(node.right, val);
    } else {
      if (node.left == null || node.right == null) {
        var temp = node.left != null ? node.left : node.right;
        if (temp == null) {
          temp = node;
          node = null;
        } else {
          node = temp;
        }
      } else {
        var sucessor = getSucessor(node);
        node.val = sucessor.val;
        node.right = deleteNode(node.right, sucessor.val);
      }
    }

    if (node == null) {
      return node;
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    if (node.val == rootNode.val) {
      node = balanceTreeDeleteNode(node);
      this.rootNode = node;
    } else {
      node = balanceTreeDeleteNode(node);
    }

    return node;
  }

  public void levelOrder(AvlTreeNode node) {
    Queue<AvlTreeNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      var currentNode = queue.poll();
      System.out.print(currentNode.val + " ");
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }
  }

  private AvlTreeNode balanceTreeDeleteNode(AvlTreeNode node) {
    int balance = balance(node);

    if (balance > 1 && balance(node.left) >= 0) {
      return rightRotation(node);
    }
    if (balance > 1 && balance(node.left) < 0) {
      node.left = leftRotation(node.left);
      return rightRotation(node);
    }

    if (balance < -1 && balance(node.right) >= 0) {
      return leftRotation(node);
    }

    if (balance < -1 && balance(node.right) < 0) {
      node.right = rightRotation(node.right);
      return leftRotation(node);
    }
    return node;
  }

  private AvlTreeNode getSucessor(AvlTreeNode node) {

    var right = node.right;
    while (right.left != null) {
      right = right.left;
    }
    return right;
  }

  private AvlTreeNode balanceTree(AvlTreeNode node, int val) {
    int balance = balance(node);
    // left left rotation
    if (balance > 1 && node.left.val > val) {
      return rightRotation(node);
    }
    // left right rotation
    if (balance > 1 && node.left.val < val) {
      node.left = leftRotation(node.left);
      return rightRotation(node);
    }

    // right right rotation
    if (balance < -1 && node.right.val < val) {
      return leftRotation(node);
    }
    // right left rotation
    if (balance < -1 && node.right.val > val) {
      node.right = rightRotation(node.right);
      return leftRotation(node);
    }
    return node;
  }

  private AvlTreeNode leftRotation(AvlTreeNode unbalancedNode) {
    var temp = unbalancedNode.right;
    var temp2 = temp.left;

    temp.left = unbalancedNode;
    unbalancedNode.right = temp2;

    unbalancedNode.height =
        1 + Math.max(getHeight(unbalancedNode.left), getHeight(unbalancedNode.right));

    temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
    return temp;
  }

  private AvlTreeNode rightRotation(AvlTreeNode unbalancedNode) {
    var temp = unbalancedNode.left;
    var temp2 = temp.right;

    temp.right = unbalancedNode;
    unbalancedNode.left = temp2;

    unbalancedNode.height =
        1 + Math.max(getHeight(unbalancedNode.left), getHeight(unbalancedNode.right));
    temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
    return temp;
  }

  private int balance(AvlTreeNode node) {
    if (node == null) {
      return 0;
    }
    return getHeight(node.left) - getHeight(node.right);
  }

  private int getHeight(AvlTreeNode node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }
}
