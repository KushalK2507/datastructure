package recursion;

public class ProductOfAnArray {

    public static void main (String[] args){

        int a[] = {1,2,3,4,1};
        int result = productOfArray(a,a.length);
        System.out.println(result);
    }

    public static int productOfArray(int[] a, int len){
        if(len ==0){
            return 1;
        }
        return a[len-1]*productOfArray(a,len-1);
    }
}
