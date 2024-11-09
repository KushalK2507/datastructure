package tree.interviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class KthSmallestElement {

    public static void main(String[] args) {

    }
// If PreOrder Time Complexity will be O(n2)
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> sortedOrder = new LinkedList<>();
        preOrder(sortedOrder, root);

        return sortedOrder.get(k-1);

    }

    public void preOrder(List<Integer> sortedOrder, TreeNode node){

        if(node == null){
            return;
        }

        preOrder(sortedOrder,node.left);
        sortedOrder.add(node.val);
        preOrder(sortedOrder,node.right);

    }


    public int kthsmallestElement(TreeNode root, int k){

        int[] result = new int[2];
        kthSmallest(root,k,result);
        return result[1];
    }

    public void kthSmallest(TreeNode root, int k, int[] result){
        if(root.left != null){
            kthSmallest(root.left,k,result);
        }
        result[0] = result[0]+1;
        if( result[0]==k){
            result[1]=root.val;
            return;
        }
        if(root.right != null){
            kthSmallest(root.right,k,result);
        }

    }

}
