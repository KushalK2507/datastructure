package H_searching;

public class C_SearchInsertionPosition {

  int[] arr;
  int targetElement;

  public C_SearchInsertionPosition(int[] arr, int targetElement) {
    this.arr = arr;
    this.targetElement = targetElement;
  }

  public int insertionPosition() {

        int start =0;
        int end =arr.length;
        while (start <= end){
            int mid = (end+start)/2;
            if (targetElement == arr[mid]){
                return mid;
            }
            else if (targetElement < arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
