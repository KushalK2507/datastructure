package org.dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutations {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> combination = new LinkedList<>();
        backtrack(arr,res,combination);
        res.forEach(ele -> System.out.print(ele+" "));

    }

    private static void backtrack(int[] arr,List<List<Integer>> res,List<Integer> combine){

        if (combine.size() == arr.length){
            res.add(new ArrayList<>(combine));
        }
        else {
            for (int i=0;i<arr.length;i++){
                if (!combine.contains(arr[i])){
                    combine.add(arr[i]);
                    backtrack(arr,res,combine);
                    combine.remove(combine.size()-1);

                }
            }
        }
    }
}
