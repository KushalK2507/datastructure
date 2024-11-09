package tree.interviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class RightSideViewOfTree {

    public static void main(String[] args) {

    }

    private static List<Integer> rightSideView(TreeNode root){

        if(root == null){
            return List.of();
        }

        List<Integer> rightSideView = new LinkedList<>();

        rightView(rightSideView,root,0);

        return rightSideView;
    }

    private static void rightView(List<Integer> result, TreeNode root, int depth){

        if(root == null){
            return;
        }

        if(depth == result.size()){
            result.add(root.val);
        }

        rightView(result,root.right, depth+1);
        rightView(result,root.left, depth+1);

    }


}
