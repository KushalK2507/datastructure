package tree.interviewQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulateNextRightPointer {

    public static void main(String[] args) {

    }

    public TreeNodeNext populatesNextNode(TreeNodeNext root){

        Queue<TreeNodeNext> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<TreeNodeNext> nodes = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNodeNext currNode = queue.poll();
                nodes.add(currNode);
                if (currNode.left != null){
                    queue.add(currNode.left);
                }
                if (currNode.right!= null){
                    queue.add(currNode.right);
                }

            }

            for (int i=0;i<nodes.size()-1;i++){
                TreeNodeNext node = nodes.get(i);
                node.next = nodes.get(i+1);
            }
        }

        return root;



    }




}

class TreeNodeNext{

    int val;
    TreeNodeNext left;
    TreeNodeNext right;

    TreeNodeNext next;


    TreeNodeNext(int val){
        this.val = val;
    }


}
