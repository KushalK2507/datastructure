package org.dynamic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntervalRanges {

//    Input: nums = [0,1,2,4,5,7]
//    Output: ["0->2","4->5","7"]


    public static void main(String[] args) {

        int[] nums = {0,1,2,4,5,7};
        int start =nums[0];
        List<String> res = new LinkedList<>();
        for (int i=0;i<nums.length-1;i++){
            if (nums[i+1] != nums[i]+1){
                res.add(start+" -> "+nums[i]);
                start=nums[i+1];
            }
        }
        if (start == nums[nums.length-1]){
            res.add(start+"");
        }
        else {
            res.add(start+" -> "+nums[nums.length-1]);
        }

        String[] result = res.toArray(new String[res.size()]);

        System.out.println(Arrays.toString(result));
    }




}
