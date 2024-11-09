package tree.avlTree;

public class AVLTreeMain {

    public static void main(String[] args){

        AVLTree avlTree = new AVLTree();
        avlTree.root = avlTree.createNode(1);
        avlTree.root = avlTree.insertNode(avlTree.root,5);
        avlTree.root = avlTree.insertNode(avlTree.root,9);

        System.out.print("InOrder Traversal: ");
        avlTree.inorderTraversal(avlTree.root);
        System.out.println();

        avlTree.root = avlTree.insertNode(avlTree.root,4);
        avlTree.root = avlTree.insertNode(avlTree.root,3);
        avlTree.root = avlTree.insertNode(avlTree.root,2);

        System.out.print("InOrder Traversal: ");
        avlTree.inorderTraversal(avlTree.root);

    }
}
