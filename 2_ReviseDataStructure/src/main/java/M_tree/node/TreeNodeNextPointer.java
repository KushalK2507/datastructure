package M_tree.node;

public class TreeNodeNextPointer {

  public int value;
  public TreeNodeNextPointer left;
  public TreeNodeNextPointer right;
  public TreeNodeNextPointer nextPointer;

  public TreeNodeNextPointer(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
    this.nextPointer = null;
  }
}
