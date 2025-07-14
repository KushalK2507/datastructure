package K_list;

import K_list.node.ListNodeWithRandom;

public class I_DeepCopyOfLinkedList {

  I_ListWithRandom newList = new I_ListWithRandom();
  I_ListWithRandom list;

  public I_DeepCopyOfLinkedList(I_ListWithRandom list) {
    this.list = list;
  }

  // Step 1 : In this approach we will insert the new node after each node
  // and each new node will be having the data as same node
  // Node temp = curr.next; --> curr.next = new Node(curr.val); --> curr.next.next = temp; -->
  // curr=temp

  // Step 2: Now we will populate the new Node random using the old node. [curr = head]
  // curr.next.random = curr.random != null ? curr.random.next : null

  // Step 3: Now disconnecting the new list with old [original = head && originalCopy = head.next &&
  // newListHead = originalCopy]
  // orignal.next = original.next.next;
  // orignalCopy.next = originalCopy.next.next

  public I_ListWithRandom deepCopy() {

    var curr = list.head;
    while (curr != null) {
      ListNodeWithRandom newNode = new ListNodeWithRandom();
      newNode.value = curr.value;
      var temp = curr.next;
      curr.next = newNode;
      newNode.next = temp;
      curr = temp;
    }

        // Copy Random
         curr = list.head;
        while (curr != null){
            if (curr.next != null){
                curr.next.random = curr.random != null ? curr.random.next : null;
            }
            curr= curr.next.next;
        }

        //Disconnecting new List
        var original = list.head;
        var originalCopy = list.head.next;
        newList.head = originalCopy;
        while (originalCopy.next != null){
            original.next = original.next.next;
            originalCopy.next = originalCopy.next.next;

            original = original.next;
            originalCopy = originalCopy.next;
        }
        return newList;
    }


}
