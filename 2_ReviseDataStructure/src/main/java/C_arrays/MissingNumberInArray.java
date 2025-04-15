package C_arrays;

public class MissingNumberInArray {


    public int missingNumberInArray(int[] arr, int len){

        int sum =0;
        for (int ele:arr){
            sum = sum+ele;
        }

        int expectedSum = len * (len+1)/2;

        return expectedSum-sum;

    }

}
