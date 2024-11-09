package dynamic;

import java.util.Arrays;

public class LargestNextElement {

    public static void main(String[] args){
 int n = 534976;
        System.out.println("Next Largest Number = "+largestNextNumber(n));
    }

   
    private static int largestNextNumber(int n){

        int len = getLength(n);
        int[] arr = getArray(n);
        System.out.println("Input Array = "+Arrays.toString(arr));
        int i;
        for (i=len-1;i>0;i--){
            if (arr[i] > arr[i-1]){
                break;
            }
        }

 // Find the smallest digit on right side of (i-1)'th 
      // digit that is 
      // greater than number[i-1] 
        if (i!=0) {
            for (int j = len-1; j >=i ; j--) {
                if (arr[j] > arr[i - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[i-1];
                    arr[i-1] = temp;
                    break;
                }
            }
        }

        int[] res = new int[len];
          // copying the first i elements of arr 
    // into res 
        for (int k=0;k<i;k++){
            res[k] = arr[k];
        }

         // copying the rest of the elements 
    // in reverse order 
        for (int k=i;k<res.length;k++){
            res[k] = arr[--len];
        }
        int result =0;
        for (int ele:res){
            result= result*10 + ele;
        }

        return result;

    }

    private static int[] getArray(int n){

        int len = getLength(n);
        int[] arr = new int[len];
        while (n>0){
            len--;
            arr[len] =n%10;
            n=n/10;
        }
        return arr;
    }

    private static int getLength(int n){

        int length=0;
        while (n>0){
            length++;
            n=n/10;
        }
        return length;
    }
}
