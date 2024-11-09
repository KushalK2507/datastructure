package searching;

public class SelectionSearch {


    int[] arr;
    int targetElement;

    public SelectionSearch(int[] arr, int targetElement){
        this.arr = arr;
        this.targetElement = targetElement;
    }

    public int selectionSearch(){

        for (int i=0;i<arr.length;i++){
            if (arr[i] == targetElement){
                return i;
            }
        }
        return -1;
    }
}
