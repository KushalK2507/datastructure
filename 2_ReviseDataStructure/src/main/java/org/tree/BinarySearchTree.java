package org.tree;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    public TreeNode create(int val){
        return new TreeNode(val);
    }

    public TreeNode addNode(TreeNode node, int val){

        if (node == null){
            return new TreeNode(val);
        }

        if ( val < node.val){
            node.left = addNode(node.left,val);
        }
        else if (val > node.val){
            node.right = addNode(node.right,val);
        }

        return node;
    }

    public void preOrder(TreeNode node){

        if (node == null){
            return;
        }

        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(TreeNode node){

        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void inOrder(TreeNode node){

        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);

    }

    public int heightOfTree(TreeNode node){

        if (node == null){
            return 0;
        }

        return Math.max(heightOfTree(node.left),heightOfTree(node.right))+1;
    }

    public void levelOrderUsingQueue(TreeNode node){

        Queue<TreeNode> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            var element = elements.remove();
            System.out.print(element.val+" ");
            if (element.left != null){
                elements.add(element.left);
            }
            if (element.right != null){
                elements.add(element.right);
            }
        }
    }

    public void levelOrder(TreeNode node){

        if (node == null){
            return;
        }

        int height = heightOfTree(node);
        for (int i=0;i<=height;i++){
            levelOrderTraversal(node,i+1);
        }
    }

    private void levelOrderTraversal(TreeNode node, int level){

        if (node == null){
            return;
        }

        if (level ==1){
            System.out.print(node.val+" ");
        }
        levelOrderTraversal(node.left,level-1);
        levelOrderTraversal(node.right,level-1);
    }

    public int sumOfElements(TreeNode node){

        if (node == null){
            return 0;
        }

        return node.val + sumOfElements(node.left)+sumOfElements(node.right);
    }

    public void leafNodes(TreeNode node){

        if (node == null)
            return;

        if (node.left == null && node.right== null){
            System.out.print(node.val+" ");
        }

        leafNodes(node.left);
        leafNodes(node.right);
    }

    public int searchElement(TreeNode node, int val){

        if (node == null){
            return -1;
        }

        if (val < node.val){
           return searchElement(node.left,val);
        } else if (val > node.val) {
           return searchElement(node.right,val);
        }
        else {
            return node.val;
        }
    }

    public TreeNode searchNodeUsingLevelOrder(TreeNode node, int val){

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(node);
        while (!nodes.isEmpty()){
            var presentNode = nodes.poll();
            if (presentNode.val == val){
                return presentNode;
            }
            if (presentNode.left != null){
                nodes.offer(presentNode.left);
            }
            if (presentNode.right != null){
                nodes.offer(presentNode.right);
            }

        }

        return null;

    }

    public TreeNode parentOfGivenElements(TreeNode node, int val){

        if (node == null){
            return null;
        }

        if ((node.left != null && node.left.val == val) ||(node.right != null && node.right.val==val)){
            return node;
        }

        if (val < node.val){
            return parentOfGivenElements(node.left,val);
        } else if (val > node.val) {
            return parentOfGivenElements(node.right,val);
        }

        return null;
    }

    public TreeNode getSiblingNode(TreeNode node, int val){

        if (node == null){
            return null;
        }

        TreeNode parentNode = parentOfGivenElements(node,val);

        if (parentNode.left != null && parentNode.left.val == val){
            return parentNode.right;
        }
        if (parentNode.right != null && parentNode.right.val == val){
            return parentNode.left;
        }

        return null;

    }

    public int KthSmallestElement(TreeNode node, int k){

        List<Integer> elements = new LinkedList<>();
        inOrderList(node,elements);

        return elements.get(k);
    }

    public void inOrderList(TreeNode node, List<Integer> elements){

        if (node == null){
            return;
        }

        inOrderList(node.left,elements);
        elements.add(node.val);
        inOrderList(node.right,elements);
    }

    public int KthLargestElement(TreeNode node, int k){

        List<Integer> elements = new LinkedList<>();
        inOrderList(node,elements);

        k = elements.size() - k;
        return elements.get(k);
    }

    public TreeNode deleteNode(TreeNode node, int val){

        if (val < node.val){
            node.left = deleteNode(node.left,val);
        }
        else if (val > node.val){
            node.right = deleteNode(node.right,val);
        }
        else {
            if (node.left == null || node.right == null){
                node = node.left != null ? node.left:node.right;
                System.out.println("Node Deleted");
                return node;
            }
            else {
                var successor = getSuccessor(node);
                node.val = successor.val ;
                node.right = deleteNode(node.right,val);
                System.out.println("Node deleted");
                return node;
            }
        }
        return node;
    }

    private TreeNode getSuccessor(TreeNode node){

        if (node == null){
            return node;
        }

        var right = node.right;
        while (right != null && right.left != null){
            right = right.left;
        }

        return right;
    }

    public int maxWidth(TreeNode node){

        if (node == null){
            return 0;
        }

        int maxWidth = 0;
        Queue<TreeNode> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            int size = elements.size();
            maxWidth = Math.max(maxWidth,size);
            TreeNode presentNode = elements.poll();
            if (presentNode.left != null){
                elements.offer(presentNode.left);
            }
            if (presentNode.right != null){
                elements.offer(presentNode.right);
            }
        }

        return maxWidth;
    }
}
