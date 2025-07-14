package N_hashing.B_openAddressing;

import java.util.ArrayList;

public abstract class OpenAddressing {

  String[] hashTable;
  int sizeOfhashTable;
  int usedCellInHashTable;

  public OpenAddressing(int sizeOfhashTable) {
    hashTable = new String[sizeOfhashTable];
    this.sizeOfhashTable = sizeOfhashTable;
    usedCellInHashTable = 0;
  }

  public int hashFunction(String word) {

    var sum = 0;
    for (var ch : word.toCharArray()) {
      sum = sum + (int) ch;
    }
    return sum % sizeOfhashTable;
  }

  public double getLoadFactor() {
    return usedCellInHashTable * (1 / sizeOfhashTable);
  }

  // Creating new hash table and insering all currect element
  // into new hashtable based on the lead factor
  public void rehashingHashtable(String word) {
    var temp = new ArrayList<String>();
    for (var key : hashTable) {
      if (key != null) {
        temp.add(key);
      }
    }
    temp.add(word);
    sizeOfhashTable = sizeOfhashTable * 2;
    hashTable = new String[sizeOfhashTable];
    for (var key : temp) {
      int index = hashFunction(key);
      hashTable[index] = key;
    }
  }

  public void display() {
    if (hashTable == null) {
      System.out.println("Hash Table is Empty");
    }

    for (int i = 0; i < sizeOfhashTable; i++) {
      if (hashTable[i] != null) {
        System.out.println("Element: \"" + hashTable[i] + "\"  at Index: " + i);
      }
    }
  }
}
