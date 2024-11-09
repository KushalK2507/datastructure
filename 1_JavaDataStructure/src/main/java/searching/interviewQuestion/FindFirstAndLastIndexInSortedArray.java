package searching.interviewQuestion;

public class FindFirstAndLastIndexInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];

        arr[0] = findStartIndex(nums,target);
        arr[1] = findEndIndex(nums,target);

        return arr;
    }

    private int findStartIndex(int[] nums,int target){

        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid]== target){
                end = mid-1;
                index = mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return index;
    }

    private int findEndIndex(int[] nums, int target){

        int index=-1;
        int start =0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                start = mid+1;
                index = mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return index;
    }
}
