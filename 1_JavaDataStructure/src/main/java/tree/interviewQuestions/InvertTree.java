package tree.interviewQuestions;

import tree.Node;

public class InvertTree {

    public static void main(String[] args) {

    }

    public static Node invertTree(Node root){

        if(root == null){
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;


    }
}
