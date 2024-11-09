package org.array;

import java.util.*;

public class ArrayMain {

    public static void main(String[] args) {

        int[] myArray = {1,2,4,3,2,6,7,8,5};
        int[] result = largestAndSecondLargest(myArray);
        System.out.println(Arrays.toString(result));

        int[] input = {0, 2, 0, 8, 9, 6, 0, 4, 3, 0};
        moveZerosAtEnd(input);
        Arrays.stream(input).forEach(val -> System.out.print(val));


        System.out.println();
        System.out.print("All Pairs Sum");
        int[] arr = {1,3,4,5,6,8,3,7};
        int target = 9;
        findAllPairToTargetSum(arr, target).forEach(System.out::print);

        System.out.println();
        System.out.print("Sum of Triplet");
        findTripletsToTargetSum(new int[]{-1,0,1,2,-1,-4},0).forEach(System.out::print);
        System.out.println();

        System.out.println("PascalTriangle");
        generatePascalTriangle(5).forEach(System.out::println);

        System.out.println("MaxContainerWater= "+maxWaterContainer(new int[]{1,8,6,2,5,4,8,3,7}));

        System.out.println("CanReachEnd= "+canReachEnd(new int[]{2,3,1,1,4}));

        System.out.println("ProductAllExceptItself= "+Arrays.toString(productAllElementExceptItself(new int[]{10,3,5,6,2})));

        System.out.println("BuyAndSellMaxProfit= "+buyAndSellMax(new int[]{7,6,5,4,3,1}));

        System.out.println("TotalProfitBuyAndSell="+totalProfitBuyAndSell(new int[]{7,6,5,4,3,1}));

        System.out.println("MinStepCanJump="+minStepJumpGame(new int[]{2,3,1,1,4}));

        System.out.println("TappingRainWater="+tappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

        int[] array = new int[]{1,2,3,4,5,6,7};
        rotateArray(array,2);
        System.out.println("RotateArray= "+Arrays.toString(array));



    }

    public static void rotateArray(int[] arr, int k){

        if(k <=0){
            return;
        }
        int len = arr.length;
        if(k > len){
            k = k%len;
        }

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,len-1);
        reverseArray(arr,0,len-1);


    }

    public static void reverseArray(int[] arr, int start, int end){


        while(start<end){
            arr[start] = arr[start]+arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start]-arr[end];
            start++;
            end--;
        }
    }

    public static int tappingRainWater(int[] arr){

        int totalVol =0;
        int left =0;
        int right=arr.length-1;
        int leftmax = arr[0];
        int rightMax = arr[arr.length-1];
        while(left<right){

            if(leftmax < rightMax){
                left++;
                if(leftmax < arr[left]){
                    leftmax = arr[left];
                }
                else {
                    totalVol = totalVol+(leftmax-arr[left]);
                }
            }
            else {
                right--;
                if(rightMax < arr[right]){
                    rightMax = arr[right];
                }
                else {
                    totalVol=totalVol+(rightMax-arr[right]);
                }
            }
        }

        return totalVol;
    }

    public static int minStepJumpGame(int[] arr){

        int des = arr.length-1;
        int lastJump = 0;
        int coverage = 0;
        int totalJump=0;

        for(int i=0;i<arr.length;i++){

            coverage = Math.max(coverage,i+arr[i]);

            if(i==lastJump){
                lastJump = coverage;
                totalJump++;
            }

            if(coverage>des){
                return totalJump;
            }

        }
        return totalJump;
    }

    public static int totalProfitBuyAndSell(int[] prices){

        int totalProfit=0;

        for(int i=0;i<prices.length-1;i++){

            if(prices[i]<prices[i+1]){
                totalProfit=totalProfit+(prices[i+1]-prices[i]);
            }

        }

        return totalProfit;
    }

    public static int buyAndSellMax(int[] prices){

        int buy = prices[0];
        int maxProfit =0;
        for(int i=1;i<prices.length;i++){

            if(prices[i] < buy){
                buy = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i]-buy);
        }

        return maxProfit;

    }
    public static int[] productAllElementExceptItself(int[] arr){

        int[] ans= new int[arr.length];
        Arrays.fill(ans,1);
        int curr=1;
        for(int i=0;i<arr.length;i++){
            ans[i] = curr*ans[i];
            curr=curr*arr[i];
        }
        curr=1;
        for(int j=arr.length-1;j>=0;j--){
            ans[j] = curr*ans[j];
            curr=curr*arr[j];
        }
        return ans;
    }

    public static boolean canReachEnd(int[] arr){

        int remainingSteps = arr[0];
        for (int i=1;i<arr.length;i++){

            if(remainingSteps == arr.length-i){
                return true;
            }
            remainingSteps = Math.max(remainingSteps-1,arr[i]);

        }

        return false;
    }



    public static int maxWaterContainer(int[] arr){

        int left =0;
        int right = arr.length-1;
        int maxVol = 0;
        while (left<right){

            int b = right-left;
            int h = Math.min(arr[left],arr[right]);
            int vol = h*b;
            if(maxVol < vol){
                maxVol = vol;
            }

            if(arr[left] < arr[right]){
                left++;
            }
            else {
                right--;
            }

        }

        return maxVol;
    }

    public static List<List<Integer>> generatePascalTriangle(int val){

        List<List<Integer>> res = new LinkedList<>();
        if(val <= 1){
            res.add(List.of(1));
            return res;
        }

        for(int i=0;i<=val;i++){
            List<Integer> row = new LinkedList<>();
            for(int j=0;j<=i;j++){

                if(j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }

            }
            res.add(row);
        }

        return res;
    }

    public static List<List<Integer>> findTripletsToTargetSum(int [] arr, int sum){

        List<List<Integer>> res = new LinkedList<>();
        for (int i=0;i< arr.length-1;i++) {
            List<Integer> elements = new LinkedList<>();
            int temp = sum - arr[i];
            for (int j=i+1;j< arr.length;j++) {
                int temp2 = temp - arr[j];
                if (elements.contains(temp2)) {
                    res.add(List.of(temp2, arr[i], arr[j]));
                }
                elements.add(arr[j]);
            }


        }
        return res;

    }

    public static List<List<Integer>> findAllPairToTargetSum(int[] arr, int sum){

        Set<Integer> elements = new LinkedHashSet<>();
        List<List<Integer>> res = new LinkedList<>();
        for(int i:arr){
            int temp = sum-i;
            if(elements.contains(temp)){
                res.add(List.of(i,temp));
            }
            elements.add(i);
        }
        return res;

    }

    public static void moveZerosAtEnd(int[] arr){

        int zeroIndex =0;

        for(int i=0;i<arr.length;i++){

            if(arr[zeroIndex] !=0){
                zeroIndex++;
            }
            if(arr[zeroIndex] == 0 && arr[i] !=0){
                arr[zeroIndex] = arr[i];
                arr[i] =0;
            }

        }

    }

public static int[] largestAndSecondLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i:arr){

            if(i> secondLargest){
                secondLargest=i;
            }

            if(secondLargest > largest){
                largest = largest+secondLargest;
                secondLargest = largest-secondLargest;
                largest=largest-secondLargest;
            }
        }

        return new int[]{largest,secondLargest};

}
}
