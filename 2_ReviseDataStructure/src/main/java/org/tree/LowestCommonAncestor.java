package org.tree;

public class LowestCommonAncestor {

    public static void main(String[] args) {



    }

    public static TreeNode lowestCommonAncestor(TreeNode node, int p, int q){

        if (node == null){
            return node;
        }
        if (node.val == p || node.val == q){
            return node;
        }

        var left = lowestCommonAncestor(node.left,p,q);
        var right = lowestCommonAncestor(node.right,p,q);

        if (left!= null && right!= null){
            return node;
        }

        return left != null ? left:right;

    }
}
