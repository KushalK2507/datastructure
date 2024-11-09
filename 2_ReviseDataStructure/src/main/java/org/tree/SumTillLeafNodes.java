package org.tree;

public class SumTillLeafNodes {

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

        System.out.println("Result = "+sumOfNodesTillLeafNode(root,0));



    }

    public static int sumOfNodesTillLeafNode(TreeNode node, int sum){

        if (node == null){
            return 0;
        }

        sum = (sum*10+node.val);

        if (node.left == null && node.right == null){
            return sum;
        }

        return sumOfNodesTillLeafNode(node.left,sum)+sumOfNodesTillLeafNode(node.right,sum);

    }


}
