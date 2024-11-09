package dynamic;

import java.util.LinkedList;
import java.util.List;

public class CombinationSums {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> combine = new LinkedList<>();
        sumTarget(result,combine,candidates,target,0);

        return result;
    }


    public void sumTarget(List<List<Integer>> result,List<Integer> combine,int[] candidates, int remain, int start){

        if(remain < 0){
            return;
        }
        if(remain == 0 ){
            result.add(new LinkedList<>(combine));
        }

        for(int i=start;i<candidates.length;i++){
            combine.add(candidates[i]);
            sumTarget(result,combine,candidates,remain-candidates[i],i);
            combine.remove(combine.size()-1);
        }

    }
}
