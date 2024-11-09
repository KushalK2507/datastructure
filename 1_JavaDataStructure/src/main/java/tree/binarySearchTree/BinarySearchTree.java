package tree.binarySearchTree;

import tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BinarySearchTree {

    public Node root = null;

    public BinarySearchTree() {

    }

    public Node createNode(int data) {
        return new Node(data);
    }

    public Node insertNode(Node node, int data) {

        if(isNodeNull(node)){
            return createNode(data);
        }
        if (data < node.value) {
            node.left = insertNode(node.left, data);
        } else if (data > node.value) {
            node.right = insertNode(node.right, data);
        }
        return node;
    }

    public void preOrderTraversal(Node node) {

        if(isNodeNull(node)){
            return;
        }
        //Root,left,right
        System.out.print(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {

        if(isNodeNull(node)){
            return;
        }

        //left,right, root
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value);

    }

    public void inorderTraversal(Node node) {

        if(isNodeNull(node)){
            return;
        }

        // left, root, right
        inorderTraversal(node.left);
        System.out.print(node.value);
        inorderTraversal(node.right);

    }

    public int heightOfTheTree(Node node) {

        if(isNodeNull(node)){
            return -1;
        }
        return Math.max(heightOfTheTree(node.left), heightOfTheTree(node.right)) + 1;
    }

    public void levelOrderTraversalUsingQueue(Node node) {

        if(isNodeNull(node)){
            return;
        }
        Queue<Node> tree = new LinkedList<>();
        tree.add(node);
        while (!tree.isEmpty()) {
            Node presentNode = tree.remove();
            System.out.print(presentNode.value);
            if (presentNode.left != null) {
                tree.add(presentNode.left);
            }
            if (presentNode.right != null) {
                tree.add(presentNode.right);
            }
        }
    }

    public void levelOrderTraversal(Node node) {

        if(isNodeNull(node)){
            return;
        }

        int heightOfTree = heightOfTheTree(node);
        for (int i = 0; i <= heightOfTree; i++) {
            printAtGivenLevel(node, i + 1);
            System.out.println();
        }
    }

    private void printAtGivenLevel(Node node, int level) {

        if(isNodeNull(node)){
            return;
        }

        if (level == 1) {
            System.out.print(node.value);
        }

        printAtGivenLevel(node.left, level - 1);
        printAtGivenLevel(node.right, level - 1);
    }

    public int search(Node node, int dataToBeSearched) {

        if(isNodeNull(node)){
            return -1;
        } else if (dataToBeSearched < node.value) {
            return search(node.left, dataToBeSearched);
        } else if (dataToBeSearched > node.value) {
            return search(node.right, dataToBeSearched);
        } else if (dataToBeSearched == node.value) {
            System.out.println("Success");
            return dataToBeSearched;
        }

        return -1;
    }

    public void searchUsingLevelOrder(Node node, int dataToBeSearched) {

        if(isNodeNull(node)){
            System.out.println("Node not found");
            return;
        }
        Queue<Node> tree = new LinkedList<>();
        tree.add(node);
        while (!tree.isEmpty()) {
            Node presentNode = tree.remove();
            if (dataToBeSearched == presentNode.value) {
                System.out.println("Element Found");
                return;
            }
            if (presentNode.left != null) {
                tree.add(presentNode.left);
            }
            if (presentNode.right != null) {
                tree.add(presentNode.right);
            }
        }
        System.out.println("Not Found");
    }

    public void deleteNode(Node node, int dataDelVal) {

        if(isNodeNull(node)){
            System.out.println("Not found to delete");
            return;
        }

        if (dataDelVal < node.value) {
            deleteNode(node.left, dataDelVal);
        } else if (dataDelVal > node.value) {
            deleteNode(node.right, dataDelVal);
        } else if (dataDelVal == node.value) {
            // If Node has only one child
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;
                if (temp == null) {
                    System.out.println("Node deleted");
                } else {
                    System.out.println("Node deleted");
                }
            }
            // If node has both left and right child
            else {
                Node successor = getSuccessor(node);
                node.value = successor.value;
                deleteNode(node.right, node.value); // We will move to right since
                // we now we need to start from right of the node that we deleted
                System.out.println("Node deleted");
            }
        }

    }

    //Move right then extreme left from that right node is successor of the current node
    public Node getSuccessor(Node node) {
        if(isNodeNull(node)){
            return null;
        }
        Node temp = node.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public Node getParentNodeOfGivenValue(Node node, int val) {

        if(isNodeNull(node)){
            return null;
        }

        if ((node.left != null && node.left.value == val) || (node.right != null && node.right.value == val)) {
            return node;
        } else if (val < node.value) {
            return getParentNodeOfGivenValue(node.left, val);
        } else if (val > node.value) {
            return getParentNodeOfGivenValue(node.right, val);
        }
        return null;
    }

    public Node getSiblingNode(Node node, int val) {

        if(isNodeNull(node)){
            return null;
        }

        Node parent = getParentNodeOfGivenValue(node, val);
        if (parent != null && parent.left != null && parent.left.value == val) {
            return parent.right;
        } else if (parent != null && parent.right != null && parent.right.value == val) {
            return parent.left;
        }

        return null;
    }

    //Parent of Parent is called InOrderParent
    public Node getInOrderParent(Node node, int val){

        if(isNodeNull(node)){
            return null;
        }

        Node parent = getParentNodeOfGivenValue(node,val);
        return parent != null ? getParentNodeOfGivenValue(node,parent.value) : null;
    }

    public int sumOfElement(Node node){

        if(isNodeNull(node)){
            return 0;
        }

        return node.value + sumOfElement(node.left) + sumOfElement(node.right);
    }

    public int getKthSmallestElement(Node node, int position){

        List<Integer> sortedTree= new LinkedList<>();
        //InOrder represents Sorted tree
        sortedTree(node,sortedTree);
        System.out.print("Sorted tree: ");
        sortedTree.forEach(element -> System.out.print(element));
        System.out.println();


        if(position > sortedTree.size()-1){
            System.out.println("Invalid Position: "+position);
            return -1;
        }
        else {
            return sortedTree.get(position-1);
        }
    }

    public void sortedTree(Node node,List sortedTree){

        if(isNodeNull(node)){
            return;
        }

        sortedTree(node.left,sortedTree);
        sortedTree.add(node.value);
        sortedTree(node.right,sortedTree);

    }

    public int getKthLargestElement(Node node, int position){

        List<Integer> sortedTree = new LinkedList<>();
        sortedTree(node,sortedTree);
        System.out.print("Sorted tree: ");
        sortedTree.forEach(element -> System.out.print(element));
        System.out.println();

        int accuratePosition = sortedTree.size() - position;
        if(accuratePosition < 0){
            System.out.println("Invalid Position");
            return -1;
        }
        else {
            return sortedTree.get(accuratePosition);
        }

    }

    public int getNumberOfNode(Node node){
        if(isNodeNull(node)){
            return 0;
        }

        return 1+getNumberOfNode(node.left) + getNumberOfNode(node.right);
    }

    public boolean isMirror(Node node1, Node node2){

        if(node1 == null || node2 == null){
            return node1 == node2;
        }

        return node1.value == node2.value && isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);

    }

    //The level which has max number of Nodes
    public int maxWidthOfTree(Node root){

        if(root == null){
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int maxWidth =0;

        while(!queue.isEmpty()){

            int count = queue.size();
            maxWidth = Math.max(maxWidth,count);
            Node currNode = queue.poll();
            for(int i=0;i<count;i++){
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }

            }
        }

        return maxWidth;
    }

    private boolean isNodeNull(Node node){
        return node == null;
    }

}
