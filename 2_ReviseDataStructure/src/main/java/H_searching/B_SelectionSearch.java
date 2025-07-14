package H_searching;

public class B_SelectionSearch {

  int[] arr;
  int targetElement;

  public B_SelectionSearch(int[] arr, int targetElement) {
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
