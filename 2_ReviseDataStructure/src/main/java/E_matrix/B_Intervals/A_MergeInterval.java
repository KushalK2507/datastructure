package E_matrix.B_Intervals;

import java.util.ArrayList;
import java.util.List;

public class A_MergeInterval {

  int[][] intervals;
  List<List<Integer>> result;

  public A_MergeInterval(int[][] intervals) {
    this.intervals = intervals;
    result = new ArrayList<>();
  }

  public List<List<Integer>> mergeIntervals() {

    int currStart = intervals[0][0];
    int currEnd = intervals[0][1];
    for (int i = 1; i < intervals.length; i++) {
      int nextStart = intervals[i][0];
      int nextEnd = intervals[i][1];
      if (nextStart < currEnd) {
        currEnd = nextEnd;
      } else {
        result.add(List.of(currStart, currEnd));
        currStart = nextStart;
        currEnd = nextEnd;
      }
    }

    result.add(List.of(currStart, currEnd));

    return result;
  }
}
