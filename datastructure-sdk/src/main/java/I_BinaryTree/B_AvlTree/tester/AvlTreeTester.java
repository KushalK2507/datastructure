package I_BinaryTree.B_AvlTree.tester;

import I_BinaryTree.B_AvlTree.A_AvlTree;

public class AvlTreeTester {

  public static void main(String[] args) {

    A_AvlTree tree = new A_AvlTree();
    tree.insert(10);
    tree.insert(20);
    tree.insert(30);
    tree.insert(40);
    tree.insert(50);
    tree.insert(25);
    tree.insert(5);
    System.out.println("Root Node " + tree.getRootNode().value);
    System.out.println("Level Order ");
    tree.levelOrder(tree.getRootNode());
    System.out.println();
    System.out.println("--------------------------------------------");
    var newNode = tree.deleteNode(tree.getRootNode(), 25);
    System.out.println("Deleting Node ");
    tree.levelOrder(newNode);
    System.out.println();
    System.out.println(tree.getRootNode().value);
    System.out.println("----------------------------------------------");
  }
}
