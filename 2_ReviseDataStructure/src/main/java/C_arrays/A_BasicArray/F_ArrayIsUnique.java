package C_arrays.A_BasicArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class F_ArrayIsUnique {

  int[] arr;

  public F_ArrayIsUnique(int[] arr) {
    this.arr = arr;
  }

  public boolean isUnique() {
    return Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() == arr.length;
  }
}
