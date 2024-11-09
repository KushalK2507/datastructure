package tree.avlTree;

import tree.Node;
import tree.binarySearchTree.BinarySearchTree;

public class AVLTree extends BinarySearchTree {

    AVLTree() {
    }

    public Node rightRotation(Node unbalancedNode){
        Node newRoot = unbalancedNode.left;
        unbalancedNode.left= unbalancedNode.left.right;
        newRoot.right = unbalancedNode;
        return newRoot;
    }

    public Node leftRotation(Node unbalancedNode){
        Node newNode = unbalancedNode.right;
        unbalancedNode.right = unbalancedNode.right.left;
        newNode.left = unbalancedNode;
        return newNode;
    }

    public int getBalance(Node node){
        if(node == null){
            return 0;
        }

        return heightOfTheTree(node.left) - heightOfTheTree(node.right);
    }

    @Override
    public Node insertNode(Node node, int data) {

        Node root = super.insertNode(node,data);

        int balance = getBalance(root);

        // Left Left Condition
        if(balance > 1 && data < node.left.value){
            System.out.println("Inserting Node led to Left left Condition. Data: "+data);
           return rightRotation(node);
        }
        // Left right Rotation
        else if (balance > 1 && data > node.left.value) {
            System.out.println("Inserting Node led to Left Right Condition. Data: "+data);
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        // Right Left rotation
        else if (balance < -1 && data < node.right.value) {
            System.out.println("Inserting Node led to right Left Condition. Data: "+data);
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        // Right Right Rotation
        else if (balance < -1 && data > node.right.value) {
            System.out.println("Inserting Node led to right Right Condition. Data: "+data);
            return leftRotation(node);
        }
        return root;
    }

    public Node deleteNodeAVL(Node root, int data){

        Node parent = getParentNodeOfGivenValue(root,data);
        super.deleteNode(root,data);

        //In case of delete AVL, to check if it not unbalanced
        // We check the balance of Parent of the Deleted Node.

        int balance = getBalance(parent);


        //Left Left rotation
        if(balance > 1 && getBalance(parent.left) >= 0){
           parent =  rightRotation(parent);
        }
        //Left right
        if(balance > 1 && getBalance(parent.left)< 0 ){
            parent.left = leftRotation(parent.left);
            parent = rightRotation(parent);
        }

        // Right Right Rotation
        if(balance < -1 && getBalance(parent.right) <= 0 ){
            parent = leftRotation(parent);
        }

        //Right Left Rotation
        if(balance < -1 && getBalance(parent.right)> 0){
            parent.right = rightRotation(parent.right);
            parent = leftRotation(parent);
        }

        return parent;
    }
}
