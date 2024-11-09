package org.tree;

public class FlattenTree {

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

        tree.levelOrder(root);
        System.out.println();

        flattenTree(root);
        tree.levelOrder(root);
        System.out.println();
    }

    public static void flattenTree(TreeNode node){

        if (node == null){
            return;
        }

        while (node != null){
            if (node.left != null) {
                TreeNode runner = node.left;
                while (runner.right != null) {
                    runner = runner.right;
                }
                runner.right = node.right;
                node.right = node.left;
                node.left = null;
            }

            node = node.right;
        }
    }


}
