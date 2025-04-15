package A_recursion;

import java.util.stream.IntStream;

public class RecursiveRange {

    public int recursiveRangeRecursion(int n){
        if (n==0){
            return 0;
        }
        return n+recursiveRangeRecursion(n-1);
    }

    public int recursiveRange(int n){
        return IntStream.rangeClosed(0,n).reduce(0,Integer::sum);
    }

    public int recursiveRangeFormula(int n){
        return n*((n+1)/2);
    }
}
