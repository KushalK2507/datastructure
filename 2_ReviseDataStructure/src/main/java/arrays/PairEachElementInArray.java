package arrays;

import java.util.ArrayList;
import java.util.List;

public class PairEachElementInArray {

    public void pairEachElement(List<List<Integer>> res,int[] arr,List<Integer> combine){


        if (combine.size() == arr.length){
            res.add(new ArrayList<>(combine));
        }
        for (int i=0;i<arr.length;i++){
            if (!combine.contains(arr[i])) {
                combine.add(arr[i]);
                pairEachElement(res, arr, combine);
                combine.remove(combine.size() - 1);
            }
        }

    }



}
