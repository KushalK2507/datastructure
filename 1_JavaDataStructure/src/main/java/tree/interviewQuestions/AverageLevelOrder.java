package tree.interviewQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelOrder {

    public static void main(String[] args) {

    }

    public List<Double> averageLevelOrder(TreeNode root){

        List<Double> result = new LinkedList<>();
        Queue<TreeNode> elements = new LinkedList<>();
        elements.add(root);
        while (!elements.isEmpty()){
            int n = elements.size();
            double sum =0;
            for(int i=0;i<n;i++){
                TreeNode currentNode = elements.poll();
                sum = sum+currentNode.val;
                if(currentNode.left != null){
                    elements.add(currentNode.left);
                }
                if(currentNode.right!= null){
                    elements.add(currentNode.right);
                }
            }
            result.add(sum/n);
        }


        return result;

    }

    public void levelOrder(TreeNode node, int level, List<Integer> elements){

        if(node == null){
            return;
        }

        if(level == 1){
            elements.add(node.val);
        }

        levelOrder(node.left,level-1,elements);
        levelOrder(node.right,level-1,elements);

    }

    public int heightOfTree(TreeNode node){

        if(node == null){
            return 0;
        }

        return 1+ Math.max(heightOfTree(node.left),heightOfTree(node.right));

    }


}
