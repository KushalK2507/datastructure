package M_tree;

import M_tree.node.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class G_TreeFromInAndPostOrder {

  Map<Integer, Integer> inOrderValueToIndex;

  public G_TreeFromInAndPostOrder() {
    inOrderValueToIndex = new HashMap<>();
  }

  public TreeNode binaryTree(int[] inOrder, int[] postOrder) {

    for (int i = 0; i < inOrder.length; i++) {
            inOrderValueToIndex.put(inOrder[i],i );
            }
            return buildBinaryTree(postOrder,0,postOrder.length-1,inOrder,0,inOrder.length-1,inOrderValueToIndex);
        }

        public TreeNode buildBinaryTree(int[] postOrder, int postOrderStart, int postOrderEnd, int[] inOrder, int inOrderStart, int inOrderEnd,Map<Integer,Integer> inOrderValueToIndex){

        if (postOrderStart> postOrderEnd || inOrderStart > inOrderEnd){
            return null;
        }

        var rootIndex = inOrderValueToIndex.get(postOrder[postOrderEnd]);
        var root = new TreeNode(postOrder[postOrderEnd]);
        int lengthOfRightSubTree = inOrderEnd - rootIndex;
        int lengthOfLeftSubTree = rootIndex-inOrderStart;

        root.right = buildBinaryTree(postOrder,postOrderEnd-lengthOfRightSubTree,postOrderEnd-1,inOrder,rootIndex+1,inOrderEnd,inOrderValueToIndex);
        root.left = buildBinaryTree(postOrder,postOrderStart,postOrderStart+lengthOfLeftSubTree-1,inOrder,inOrderStart,rootIndex-1,inOrderValueToIndex);

        return root;

    }
}
