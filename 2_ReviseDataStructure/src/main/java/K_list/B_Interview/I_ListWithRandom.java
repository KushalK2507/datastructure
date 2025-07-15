package K_list.B_Interview;

import K_list.node.ListNodeWithRandom;

public class I_ListWithRandom {

  ListNodeWithRandom head;

  public ListNodeWithRandom create(int value) {
    head = new ListNodeWithRandom();
    head.value = value;
    return head;
  }

  public void populateRandom(int nodeIndex, int targetIndex) {
        if (head == null){
            return;
        }
        var headCopy = head;
        while (headCopy != null && targetIndex > 0){
            headCopy = headCopy.next;
            targetIndex--;
        }

        var headCopyNew = head;
        while (nodeIndex > 0 && headCopyNew != null){
            headCopyNew = headCopyNew.next;
            nodeIndex--;
        }

        if (headCopyNew != null){
            headCopyNew.random = headCopy;
        }

    }

    public void insertAtLast(int value) {
        var headCopy = head;
        while (headCopy.next != null) {
            headCopy = headCopy.next;
        }

        ListNodeWithRandom node = new ListNodeWithRandom();
        node.value = value;
        headCopy.next = node;
    }

    public void traversal(){
        var headCopy = head;
        while (headCopy != null){
            System.out.print("Current Node = "+headCopy);
            System.out.print(" Value = "+headCopy.value);
            System.out.print(" | Next = "+headCopy.next);
            System.out.print(" | Random = "+headCopy.random);
            if (headCopy.random != null){
                System.out.print(" | Random Value = "+headCopy.random.value);
            }
            System.out.println();
            headCopy = headCopy.next;
        }
    }
}
