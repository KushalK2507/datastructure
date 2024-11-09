package hashing.openAddressing;

public class QuadraticProbing extends OpenAddressing{

    public QuadraticProbing(int sizeOfHashTable){
      super(sizeOfHashTable);
    }

    public void insert(String word){
        if(getLoadFactor()>=0.75){
            rehashingHashtable(word);
        }
        else {
            int index = hashFunction(word);
            int counter =0; // This is used for Quadratic polynomial evaulation

            for(int i = index;i<index+sizeOfhashTable;i++){
                int newIndex = (index + (counter*counter)) % sizeOfhashTable;
                if(hashTable[newIndex]== null){
                    hashTable[newIndex] = word;
                    usedCellInHashTable++;
                    break;
                }
                else {
                    System.out.println("Finding next index for " +
                            "element: \"" + word + " \"to be inserted for element as " +
                            "index: \"" + i + "\" is already occupied");
                    counter++;
                }
            }
        }
    }

    public int search(String word){
        int index = hashFunction(word);
        int counter =0;
        for(int i=index;i<index+sizeOfhashTable;i++){
            int newIndex = (index+(counter*counter))%sizeOfhashTable;
            if(word.equals(hashTable[newIndex])){
                System.out.println("Element Found at index: " + newIndex);
                return newIndex;
            }
            else {
                counter++;
            }
        }
        return -1;
    }

    public void delete(String word){
        int index = search(word);
        if(index != -1){
            hashTable[index] = null;
            System.out.println("Element deleted");
            usedCellInHashTable--;
            return;
        }
        System.out.println("Element to be deleted not found");
    }

    public static void main(String[] args){

        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insert("The");
        quadraticProbing.insert("quick");
        quadraticProbing.insert("brown");
        quadraticProbing.insert("fox");
        quadraticProbing.insert("over");

        quadraticProbing.display();
        System.out.println(quadraticProbing.search("fox"));
        System.out.println(quadraticProbing.search("Kushal"));

        quadraticProbing.delete("Kushal");
        quadraticProbing.delete("fox");

        quadraticProbing.display();

    }
}
