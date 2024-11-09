package dynamic;

import java.util.LinkedList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {

        combine(4,2).forEach(System.out::print);

    }

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> combine = new LinkedList<>();
        combinations(result,combine,1,n,k);

        return result;
    }

    public static void combinations(List<List<Integer>> result, List<Integer> combine, int i, int n, int k){

        if(combine.size() == k){
            result.add(new LinkedList<>(combine));
        }
        else{
            for(int j=i;j<=n;j++){
                combine.add(j);
                combinations(result,combine,j+1,n,k);
                combine.remove(combine.size()-1);
            }
        }

    }
}
