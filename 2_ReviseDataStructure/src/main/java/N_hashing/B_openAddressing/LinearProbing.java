package N_hashing.B_openAddressing;

public class LinearProbing extends OpenAddressing {

  // In this we will using the Array to store the values
  String[] hashTable;
  int sizeOfhashTable;
  int usedCellInHashTable;

  public LinearProbing(int sizeOfhashTable) {
    super(sizeOfhashTable);
  }

  public static void main(String[] args) {

    LinearProbing linearProbing = new LinearProbing(13);
    linearProbing.insert("The");
    linearProbing.insert("quick");
    linearProbing.insert("brown");
    linearProbing.insert("fox");
    linearProbing.insert("over");

    linearProbing.display();
    System.out.println(linearProbing.search("fox"));
    System.out.println(linearProbing.search("Kushal"));

    linearProbing.delete("Kushal");
    linearProbing.delete("fox");

    linearProbing.display();
  }

  public void insert(String word) {
    if (getLoadFactor() > 0.75) {
      rehashingHashtable(word);
    } else {
      int index = hashFunction(word);
      for (int z = index; z < index + sizeOfhashTable; z++) {
        int newIndex = z % sizeOfhashTable;
        if (hashTable[newIndex] == null) {
          hashTable[newIndex] = word;
          break;
        } else {
          System.out.println(
              "Finding next index for "
                  + "element: \""
                  + word
                  + " \"to be inserted for element as "
                  + "index: \""
                  + z
                  + "\" is already occupied");
        }
      }
      usedCellInHashTable++;
    }
  }

  public int search(String word) {
    int index = hashFunction(word);
    for (int i = index; i < index + sizeOfhashTable; i++) {
      int newIndex = i % sizeOfhashTable;
      if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
        System.out.println("Element Found at index: " + newIndex);
        return newIndex;
      }
    }
    return -1;
  }

  public void delete(String word) {
    int index = search(word);
    if (index != -1) {
      hashTable[index] = null;
      System.out.println("Element Deleted");
      usedCellInHashTable--;
      return;
    }
    System.out.println("Element To Be Deleted Not Found");
  }
}
