package C_arrays.C_KadaneAlgo;

public class B_MaxProduct {

//    Input: arr[] = [-2, 6, -3, -10, 0, 2]
//    Output: 180
//    Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

    public int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxProduct = arr[0];
        int maxProductEnd = arr[0];
        int minProductEnd = arr[0];

        for(int i=1;i<n;i++){
            int val = arr[i];
            int temp = maxProductEnd;
            maxProductEnd = Math.max(val,Math.max(val*maxProductEnd,val*minProductEnd));
            minProductEnd = Math.min(val,Math.min(val * temp,val*minProductEnd));

            maxProduct = Math.max(maxProduct,maxProductEnd);
        }

        return maxProduct;
    }
}
