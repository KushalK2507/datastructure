package tree.tester;

import tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTester {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        createTree(tree);

        System.out.println("Pre order = ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Post Order = ");
        tree.postOrder(tree.root);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Inorder = ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Level Order = ");
        tree.levelOrder(tree.root);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Level Order Using Queue = ");
        tree.levelOrderUsingQueue(tree.root);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Height Of a tree ");
        System.out.println(tree.heightOfTree(tree.root));
        System.out.println("-------------------------------");

        System.out.println("Sum Of Elements");
        System.out.println(tree.sumOfAllNodes(tree.root));
        System.out.println("-------------------------------");

        System.out.println("Leaf Nodes ");
        List<Integer> leafNode = new ArrayList<>();
        tree.leafNodes(tree.root, leafNode);
        System.out.println(leafNode);
        System.out.println("-------------------------------");


        System.out.println("Search Element");
        System.out.println(tree.searchElement(tree.root,8));
        System.out.println("-------------------------------");

        System.out.println("Search Element Using Level Order");
        System.out.print(tree.searchUsingLevelOrder(tree.root,8));
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Parent Node of Given Node");
        System.out.print(tree.parentNode(tree.root,6).val);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Sibling Node ");
        System.out.print(tree.siblingNode(tree.root,3).val);
        System.out.println("-------------------------------");

        System.out.println("Kth Smallest Element ");
        System.out.print(tree.KthSmallestElement(tree.root,4));
        System.out.println("-------------------------------");

        System.out.println("Kth Largest Element ");
        System.out.print(tree.KthLargestElement(tree.root,4));
        System.out.println("-------------------------------");

        System.out.println("Sorted Tree ");
        var sortedTree = new ArrayList<Integer>();
        tree.sortedTree(tree.root,sortedTree);
        sortedTree.forEach(System.out::print);
        System.out.println("-------------------------------");

        System.out.println("Delete Node ");
        System.out.println("-------------------------------");

        System.out.println("Max Width of Tree");

        System.out.println("-------------------------------");

    }

    public static void createTree(BinaryTree tree){
        var root = tree.insert(null, 8);
        tree.insert(root, 5);
        tree.insert(root,7);
        tree.insert(root,2);
        tree.insert(root,3);
        tree.insert(root,6);
        tree.insert(root,11);
        tree.insert(root,12);
        tree.insert(root,9);
        tree.insert(root,10);

    }
}
