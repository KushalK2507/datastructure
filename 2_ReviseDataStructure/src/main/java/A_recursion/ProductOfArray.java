package A_recursion;

public class ProductOfArray {


    public int productOfArray(int[] n, int len){

        if (len ==0){
            return 1;
        }

        return n[len-1]*productOfArray(n,len-1);
    }

}
