package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main (String[] args){

        int[] arr = {1,3,4,5,6,8,3,7};
        int target = 9;

        int[] result = sumArray(arr, target);
        System.out.println("Time Complexity O(N2)"+Arrays.toString(result));
        int[] result1 = sumArrayWithOnComplexity( target,arr);
        System.out.println("Time Complexity of O(N)"+Arrays.toString(result1));
    }

    public static int[] sumArray(int[] arr, int target){

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }

    public static int[] sumArrayWithOnComplexity(int sum, int[] input){

        Set<Integer> values = new HashSet<>();
        for (int i=0;i<input.length-1;i++){
            int temp = sum - input[i];
            if(values.contains(temp)){
                return new int[] {temp,input[i]};
            }
            values.add(input[i]);
        }
        return new int[0];
    }
}
