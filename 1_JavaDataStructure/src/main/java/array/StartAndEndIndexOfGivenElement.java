package array;

import java.util.Arrays;

public class StartAndEndIndexOfGivenElement {

    public static void main(String[] args) {

//        Input: nums = [5,7,7,8,8,10], target = 8
  //      Output: [3,4]

        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));

        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},6)));


    }

    public static int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];

        arr[0] = findStartIndex(nums,target);
        arr[1] = findEndIndex(nums,target);

        return arr;
    }

    private static int findStartIndex(int[] nums, int target){

        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                end = mid-1;
                index = mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return index;
    }



    private static int findEndIndex(int[] nums, int target){

        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                start = mid+1;
                index = mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return index;
    }
}
