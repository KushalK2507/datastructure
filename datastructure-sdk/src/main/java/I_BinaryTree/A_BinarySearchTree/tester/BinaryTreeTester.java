package I_BinaryTree.A_BinarySearchTree.tester;

import I_BinaryTree.A_BinarySearchTree.A_BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTester {

  public static void main(String[] args) {

    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);

    System.out.println("Pre order = ");
    tree.preOrder(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Post Order = ");
    tree.postOrder(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Inorder = ");
    tree.inOrder(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Level Order = ");
    tree.levelOrder(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Level Order Using Queue = ");
    tree.levelOrderUsingQueue(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Height Of a tree ");
    System.out.println(tree.heightOfTree(tree.getRootNode()));
    System.out.println("-------------------------------");

    System.out.println("Sum Of Elements");
    System.out.println(tree.sumOfAllNodes(tree.getRootNode()));
    System.out.println("-------------------------------");

    System.out.println("Leaf Nodes ");
    List<Integer> leafNode = new ArrayList<>();
    tree.leafNodes(tree.getRootNode(), leafNode);
    System.out.println(leafNode);
    System.out.println("-------------------------------");

    System.out.println("Search Element");
    System.out.println(tree.searchElement(tree.getRootNode(), 8));
    System.out.println("-------------------------------");

    System.out.println("Search Element Using Level Order");
    System.out.print(tree.searchElementUsingLevelOrder(tree.getRootNode(), 8));
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Parent Node of Given Node");
    System.out.print(tree.parentNode(tree.getRootNode(), 6).value);
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Sibling Node ");
    var siblingNode = tree.siblingOfNode(tree.getRootNode(), 3);
    if (siblingNode == null) {
      System.out.println(" No sibling Found");
    } else {
      System.out.print(siblingNode.value);
    }
    siblingNode = tree.siblingOfNode(tree.getRootNode(), 2);
    if (siblingNode == null) {
      System.out.println("No sibling Found");
    } else {
      System.out.print(siblingNode.value);
    }
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Kth Smallest Element ");
    System.out.print(tree.kthSmallestElement(tree.getRootNode(), 4));
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Kth Largest Element ");
    System.out.print(tree.kthSmallestElement(tree.getRootNode(), 4));
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Sorted Tree ");
    var sortedTree = new ArrayList<Integer>();
    tree.sortedTree(tree.getRootNode(), sortedTree);
    sortedTree.forEach(val -> System.out.print(val + " "));
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Delete Node ");
    System.out.println("Node deleted " + tree.deleteNode(tree.getRootNode(), 5));
    tree.levelOrder(tree.getRootNode());
    System.out.println();
    System.out.println("Node deleted " + tree.deleteNode(tree.getRootNode(), 3));
    tree.levelOrder(tree.getRootNode());
    System.out.println();
    System.out.println("Node deleted " + tree.deleteNode(tree.getRootNode(), 8));
    tree.levelOrder(tree.getRootNode());
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Max Width of Tree");
    System.out.println("Max Width = " + tree.maxWidthOfTree(tree.getRootNode()));
    System.out.println();
    System.out.println("-------------------------------");
  }

  public static void createTree(A_BinaryTree tree) {
    tree.insert(8);
    tree.insert(5);
    tree.insert(7);
    tree.insert(2);
    tree.insert(3);
    tree.insert(6);
    tree.insert(11);
    tree.insert(12);
    tree.insert(9);
    tree.insert(10);
  }
}
