package M_tree;

import M_tree.node.TreeNode;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode node, int p, int q){

        TreeNode pNode = searchNode(node, p);
        TreeNode qNode = searchNode(node, q);
        if (pNode == null || qNode == null){
            return null;
        }

        return lca(node.left,pNode,qNode);
    }

    private TreeNode lca(TreeNode node, TreeNode pNode, TreeNode qNode){

        if (node == null || pNode == node || qNode == node){
            return node;
        }

        TreeNode left = lca(node.left,pNode,qNode);
        TreeNode right = lca(node.right, pNode,qNode);

    if (pNode != null && qNode != null) {
      return node;
    }

        return left != null ? left:right;
    }

    private TreeNode searchNode(TreeNode node, int p){

        if (node == null){
            return null;
        }
        if (p< node.val){
            return searchNode(node.left,p);
        }
        else if(p > node.val){
            return searchNode(node.right,p);
        }
        else {
            return node;
        }
    }

}
