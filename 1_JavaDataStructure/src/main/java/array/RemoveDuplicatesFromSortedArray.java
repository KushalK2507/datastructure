package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main (String[] args){
        int a[] = {0,1,2,2,3,3,4,4};
        System.out.println(removeDuplicates(a) +" Array = "+ Arrays.toString(a));

        int[] b = {1,1,2};
        System.out.println(removeDuplicates(b) +" Array = "+Arrays.toString(b));
    }

    public static int removeDuplicates(int[] nums) {

        int position = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[position+1] = nums[i+1];
                position++;
            }
        }
        return position+1;
    }
}
