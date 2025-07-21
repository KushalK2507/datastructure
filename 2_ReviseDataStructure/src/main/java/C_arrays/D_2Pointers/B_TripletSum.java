package C_arrays.D_2Pointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class B_TripletSum{
	
	 public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            var left = i+1;
            var right = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1])continue;
            while(left < right){
                var sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    result.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                while(left < right && nums[left] == nums[left-1])left++;
                while(left < right && nums[right] == nums[right+1])right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }

            }

        }
        return result;
    }
}