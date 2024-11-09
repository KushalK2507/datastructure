package array;

public class MissingNumberInArray {

    public static void main (String[] args){

        // If an array consist of N continuous digit then find missing number in an array.
        // Sum of First N Number = n(n+1)/2
        // Missing Number = Sum of first N Number - Sum of all elements in array
        int[] arr = {1,2,3,4,5,0,7,8,6};
        int lengthofArray = 9;
        int missingNumber= missingNumberInArray(arr, lengthofArray);
        System.out.println(missingNumber);
    }

    public static int missingNumberInArray(int [] arr, int lengthOfArray){
        int sumOfNumberExpected = (lengthOfArray * (lengthOfArray+1))/2;
        int sumOfArray=0;
        for (int i=0;i<arr.length;i++){
            sumOfArray = sumOfArray +arr[i];
        }
        return sumOfNumberExpected - sumOfArray;
    }
}
