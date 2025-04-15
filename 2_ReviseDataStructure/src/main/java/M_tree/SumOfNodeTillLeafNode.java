package M_tree;

import M_tree.node.TreeNode;

public class SumOfNodeTillLeafNode {


    public int sumOfNodeTillLeadNode(TreeNode node, int number){

        if (node == null){
            return 0;
        }


        var newNumber = (number*10) + node.val;

        if (node.left == null && node.right== null){
            return newNumber;
        }

        int leftSum = sumOfNodeTillLeadNode(node.left,newNumber);
        int rightSum = sumOfNodeTillLeadNode(node.right,newNumber);

        return leftSum+rightSum;
    }


}
