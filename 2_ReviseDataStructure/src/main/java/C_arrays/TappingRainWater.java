package C_arrays;

public class TappingRainWater {

    int[] arr;

    public TappingRainWater(int[] arr){
        this.arr=arr;
    }

    public int maxVol(){
        int maxVol =0;
        int left = arr[0];
        int leftMax = 0;
        int rightMax = arr.length-1;
        int right = arr[arr.length-1];

        while (leftMax < rightMax){

            if (left < right){
                leftMax++;
                if (left < arr[leftMax]){
                    left = arr[leftMax];
                }
                else {
                    maxVol = maxVol + (left - arr[leftMax]);
                }
            }
            else {
                rightMax--;
                if (right < arr[rightMax]){
                    right = arr[rightMax];
                }
                else {
                    maxVol = maxVol + (right-arr[rightMax]);

                }
            }

        }

        return maxVol;
    }
}
