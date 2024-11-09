package array;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length-1;
        int maxVol = 0;
        while(l < r){
            int base = r-l;
            int h = Math.min(height[l],height[r]);
            int vol = base * h;
            if(vol > maxVol){
                maxVol = vol;
            }
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxVol;


    }
}
