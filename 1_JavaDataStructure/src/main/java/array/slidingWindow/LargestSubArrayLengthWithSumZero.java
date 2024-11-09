package array.slidingWindow;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class LargestSubArrayLengthWithSumZero {

    public static void main(String[] args){
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int sum =0;
        Map<Integer,Integer> sumToValues= new TreeMap<>();
        int last_index=0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum ==0){
                last_index = i+1;
            }
            Integer prevIndex = sumToValues.get(sum);
            if(prevIndex != null){
                last_index = Math.max(last_index,i-prevIndex);
            }
            else{
                sumToValues.put(sum,i);
            }

        }

        System.out.print(Arrays.toString(Arrays.copyOfRange(arr,1,last_index+1)));
        }

}
