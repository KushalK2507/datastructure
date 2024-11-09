package array;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public static void main (String[] args){

        int[] arr = {1,2,3,4,5,6,7};
        boolean result = isUniqueWithSpaceComplexity1(arr);
        boolean result1= isUniqueWithSpaceComplexityN(arr);
        System.out.println("Result : "+result);
        System.out.println("Result 1 : "+result1);
    }

    public static boolean isUniqueWithSpaceComplexity1(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static  boolean isUniqueWithSpaceComplexityN(int[] arr){

        Set<Integer> arrayValues = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if(!arrayValues.add(arr[i])){
                return false;
            }
        }
        return true;
    }
}
