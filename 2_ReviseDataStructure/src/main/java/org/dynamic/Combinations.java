package org.dynamic;

import java.util.LinkedList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {

        List<List<Integer>> res = new LinkedList<>();
        List<Integer> combine = new LinkedList<>();
        combinations(res,combine,1,4,2);
        res.forEach(ele -> System.out.print(ele+" "));
    }

    private static void combinations(List<List<Integer>> res,List<Integer> combine,int i, int n, int k){

        if (combine.size() == k){
            res.add(new LinkedList<>(combine));
        }
        else {
            for (int j=i;j<=n;j++){
                combine.add(j);
                combinations(res,combine,j+1,n,k);
                combine.remove(combine.size()-1);
            }
        }
    }
}
