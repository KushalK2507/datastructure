package tree.binarySearchTree;

import tree.Node;

public class BinarySearchTreeMain {

    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insertNode(tree.root,1);
        tree.insertNode(tree.root,4);
        tree.insertNode(tree.root,6);
        tree.insertNode(tree.root,9);
        tree.insertNode(tree.root,5);
        tree.insertNode(tree.root,2);

        System.out.println(tree.search(tree.root,3));
        tree.searchUsingLevelOrder(tree.root,4);

        System.out.println("PreOrderTraversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("PostOrderTraversal");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("InOrderTraversal");
        tree.inorderTraversal(tree.root);
        System.out.println();

        tree.insertNode(tree.root,5);
        System.out.println("InOrderTraversal");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Level Order Traversal");
        tree.levelOrderTraversal(tree.root);
        System.out.println("----------------");
        tree.levelOrderTraversalUsingQueue(tree.root);
        System.out.println();

        System.out.println("Height of the Tree: "+tree.heightOfTheTree(tree.root));

        tree.deleteNode(tree.root,1);
        System.out.println("Level Order Traversal");
        tree.levelOrderTraversal(tree.root);

        tree.deleteNode(tree.root,11);
        System.out.println("Level Order Traversal");
        tree.levelOrderTraversal(tree.root);

        Node node = tree.getParentNodeOfGivenValue(tree.root,9);
        int result = node == null ? -1:node.value;
        System.out.println("Parent Of the Node: "+result);

        Node sibling = tree.getSiblingNode(tree.root,5);
        int siblingVal = sibling == null ? -1:sibling.value;
        System.out.println("Sibling: "+siblingVal);

        System.out.println("InOrderParent: "+tree.getInOrderParent(tree.root,9).value);

        System.out.println("Sum Of Element: "+tree.sumOfElement(tree.root));

        System.out.println("Kth Smallest element: "+tree.getKthSmallestElement(tree.root,2));

        System.out.println("Kth Largest element: "+tree.getKthLargestElement(tree.root,1));

        System.out.println("Number Of Nodes: "+tree.getNumberOfNode(tree.root));


    }




}
