package org.tree;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinAbsoluteDifference {

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

        System.out.println("Average Level Order = "+averageLevelOrder(root));

        System.out.println("Min Absolute Different = "+minAbsoluteDifference(root));
        System.out.println("MaxPathSum = "+maxPathSum(root,0));

    }

    public static int maxPathSum(TreeNode node, int sum){

        if (node == null){
            return sum;
        }

        sum = sum+node.val;

        int leftSum = maxPathSum(node.left,sum);
        int rightSum = maxPathSum(node.right,sum);

        return Math.max(leftSum,rightSum);

    }

    private static  int minAbsoluteDifference(TreeNode node){

        int min = Integer.MAX_VALUE;
        List<Integer> inOrderElements = new LinkedList<>();
        inOrder(node,inOrderElements);

        for (int i=0;i<inOrderElements.size()-1;i++){
            min = Math.min(min,inOrderElements.get(i+1)-inOrderElements.get(i));
        }

        return min;


    }

    public static void inOrder(TreeNode node, List<Integer> result){

        if (node == null){
            return;
        }

        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);


    }

    public static List<Double> averageLevelOrder(TreeNode node){

        List<Double> res = new LinkedList<>();
        Queue<TreeNode> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            int size = elements.size();
            double sum =0;
            for (int i=0;i<size;i++){
                TreeNode presentNode = elements.poll();
                sum = sum+presentNode.val;
                if (presentNode.left != null){
                    elements.add(presentNode.left);
                }
                if (presentNode.right != null){
                    elements.add(presentNode.right);
                }
            }
            res.add((sum/size));
        }

        return res;
    }


}
