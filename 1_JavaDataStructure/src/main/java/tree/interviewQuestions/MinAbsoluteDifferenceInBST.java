package tree.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class MinAbsoluteDifferenceInBST {

    public static void main(String[] args) {

    }

    public int getMinimumDifference(TreeNode root) {

        List<Integer> sortedOrder = new ArrayList<>();
        inOrder(sortedOrder, root);

        int minVal = Integer.MAX_VALUE;

        for(int i=0;i<sortedOrder.size()-1;i++){

            if(minVal > (sortedOrder.get(i+1) - sortedOrder.get(i))){
                minVal = sortedOrder.get(i+1) - sortedOrder.get(i);
            }
        }
        return minVal;
    }

    public void inOrder(List<Integer> sortedOrder, TreeNode node){

        if(node == null){
            return ;
        }

        inOrder(sortedOrder,node.left);
        sortedOrder.add(node.val);
        inOrder(sortedOrder,node.right);

    }


}
