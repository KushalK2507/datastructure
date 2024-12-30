package I_BinaryTree.C_Interview.tester;

import java.util.ArrayList;
import java.util.List;

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

    System.out.println("Flatten Tree OR Morris Traversal");
    flattenTree();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Lowest Common Ancestor");
    lowestCommonAncestor();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Right Side View Of Tree");
    rightSideViewOfTree();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Average Of Each Level Of level Order");
    avgOfEachLevelOfLevelOrder();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Valid BST");
    validBst();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Minimum Absolute Difference");
    minimumAbsoluteDifference();
    System.out.println();
    System.out.println("--------------------------------");

    System.out.println("Max path Sum");
    maxPathSum();
    System.out.println();
    System.out.println("--------------------------------");
  }

  private static void maxPathSum() {
    BinaryTree tree = new BinaryTree();
    createTree(tree);

    MaxPathSum maxPathSum = new MaxPathSum();
    System.out.println("Max Path Sum = " + maxPathSum.maxPathSum(tree.getRootNode()));
  }

  private static void minimumAbsoluteDifference() {

    BinaryTree tree = new BinaryTree();
    createTree(tree);
    MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();
    var minimum = minimumAbsoluteDifference.minimumAbsoluteDifference(tree.getRootNode());
    System.out.println("Minimum Absolute Difference = " + minimum);
  }

  private static void validBst() {
    BinaryTree tree = new BinaryTree();
    createTree(tree);

    ValidBST validBST = new ValidBST();
    var result = validBST.isValidBst(tree.getRootNode());

    System.out.println("Is valid bst = " + result);
  }

  private static void avgOfEachLevelOfLevelOrder() {

    BinaryTree tree = new BinaryTree();
    createTree(tree);
    AverageOfEachLevelOfLevelOrderTraversal average = new AverageOfEachLevelOfLevelOrderTraversal();
    var averageLevel = average.averageOfLevelOrder(tree.getRootNode());
    System.out.println("Average of Each level = ");
    averageLevel.forEach(element -> System.out.println("Average = " + element + " "));
  }

  private static void rightSideViewOfTree() {

    BinaryTree tree = new BinaryTree();
    createTree(tree);
    RightSideViewOfTree rightSideViewOfTree = new RightSideViewOfTree();
    List<Integer> rightSideView = new ArrayList<>();
    rightSideViewOfTree.rightSideView(tree.getRootNode(), rightSideView, 0);
    System.out.println("Right Side View = ");
    rightSideView.forEach(element -> System.out.println(element + " "));
  }

  private static void lowestCommonAncestor() {

    BinaryTree tree = new BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
    var lcaNode = lowestCommonAncestor.lowestCommonAncestor(tree.getRootNode(), 3, 6);
    if (lcaNode != null) {
      System.out.println("LCA = " + lcaNode.val);
    } else {
      System.out.println("LCA Does not Exist for given value");
    }
  }

  private static void flattenTree() {
    BinaryTree tree = new BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    BinaryTree tree1 = new BinaryTree();
    System.out.println("Level order");
    tree1.levelOrder(tree.getRootNode());
    FlattenTree flattenTree = new FlattenTree();
    flattenTree.flattenTree(tree.getRootNode());
    System.out.println("Flatten Tree");

    tree1.levelOrder(tree.getRootNode());
  }

  private static void treeFromInOrderAndPostOrder() {
    int[] inOrder = {2, 3, 5, 6, 7, 8, 9, 10, 11, 12};
    int[] postOrder = {3, 2, 6, 7, 5, 10, 9, 12, 11, 8};

    TreeFromInAndPostOrder tree = new TreeFromInAndPostOrder();
    var root = tree.binaryTree(inOrder, postOrder);

    BinaryTree tree1 = new BinaryTree();
    tree1.levelOrder(root);
  }

  private static void treeFromPreOrderAndInOrder() {
    int[] preOrder = {8, 5, 2, 3, 7, 6, 11, 9, 10, 12};
    int[] inOrder = {2, 3, 5, 6, 7, 8, 9, 10, 11, 12};

    TreeFromPreAndInOrder tree = new TreeFromPreAndInOrder();
    var root = tree.binaryTree(preOrder, inOrder);

    BinaryTree tree1 = new BinaryTree();
    tree1.levelOrder(root);
  }

  private static void sumOfNodeTillLeafNode() {
    BinaryTree tree = new BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    SumOfNodeTillLeafNode sumOfNodeTillLeafNode = new SumOfNodeTillLeafNode();
    System.out.println("Level Order Traversal");
    tree.levelOrder(tree.getRootNode());
    System.out.println(
        "Sum = " + sumOfNodeTillLeafNode.sumOfNodeTillLeadNode(tree.getRootNode(), 0));
  }

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

  public static void createTree(BinaryTree tree) {
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
