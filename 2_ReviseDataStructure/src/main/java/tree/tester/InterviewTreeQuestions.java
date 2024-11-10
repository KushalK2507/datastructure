package tree.tester;

import tree.BinaryTree;
import tree.InvertBinaryTree;
import tree.PopulateNextPointer;

public class InterviewTreeQuestions {

  public static void main(String[] args) {

    System.out.println("Invert Binary Tree");
    invertBinaryTree();
    System.out.println();
    System.out.println("-------------------------------");

    System.out.println("Populate Next Pointer ");
    populateTheNextPointer();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Sum of Node till Leaf Node");
    sumOfNodeTillLeafNode();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Tree from PreOrder And InOrder");
    treeFromPreOrderAndInOrder();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Tree from InOrder And PostOrder");
    treeFromInOrderAndPostOrder();
    System.out.println();
    System.out.println("--------------------------------");
  }

  private static void treeFromInOrderAndPostOrder() {}

  private static void treeFromPreOrderAndInOrder() {}

  private static void sumOfNodeTillLeafNode() {}

  private static void populateTheNextPointer() {
    PopulateNextPointer populateNextPointer = new PopulateNextPointer();
    var root = populateNextPointer.insert(null, 1);
    populateNextPointer.insert(root, 2);
    populateNextPointer.insert(root, 3);
    populateNextPointer.insert(root, 4);
    populateNextPointer.insert(root, 5);
    populateNextPointer.insert(root, 7);

    System.out.println("Before Populate next Pointer");
    populateNextPointer.levelOrderTraversal(root);
    populateNextPointer.populateNextPointer(root);
    System.out.println("Populated Next Pointer");
    populateNextPointer.levelOrderTraversal(root);
  }

  private static void invertBinaryTree() {
    BinaryTree tree = new BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    System.out.println("Original Tree level Order");
    tree.levelOrder(tree.getRootNode());
    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    invertBinaryTree.invertTree(tree.getRootNode());
    System.out.println("Inverted Tree level Order");
    tree.levelOrder(tree.getRootNode());
  }
}
