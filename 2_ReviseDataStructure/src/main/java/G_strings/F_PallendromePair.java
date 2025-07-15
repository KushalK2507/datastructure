package G_strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class F_PallendromePair {

  // Count Number of Pairs available which can be combined to form pallendrome
  public static void main(String[] args) {
    String[] input = {"aab", "abcac", "dffe", "ed", "aa", "aade"};
    List<List<Integer>> result = new LinkedList<>();
    combination(input, 0, 2, new LinkedList<>(), result);
    List<List<Integer>> pairIndex = new LinkedList<>();
    var count = 0;
    for (List<Integer> pair : result) {
      String combine = input[pair.get(0)] + input[pair.get(1)];
            var eleToCount= combine.chars().mapToObj(ele -> (char)ele)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            var oddCount = eleToCount.values().stream().filter(ele -> ele%2!=0).count();
            if (oddCount <= 1){
                count++;
                pairIndex.add(pair);
            }
        }
        System.out.println("Total Pair = "+count);
        System.out.println("Pair = "+pairIndex);
    }

    public static void combination(String[] input, int index, int k, List<Integer> combine, List<List<Integer>> result){

        if(combine.size() == k){
      result.add(new ArrayList<>(combine));
        }

        for (int i=index;i<input.length;i++){
            combine.add(i);
            combination(input,i+1,k,combine,result);
            combine.remove(combine.size()-1);
        }
    }
}
