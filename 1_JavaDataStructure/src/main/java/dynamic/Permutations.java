package dynamic;

import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> combine = new LinkedList<>();
        permutations(result,combine,nums);
        return result;
    }

    private void permutations(List<List<Integer>> result, List<Integer> combine,int[] nums){
        if(combine.size() == nums.length){
            result.add(new LinkedList<>(combine));
        }
        else{
            for(int i=0;i<nums.length;i++){

                if(!combine.contains(nums[i])){
                    combine.add(nums[i]);
                    permutations(result,combine,nums);
                    combine.remove(combine.size()-1);
                }
            }
        }
    }
    

    public void getPermutationFromString(String input,String res,List<String> result){

        if (input.isEmpty()){
            result.add(res);
        }

        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String leftPart = input.substring(0,i);
            String rightPart = input.substring(i+1);
            String remaining = leftPart+rightPart;
            getPermutationFromString(remaining,res+ch,result);
        }
    }
}
