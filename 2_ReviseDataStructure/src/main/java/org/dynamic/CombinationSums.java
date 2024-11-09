package org.dynamic;

import java.util.LinkedList;
import java.util.List;

public class CombinationSums {

    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> combine = new LinkedList<>();
        combinationSums(res,combine,arr,target,0);
        res.forEach(ele -> System.out.print(ele+" "));

    }

    private static void combinationSums(List<List<Integer>> res, List<Integer> combine,int[] arr,int remain, int start){

        if (remain < 0){
            return;
        }
        if (remain == 0){
            res.add(new LinkedList<>(combine));
        }
        else {
            for (int i=start;i<arr.length;i++){
                combine.add(arr[i]);
                combinationSums(res,combine,arr,remain-arr[i],i);
                combine.remove(combine.size()-1);
            }
        }

    }


}
