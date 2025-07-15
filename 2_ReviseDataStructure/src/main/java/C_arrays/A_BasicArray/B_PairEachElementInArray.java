package C_arrays.A_BasicArray;

import java.util.ArrayList;
import java.util.List;

public class B_PairEachElementInArray {

  public void pairEachElement(List<List<Integer>> res, int[] arr, List<Integer> combine) {

    if (combine.size() == arr.length) {
      res.add(new ArrayList<>(combine));
    }
    for (int j : arr) {
      if (!combine.contains(j)) {
        combine.add(j);
        pairEachElement(res, arr, combine);
        combine.remove(combine.size() - 1);
      }
    }
  }
}
