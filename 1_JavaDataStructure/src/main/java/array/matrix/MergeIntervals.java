package array.matrix;

import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals {

    public static void main(String[] args) {
        merge(new int[][] {{1,3},{2,6},{8,10},{15,18}});

//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
    }

    public static  int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> res = new LinkedList<>();

        for(int i=1;i<intervals.length;i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart <= end){
                end = Math.max(nextEnd,end);
            }
            else{
                res.add(List.of(start,end));
                start = nextStart;
                end = nextEnd;
            }

        }

        res.add(List.of(start,end));

        int[][] result = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }

        return result;


    }
}
