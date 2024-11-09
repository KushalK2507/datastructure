package array;

public class JumpGame {

    public static void main(String[] args) {

    }

//    Input: nums = [2,3,1,1,4]
//    Output: true
//    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

    public boolean canJump(int[] nums) {

        if(nums.length == 1){
            return true;

        }

        int stepLeft = nums[0];
        int index =1;

        while(stepLeft > 0){

            if(index == nums.length-1){
                return true;
            }
            stepLeft = Math.max(stepLeft-1,nums[index]);
            index++;

        }

        return false;


    }

//    Input: nums = [2,3,1,1,4]
//    Output: 2
//    Explanation: The minimum number of jumps to reach the last index is 2.
//    Jump 1 step from index 0 to 1, then 3 steps to the last index.

    public int jump(int[] nums) {

       int totalJump =0;
       int lastJumpIndex =0;
       int coverage=0;
       int destination = nums.length;

       for(int i=0;i<nums.length;i++){

           coverage = Math.max(coverage,i+nums[i]);

           if(i== lastJumpIndex){
               lastJumpIndex = coverage;
               totalJump++;
           }

           if(coverage >= destination){
               return totalJump;
           }


       }
       return totalJump;


    }
}
