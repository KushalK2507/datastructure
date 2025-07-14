package F_sorting.interview;

import F_sorting.E_QuickSort;
import java.util.Arrays;

public class A_RearrangeArrayInMinMaxForm {

  int[] arr;
  E_QuickSort EQuickSort;

  public A_RearrangeArrayInMinMaxForm(int[] arr) {
    this.arr = arr;
    EQuickSort = new E_QuickSort(this.arr);
  }

  public void rearrangeArray() {

    EQuickSort.quickSort(0, arr.length - 1);
    System.out.println("Sorted Array = " + Arrays.toString(arr));
        int minIndex = 0;
        int maxIndex = arr.length-1;
        int max = arr[maxIndex] +1;

        for (int i=0;i<arr.length;i++){

            if (i %2 == 0){
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                maxIndex--;
            }
            else {
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }

        for (int i=0;i<arr.length;i++){
            arr[i] = arr[i]/max;
        }

    }

}
