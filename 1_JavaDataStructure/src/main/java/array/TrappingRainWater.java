package array;

public class TrappingRainWater {

    public static void main(String[] args) {

    }

    public static int trap(int[] height) {

        int left =0;
        int right = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int total = 0;

        while(left < right){

            if(leftMax < rightMax){
                left++;
                if(leftMax < height[left]){
                    leftMax = height[left];
                }
                else {
                    total = total+(leftMax-height[left]);
                }
            }
            else {
             right--;
                if(rightMax < height[right]){
                    rightMax = height[right];
                }
                else {
                    total = total+ (rightMax - height[right]);
                }
            }

        }

        return total;

    }
}
