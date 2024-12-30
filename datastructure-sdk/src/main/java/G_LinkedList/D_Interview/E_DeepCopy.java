package G_LinkedList.D_Interview;

import G_LinkedList.A_SinglyLinkedList.C_ListWithRandom;

public class E_DeepCopy {

  C_ListWithRandom newList = new C_ListWithRandom();
  C_ListWithRandom list;

  public E_DeepCopy(C_ListWithRandom list) {
    this.list = list;
    this.newList = new C_ListWithRandom();
  }

  public C_ListWithRandom deepCopy() {
    return newList;
  }
}
