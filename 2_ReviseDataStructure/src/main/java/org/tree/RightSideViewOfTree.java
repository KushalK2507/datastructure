package org.tree;

import java.util.LinkedList;
import java.util.List;

public class RightSideViewOfTree {

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

        List<Integer> rightSideViewResult = new LinkedList<>();
        rightSideView(rightSideViewResult,root,0);

        System.out.println("Right Side View = "+rightSideViewResult);

    }

    public static void rightSideView(List<Integer> result, TreeNode node, int level){

        if (node == null){
            return;
        }

        if (level == result.size()){
            result.add(node.val);
        }


        rightSideView(result,node.right,level+1);
        rightSideView(result,node.left,level+1);


    }


}
