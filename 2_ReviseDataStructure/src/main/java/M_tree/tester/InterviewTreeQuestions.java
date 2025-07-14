package M_tree.tester;

import M_tree.*;
import M_tree.node.TreeNodeNextPointer;
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
    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);

    N_MaxPathSum MMaxPathSum = new N_MaxPathSum();
    System.out.println("Max Path Sum = " + MMaxPathSum.maxPathSum(tree.getRootNode()));
  }

  private static void minimumAbsoluteDifference() {

    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);
    M_MinimumAbsoluteDifference LMinimumAbsoluteDifference = new M_MinimumAbsoluteDifference();
    var minimum = LMinimumAbsoluteDifference.minimumAbsoluteDifference(tree.getRootNode());
    System.out.println("Minimum Absolute Difference = " + minimum);
  }

  private static void validBst() {
    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);

    L_ValidBST KValidBST = new L_ValidBST();
    var result = KValidBST.isValidBst(tree.getRootNode());

    System.out.println("Is valid bst = " + result);
  }

  private static void avgOfEachLevelOfLevelOrder() {

    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);
    K_AverageOfEachLevelOfLevelOrderTraversal average =
        new K_AverageOfEachLevelOfLevelOrderTraversal();
    var averageLevel = average.averageOfLevelOrder(tree.getRootNode());
    System.out.println("Average of Each level = ");
    averageLevel.forEach(element -> System.out.println("Average = " + element + " "));
  }

  private static void rightSideViewOfTree() {

    A_BinaryTree tree = new A_BinaryTree();
    createTree(tree);
    J_RightSideViewOfTree NRightSideViewOfTree = new J_RightSideViewOfTree();
    List<Integer> rightSideView = new ArrayList<>();
    NRightSideViewOfTree.rightSideView(tree.getRootNode(), rightSideView, 0);
    System.out.println("Right Side View = ");
    rightSideView.forEach(element -> System.out.println(element + " "));
  }

  private static void lowestCommonAncestor(){

    A_BinaryTree tree = new A_BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    I_LowestCommonAncestor ILowestCommonAncestor = new I_LowestCommonAncestor();
    var lcaNode = ILowestCommonAncestor.lowestCommonAncestor(tree.getRootNode(), 3, 6);
    if (lcaNode != null) {
      System.out.println("LCA = " + lcaNode.val);
    } else {
      System.out.println("LCA Does not Exist for given value");
    }
  }

  private static void flattenTree(){
    A_BinaryTree tree = new A_BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    A_BinaryTree tree1 = new A_BinaryTree();
    System.out.println("Level order");
    tree1.levelOrder(tree.getRootNode());
    H_FlattenTree HFlattenTree = new H_FlattenTree();
    HFlattenTree.flattenTree(tree.getRootNode());
    System.out.println("Flatten Tree");

    tree1.levelOrder(tree.getRootNode());
  }

  private static void treeFromInOrderAndPostOrder() {
    int[] inOrder = {2,3,5,6,7,8,9,10,11,12};
    int[] postOrder = {3,2,6,7,5,10,9,12,11,8};

    G_TreeFromInAndPostOrder tree = new G_TreeFromInAndPostOrder();
    var root = tree.binaryTree(inOrder, postOrder);

    A_BinaryTree tree1 = new A_BinaryTree();
    tree1.levelOrder(root);
  }

  private static void treeFromPreOrderAndInOrder() {
    int[] preOrder = {8,5,2,3,7,6,11,9,10,12};
    int[] inOrder = {2,3,5,6,7,8,9,10,11,12};

    F_TreeFromPreAndInOrder tree = new F_TreeFromPreAndInOrder();
    var root = tree.binaryTree(preOrder, inOrder);

    A_BinaryTree tree1 = new A_BinaryTree();
   tree1.levelOrder(root);
  }

  private static void sumOfNodeTillLeafNode() {
    A_BinaryTree tree = new A_BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    E_SumOfNodeTillLeafNode ESumOfNodeTillLeafNode = new E_SumOfNodeTillLeafNode();
    System.out.println("Level Order Traversal");
    tree.levelOrder(tree.getRootNode());
    System.out.println(
        "Sum = " + ESumOfNodeTillLeafNode.sumOfNodeTillLeadNode(tree.getRootNode(), 0));
  }

  private static void populateTheNextPointer() {
    D_PopulateNextPointer DPopulateNextPointer = new D_PopulateNextPointer();
    var root = new TreeNodeNextPointer(1);
    root.left = new TreeNodeNextPointer(2);
    root.right = new TreeNodeNextPointer(3);
    root.left.left = new TreeNodeNextPointer(4);
    root.left.right = new TreeNodeNextPointer(5);
    root.right.right = new TreeNodeNextPointer(7);

    System.out.println("Before Populate next Pointer");
    DPopulateNextPointer.levelOrderTraversal(root);
    DPopulateNextPointer.populateNextPointer(root);
    System.out.println("Populated Next Pointer");
    DPopulateNextPointer.levelOrderTraversal(root);
  }

  private static void invertBinaryTree() {
    A_BinaryTree tree = new A_BinaryTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);

    System.out.println("Original Tree level Order");
    tree.levelOrder(tree.getRootNode());
    C_InvertBinaryTree CInvertBinaryTree = new C_InvertBinaryTree();
    CInvertBinaryTree.invertTree(tree.getRootNode());
    System.out.println("Inverted Tree level Order");
    tree.levelOrder(tree.getRootNode());
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
