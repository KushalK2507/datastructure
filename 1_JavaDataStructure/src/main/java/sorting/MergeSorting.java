package sorting;

import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] args){

        int[] arr = {8,9,4,0,3,2,5,1,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr,int left, int right){
        if(left< right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }

    }

    public static void merge(int[] arr, int left,int middle,int right){
        int n1= middle-left+1;
        int n2 = right-middle;
        int[] leftTempArray = new int[n1];
        int[] rightTempArray = new int[n2];

        for(int i=0;i<n1;i++){
            leftTempArray[i] = arr[left+i];
        }
        for (int j=0;j<n2;j++){
            rightTempArray[j] = arr[middle+j+1];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j < n2){
            if(leftTempArray[i] <= rightTempArray[j]){
                arr[k] = leftTempArray[i];
                i++;
            }
            else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        while (i< n1){
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }
        while (j< n2){
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }
}
