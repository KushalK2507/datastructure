package tree;

import tree.node.TreeNode;

public class SumOfNodeTillLeafNode {


    public int sumOfNodeTillLeadNode(TreeNode node, int number){

        if (node == null){
            return number;
        }
        if (node.left == null && node.right== null){
            return number;
        }

        number = (number*10) + node.val;
        int leftSum = sumOfNodeTillLeadNode(node.left,number);
        int rightSum = sumOfNodeTillLeadNode(node.right,number);

        return leftSum+rightSum;
    }


}
