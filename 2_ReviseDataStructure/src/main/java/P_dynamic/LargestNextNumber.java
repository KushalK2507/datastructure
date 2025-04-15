package P_dynamic;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LargestNextNumber {

    int[] arr;
    int size;

    public LargestNextNumber(int n){
        this.size = getLength(n);
        populateArray(n, size);
    }
    public LargestNextNumber(int[] n){
     this.arr = n;
     this.size = n.length;
    }
    public int getLength(int n){
        int s =0;
        while (n > 0){
            s++;
            n=n/10;
        }
        return s;
    }

    public void populateArray(int n, int size){
        arr = new int[size];
        while (size > 0){
            arr[--size] = n%10;
            n=n/10;
        }
    }

    public int nextLargestNumber(){

        int i =size-1;
        while (i > 0){
            if (arr[i] > arr[i-1]){
                break;
            }
            i--;
        }
        if (i ==0){
            return -1;
        }
        for (int j=size-1;j>i;j--){
            if (arr[j]> arr[i-1]){
                int temp = arr[j];
                arr[j] = arr[i-1];
                arr[i-1] = temp;
                break;
            }
        }

        int [] res = new int[size];
        for (int k=0;k<i;k++){
            res[k]=arr[k];
        }

        for (int k=i;k<res.length;k++){
            res[k] = arr[--size];
        }

        int result = 0;
        for (int ele : res){
            result = result*10+ele;
        }

        return result;



    }
}
