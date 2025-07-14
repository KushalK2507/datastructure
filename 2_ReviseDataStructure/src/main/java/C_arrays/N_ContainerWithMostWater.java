package C_arrays;

public class N_ContainerWithMostWater {

  public int maxArea;
  int[] heights;

  public N_ContainerWithMostWater(int[] arr) {
    this.heights = arr;
    maxArea = 0;
  }

  public void maxWater() {

        int left = 0;
        int right = heights.length-1;
        while (left < right){
            int length = right-left;
            int maxHeight = Math.min(heights[left],heights[right]);
            int area = length*maxHeight;
            if (area > maxArea){
                maxArea = area;
            }
            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }

    }
}
