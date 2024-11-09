package org.tree;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {

    public static void main(String[] args) {

        int[] preOrder = {5, 4, 2, 1, 7, 6, 9, 10};
        int[] inOrder = {1, 2, 4, 5, 6, 7, 9, 10};
        int[] postOrder = {1 ,2, 4, 6, 10, 9, 7, 5};


        Map<Integer,Integer> inOrderValToIndex = new HashMap<>();
        for (int i=0;i<inOrder.length;i++){
            inOrderValToIndex.put(inOrder[i],i);
        }

        TreeNode root = createTreeFromPreAndInOrder(preOrder,0, preOrder.length-1 ,inOrder,0,inOrder.length,inOrderValToIndex);

        BinarySearchTree tree = new BinarySearchTree();
        tree.inOrder(root);
        System.out.println();

        TreeNode root1 = createTreeFromPostAndInOrder(postOrder,0, postOrder.length-1,inOrder ,0,inOrder.length-1,inOrderValToIndex);
        tree.inOrder(root1);

    }

    public static TreeNode createTreeFromPreAndInOrder(int[] preOrder, int preOrderStart, int preOrderEnd, int[] inOrder, int inOrderStart, int inOrderEnd, Map<Integer,Integer> inOrderValToIndex){

        if (preOrderStart > preOrderEnd || inOrderStart > inOrderEnd){
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preOrderStart]);
        int rootValueIndex = inOrderValToIndex.get(root.val);

        int lengthOfLeftSubTree = rootValueIndex - inOrderStart;

        root.left = createTreeFromPreAndInOrder(preOrder,preOrderStart+1,preOrderStart+lengthOfLeftSubTree,inOrder,inOrderStart,rootValueIndex-1,inOrderValToIndex);
        root.right = createTreeFromPreAndInOrder(preOrder,preOrderStart+lengthOfLeftSubTree+1,preOrderEnd,inOrder,rootValueIndex+1,inOrderEnd,inOrderValToIndex);

        return root;

    }

    public static TreeNode createTreeFromPostAndInOrder(int[] postOrder, int postOrderStart, int postOrderEnd, int[] inOrder, int inOrderStart, int inOrderEnd, Map<Integer,Integer> inOrderValueToIndex){

        if (postOrderStart > postOrderEnd || inOrderStart>inOrderEnd){
            return null;
        }

        TreeNode root = new TreeNode(postOrder[postOrderEnd]);
        int rootValueIndex = inOrderValueToIndex.get(root.val);

        int lengthOfLeftSubTree = rootValueIndex - inOrderStart;
        int lengthOfRightSubTree = inOrderEnd - rootValueIndex;

        root.left = createTreeFromPostAndInOrder(postOrder,postOrderStart,postOrderStart+lengthOfLeftSubTree-1,inOrder,inOrderStart,rootValueIndex-1,inOrderValueToIndex);
        root.right = createTreeFromPostAndInOrder(postOrder,postOrderEnd-lengthOfRightSubTree,postOrderEnd-1,inOrder,rootValueIndex+1,inOrderEnd,inOrderValueToIndex);


        return root;

    }


}
