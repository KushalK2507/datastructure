package P_dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntervalRanges {

    int[] arr;
    List<String> result;

    public IntervalRanges(int[] arr){
        this.arr = arr;
        result = new ArrayList<>();
    }

    public List<String> intervalRanges(){


        int start =arr[0];
        for (int i=0;i<arr.length-1;i++){
            int end = arr[i];
            int val = arr[i];
            if (++val != arr[i+1]){
                if (start != end){
                    result.add(start+"->"+end);
                }
                else {
                    result.add(String.valueOf(end));
                }
                start = arr[i+1];
            }
        }

        if (start == arr[arr.length-1]){
            result.add(String.valueOf(start));
        }

        return result;

    }


}
