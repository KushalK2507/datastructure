package org.tree;

public class InvertBinaryTree {

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

        tree.inOrder(root);

        System.out.println();

        invertBinaryTree(root);

        tree.inOrder(root);

    }

    public static void invertBinaryTree(TreeNode node){

        if (node == null){
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertBinaryTree(node.left);
        invertBinaryTree(node.right);
    }
}
