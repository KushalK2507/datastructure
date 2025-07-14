package F_sorting.interview;

public class C_SquareOfSortedArray {

  public int[] res;
  int[] arr;

  public C_SquareOfSortedArray(int[] arr) {
    this.arr = arr;
    this.res = new int[arr.length];
  }

    public void sortedArray(){
        int end = arr.length-1;
        int start =0;

        for (int k = arr.length-1;k>=0;k--){
            if (Math.abs(arr[start]) > Math.abs(arr[end])){
                res[k] = arr[start]*arr[start];
                start++;
            }
            else {
                res[k] = arr[end]*arr[end];
                end--;
            }
        }
    }
}
