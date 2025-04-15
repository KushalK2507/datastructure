package P_dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> res;

    public Combinations(){
        res = new ArrayList<>();
    }

    public void getCombinations(List<List<Integer>> res,int n, int k,int index, List<Integer> combine){

        if (combine.size() == k){
            res.add(new LinkedList<>(combine));
        }
        else {
            for (int i=index;i<=n;i++){
                combine.add(i);
                getCombinations(res,n,k,i+1,combine);
                combine.remove(combine.size()-1);
            }

        }
    }

}
