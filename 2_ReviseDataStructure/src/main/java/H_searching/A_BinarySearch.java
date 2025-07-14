package H_searching;

public class A_BinarySearch {
  int[] arr;
  int targetElement;

  public A_BinarySearch(int[] arr, int targetElement) {
    this.arr = arr;
    this.targetElement = targetElement;
  }

  public int binarySearch() {
    int start = 0;
        int end = arr.length;

        while (start <= end){
            int mid = (end+start)/2;
            if (arr[mid] == targetElement){
                return mid;
            }
            else if (targetElement < arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return -1;
    }
}
