package H_searching;

//A peak element is an element that is strictly greater than its neighbors.
//        Given a 0-indexed integer array nums, find a peak element, and return its index.
//        If the array contains multiple peaks, return the index to any of the peaks.
//
//        You may imagine that nums[-1] = nums[n] = -∞. In other words,
//        an element is always considered to be strictly greater than a neighbor that is outside the array.
//       You must write an algorithm that runs in O(log n) time.
//
//      Input: nums = [1,2,3,1]
//        Output: 2
//        Explanation: 3 is a peak element and your function should return the index number 2.
public class G_PeekElement {
    public int findPeakElement(int[] nums) {
        if(nums.length <=1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        var start=0;
        var end=nums.length-1;
        while(start<=end){
            var mid = (end+start)/2;
            var element = nums[mid];
            if(mid >0 && mid<nums.length-1 && element > nums[mid-1]&& element>nums[mid+1]){
                return mid;
            }else if(mid >0 && nums[mid] < nums[mid-1]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}
