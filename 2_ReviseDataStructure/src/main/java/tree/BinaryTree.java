package tree;

import tree.node.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    public TreeNode addNode(int val){
       return new TreeNode(val);
    }

    public TreeNode insert(TreeNode root,int val){

        if (isNodeNull(root)){
            return addNode(val);
        }
        if (val< root.val){
            root.left = insert(root.left,val);
        }
        if (val > root.val){
            root.right = insert(root.right,val);
        }

        this.root = root;
        return root;
    }

    public void preOrder(TreeNode root){

        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void inOrder(TreeNode root){

        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){

        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public void levelOrder(TreeNode root){

        int height = heightOfTree(root);
        for (int i=0;i<height;i++){
            levelOrderTraversal(root,i+1);
            System.out.println();
        }
    }

    private void levelOrderTraversal(TreeNode root,int level){
        if (root == null){
            return;
        }

        if (level==1){
            System.out.print(root.val+" ");
        }

        levelOrderTraversal(root.left,level-1);
        levelOrderTraversal(root.right,level-1);

    }

    public void levelOrderUsingQueue(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val+" ");
            if (currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public int heightOfTree(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.min(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    public int sumOfAllNodes(TreeNode node){
        if (node == null){
            return 0;
        }
        return node.val + sumOfAllNodes(node.left)+sumOfAllNodes(node.right);
    }

    public void leafNodes(TreeNode node, List<Integer> leafNodes){

        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            leafNodes.add(node.val);
        }
        leafNodes(node.left,leafNodes);
        leafNodes(node.right,leafNodes);
    }

    public boolean searchElement(TreeNode node, int element){

        if (node == null){
            return false;
        }

        if (node.val == element){
            return true;
        }
        else if (element < node.val){
            return searchElement(node.left,element);
        }
        else{
          return   searchElement(node.right,element);
        }
    }

    public boolean searchUsingLevelOrder(TreeNode root,int element){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            var currentNode = queue.poll();
            if (currentNode.val == element){
                return true;
            }
            if (currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }

        return false;
    }

    public TreeNode parentNode(TreeNode root,int val){

        if (root == null){
            return null;
        }

        if (root.left != null && root.left.val == val){
            return root;
        }

        if (root.right != null && root.right.val == val){
            return root;
        }

        if (val < root.val){
            return parentNode(root.left,val);
        }
        else{
            return parentNode(root.right,val);
        }
    }

    public TreeNode siblingNode(TreeNode node, int val){


        return null;
    }

    public int KthSmallestElement(TreeNode root, int k){


        return -1;
    }

    public int KthLargestElement(TreeNode root, int k){

        return -1;
    }

    public void sortedTree(TreeNode node, List<Integer> sortedTree){

        if (node == null){
            return;
        }
        sortedTree(node.left,sortedTree);
        sortedTree.add(node.val);
        sortedTree(node.right,sortedTree);
    }

    public void deleteNode(TreeNode root, int value){

    }

    public int maxWidthOfTree(TreeNode root){


        return 0;
    }

    private boolean isNodeNull(TreeNode node){
        return node == null;
    }
}
