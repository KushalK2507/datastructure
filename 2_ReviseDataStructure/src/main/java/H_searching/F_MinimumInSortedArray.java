package H_searching;

public class F_MinimumInSortedArray {

  private final int[] arr;

  public F_MinimumInSortedArray(int[] arr) {
    this.arr = arr;
  }

  public int minInRotatedSortedArray() {

    int start = 0;
    int end = arr.length - 1;
    int min = Integer.MAX_VALUE;

    while (start <= end) {
      var mid = (end + start) / 2;
      if (arr[mid] > arr[end]) {
        start = mid + 1;

      } else {
        end = mid - 1;
      }
      min = Math.min(min, arr[mid]);
    }

    return min;
  }
}
