package C_arrays.B_AdvanceArray;

public class A_MoveZeroAtEnd {

  int[] arr;

  public A_MoveZeroAtEnd(int[] arr) {
    this.arr = arr;
  }

  public void moveZeroAtEnd() {

    int first = 0;
    int second = 0;
    while (second < arr.length) {
      if(arr[second] !=0){
        var temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        first++;
      }
        second++;
      }
  }
}
