package org.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulateNextPointer {

    public static void main(String[] args) {

        BinaryTreeWithNextPointer tree = new BinaryTreeWithNextPointer();
        TreeNodeNextPointer root = tree.create(5);
        tree.addNode(root,4);
        tree.addNode(root,7);
        tree.addNode(root,9);
        tree.addNode(root,6);
        tree.addNode(root,2);
        tree.addNode(root,1);
        tree.addNode(root,10);

        tree.levelOrderTraversal(root);
        System.out.println();
        tree.populateNextPointer(root);

        tree.levelOrderTraversal(root);
        System.out.println();

    }

}

class TreeNodeNextPointer{

    int val;
    TreeNodeNextPointer left;
    TreeNodeNextPointer right;
    TreeNodeNextPointer nextPointer;

    public TreeNodeNextPointer(int val){

        this.val = val;
        this.left = null;
        this.right = null;
        this.nextPointer = null;
    }
}

class BinaryTreeWithNextPointer{

    public TreeNodeNextPointer create(int val){
        return new TreeNodeNextPointer(val);
    }

    public TreeNodeNextPointer addNode(TreeNodeNextPointer node, int val){

        if (node == null){
            return new TreeNodeNextPointer(val);
        }

        if ( val < node.val){
            node.left = addNode(node.left,val);
        }
        else if (val > node.val){
            node.right = addNode(node.right,val);
        }

        return node;
    }

    public void levelOrderTraversal(TreeNodeNextPointer node){

        if (node == null){
            return;
        }

        Queue<TreeNodeNextPointer> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            TreeNodeNextPointer presentNode = elements.poll();
            if (presentNode.nextPointer != null){
                System.out.print(presentNode.val+"("+presentNode.nextPointer.val+") ");
            }
            else {
                System.out.print(presentNode.val+"("+presentNode.nextPointer+") ");
            }
            if (presentNode.left != null){
                elements.offer(presentNode.left);
            }
            if (presentNode.right != null){
                elements.offer(presentNode.right);
            }

        }

    }

    public void populateNextPointer(TreeNodeNextPointer node){

        if (node == null){
            return;
        }

        Queue<TreeNodeNextPointer> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            int size = elements.size();
            List<TreeNodeNextPointer> nodes = new LinkedList<>() ;
            for (int i =0;i<size;i++) {
                TreeNodeNextPointer presentNode = elements.poll();
                nodes.add(presentNode);
                if (presentNode.left != null) {
                    elements.offer(presentNode.left);
                }
                if (presentNode.right != null) {
                    elements.offer(presentNode.right);
                }
            }
            for (int i=0;i<nodes.size()-1;i++){
                nodes.get(i).nextPointer = nodes.get(i+1);
            }
        }

    }
}
