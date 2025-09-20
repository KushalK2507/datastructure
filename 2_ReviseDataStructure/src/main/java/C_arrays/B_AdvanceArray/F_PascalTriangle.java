package C_arrays.B_AdvanceArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class F_PascalTriangle {

  int height;
  List<List<Integer>> result;

  public F_PascalTriangle(int height) {
    this.height = height;
    result = new ArrayList<>();
  }

  public List<List<Integer>> pascalTriangle() {

    for (int i = 0; i <= height; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }
      }
      result.add(row);
    }

    return result;
  }

  public List<Integer> printLevel(int n){
    List<Integer> row = new LinkedList<>();
    if (n ==1){
      row.add(1);
      return row;
    }
    row.add(1);
    for (int i=1;i<n;i++){
      for (int j=row.size()-1;j>=1;j--){
          row.set(j,row.get(j-1)+row.get(j));
        }
      row.add(1);
    }
    return row;
  }
}
