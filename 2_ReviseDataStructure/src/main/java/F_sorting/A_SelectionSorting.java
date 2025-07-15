package F_sorting;

public class A_SelectionSorting {

  int[] arr;

  public A_SelectionSorting(int[] arr) {
    this.arr = arr;
  }

  public void selectSort() {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
