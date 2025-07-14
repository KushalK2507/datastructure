package C_arrays;

public class G_MoveZeroAtEnd {

  int[] arr;

  public G_MoveZeroAtEnd(int[] arr) {
    this.arr = arr;
  }

  public void moveZeroAtEnd() {

    int first = 0;
        int second =1;
        while (second < arr.length){

            if (arr[first] == 0){
                if (arr[second] == 0){
                    second++;
                }
                else {
                    arr[first] = arr[second];
                    arr[second] = 0;
                    second++;
                    first++;
                }
            }
            else {
                first++;
            }
        }



    }

}
