package N_hashing.directChaining;

import java.util.LinkedList;

public class DirectChaining {

  // Here we are declaring the Hash table which store linked list of string.
  LinkedList<String>[] hashTable;
  int sizeOfHashTable;

  DirectChaining(int sizeOfHashTable) {
    // Here we are creating the hastable i.e. the bucket which would be used
    // to saved the reference of the linked lit which would be saving the values.
    hashTable = new LinkedList[sizeOfHashTable];
    this.sizeOfHashTable = sizeOfHashTable;
  }

  public static void main(String[] args) {

    DirectChaining hashTable = new DirectChaining(13);
    hashTable.insert("The");
    hashTable.insert("quick");
    hashTable.insert("brown");
    hashTable.insert("fox");
    hashTable.insert("over");

    hashTable.traversal();

    hashTable.search("over");
    hashTable.search("Kushal");

    hashTable.delete("Kushal");
    hashTable.delete("The");
    hashTable.traversal();
  }

  public int asciiModHashFunction(String word) {
    // Here we are calculating the hash value by calculating the
    // sum each character ASCII value and then mod value of size
    // of the hash table
    int sum = 0;
    for (char ch : word.toCharArray()) {
      sum = sum + (int) ch;
    }
    return sum % sizeOfHashTable;
  }

  public void insert(String word) {
    int hashValue = asciiModHashFunction(word);

    if (hashTable[hashValue] == null) {
      hashTable[hashValue] = new LinkedList<String>();
      hashTable[hashValue].add(word);
    } else {
      hashTable[hashValue].add(word);
    }
  }

  public void traversal() {
    for (int i = 0; i < hashTable.length; i++) {
      System.out.println("Key: " + i + " Value: " + hashTable[i]);
    }
  }

  public boolean search(String word) {

    int index = asciiModHashFunction(word);
    if (hashTable[index] != null && hashTable[index].contains(word)) {
      System.out.println("Search Successfull");
      return true;
    } else {
      System.out.println("Element Not Found");
      return false;
    }
  }

  public void delete(String word) {
    int index = asciiModHashFunction(word);
    boolean result = search(word);
    if (result) {
      hashTable[index].remove(word);
      System.out.println("Element Removed");
    } else {
      System.out.println("Element For removal does not exist");
    }
  }
}
