package dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public void getPermutationsFromArray(List<List<Integer>> result, List<Integer> combine,int[] arr){

        if (combine.size() == arr.length){
            result.add(new LinkedList<>(combine));
        }
        else {
            for (int i=0;i<arr.length;i++){
                if (!combine.contains(arr[i])){
                    combine.add(arr[i]);
                    getPermutationsFromArray(result,combine,arr);
                    combine.remove(combine.size()-1);
                }

            }
        }

    }

    public void getPermutationFromString(String input, String combine, List<String> res){

        if (input.isEmpty()){
            res.add(combine);
        }
        else {
            for (int i=0;i<input.length();i++){
                char ch = input.charAt(i);
                String leftpart = input.substring(0,i);
                String rightPart = input.substring(i+1);
                String remaining = leftpart+rightPart;
                getPermutationFromString(remaining,combine+ch,res);
            }
        }
    }

}
