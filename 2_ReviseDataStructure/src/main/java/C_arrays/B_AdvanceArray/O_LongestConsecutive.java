package C_arrays.B_AdvanceArray;

import java.util.HashSet;
import java.util.Set;

public class O_LongestConsecutive{
	
	 public int longestConsecutive(int[] nums) {
         if (nums == null || nums.length == 0) return 0;
        Set<Integer> elements = new HashSet<>();
        for(int num : nums){
            elements.add(num);
        }
        var len =0;
        var maxLen =0;
        for(int num : elements){
            if(!elements.contains(num-1)){
                len=1;
                var currNum = num+1;

                while(elements.contains(currNum)){
                    currNum++;
                    len++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}