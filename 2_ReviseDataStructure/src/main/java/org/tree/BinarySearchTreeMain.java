package org.tree;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        TreeNode root = tree.create(5);
        tree.addNode(root,4);
        tree.addNode(root,7);
        tree.addNode(root,9);
        tree.addNode(root,6);
        tree.addNode(root,2);
        tree.addNode(root,1);
        tree.addNode(root,10);

        System.out.print("Pre Order = ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("Post Order = ");
        tree.postOrder(root);
        System.out.println();

        System.out.print("InOrder = ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("Level Order Using Queue = ");
        tree.levelOrderUsingQueue(root);
        System.out.println();

        System.out.print("Level Order = ");
        tree.levelOrder(root);
        System.out.println();

        System.out.print("Sum of Elements in Tree = ");
        System.out.println(tree.sumOfElements(root));

        System.out.print("Leaf Nodes = ");
        tree.leafNodes(root);
        System.out.println();

        System.out.print("Search Element in Tree = ");
        System.out.println(tree.searchElement(root,10));

        System.out.print("Search Element Using Level order = ");
        TreeNode searchElementNode1 = tree.searchNodeUsingLevelOrder(root,10);
        System.out.println(searchElementNode1 != null ? searchElementNode1.val:-1);

        System.out.print("Parent of Given Node = ");
        TreeNode parentNode = tree.parentOfGivenElements(root,7);
        System.out.println(parentNode != null ? parentNode.val :-1 );

        System.out.print("Sibling of Node = ");
        TreeNode siblingNode = tree.getSiblingNode(root,7);
        System.out.println(siblingNode != null ? siblingNode.val:-1);

        System.out.println("Kth Smallest Element = "+tree.KthSmallestElement(root,5));
        System.out.println("Kth Largest Element = "+tree.KthLargestElement(root,5));
        List<Integer> elements = new LinkedList<>();
        tree.inOrderList(root,elements);
        System.out.println("Sorted Order = "+elements);

        System.out.print("Deleted Node = ");
        tree.deleteNode(root,10);

        System.out.print("InOrder = ");
        tree.inOrder(root);
        System.out.println();

        System.out.println("MaxWidth = "+tree.maxWidth(root));




    }
}
