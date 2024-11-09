package dynamic;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public void targetSum(List<List<Integer>> res, int[] input,int remain, int start,List<Integer> combine){

        if (remain < 0){
            return;
        }
        if (remain == 0){
            res.add(new LinkedList<>(combine));
        }
        else {
            for (int i=start;i<input.length;i++){
                combine.add(input[i]);
                targetSum(res,input,remain-input[i],i,combine);
                combine.remove(combine.size()-1);
            }
        }

    }





}
