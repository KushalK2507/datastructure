package tree.interviewQuestions;

import tree.Node;

import java.util.HashMap;
import java.util.Map;

public class TreeFromPreAndInOrder {

//    Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//    Output: [3,9,20,null,null,15,7]  --> Level Order traversal

    public static void main(String[] args) {

    }

    public Node buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> inOrderValueToIndex = new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            inOrderValueToIndex.put(inorder[i],i);

        }

        return buildingTreeFromPreAndIn(preorder,0,preorder.length-1,inorder,0,inorder.length,inOrderValueToIndex);

    }

    public Node buildingTreeFromPreAndIn(int[] preOrder, int preOrderStart , int preOrderEnd, int[] inOrder, int inOrderStart,int inOrderEnd,Map<Integer,Integer> inOrderMap){

        if(preOrderStart > preOrderEnd || inOrderStart > inOrderEnd){
            return null;
        }

        Node root = new Node(preOrder[preOrderStart]);

        int rootValueIndex = inOrderMap.get(root.value);

        int leftSubTreeLength = rootValueIndex - inOrderStart;

        root.left = buildingTreeFromPreAndIn(preOrder,preOrderStart+1,preOrderEnd+leftSubTreeLength,inOrder,inOrderStart,rootValueIndex-1,inOrderMap);

        root.right = buildingTreeFromPreAndIn(preOrder,preOrderStart+leftSubTreeLength+1,preOrderEnd,inOrder,rootValueIndex+1,inOrderEnd,inOrderMap);

        return root;


    }

    public TreeNode buildingTreeFromPostAndIn(int[] postOrder,int postOrderStart,int postOrderEnd,int[] inOrder,int inOrderStart, int inOrderEnd, Map<Integer,Integer>inOrderMap){

        if(postOrderStart > postOrderEnd || inOrderStart>inOrderEnd){
            return null;
        }

        TreeNode root = new TreeNode(postOrder[postOrderEnd]);

        int rootValueIndex = inOrderMap.get(root.val);
        int leftSubTreeLength = rootValueIndex - inOrderStart;
        int rightSubTreeLength = inOrderEnd - rootValueIndex;

        root.left = buildingTreeFromPostAndIn(postOrder,postOrderStart,postOrderStart+leftSubTreeLength-1,inOrder,inOrderStart,rootValueIndex-1,inOrderMap);

        root.right = buildingTreeFromPostAndIn(postOrder,postOrderEnd- rightSubTreeLength,postOrderEnd-1,inOrder,rootValueIndex+1,inOrderEnd,inOrderMap);
        return root;

    }




}
