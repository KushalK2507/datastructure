package sorting.interviewQuestions;

import sorting.MergeSorting;

import java.util.Arrays;

public class RearrangeSortedArrayInMinMaxForm {

    public static void main(String[] args){

        //int[] arr ={-4,-1,0,3,9};
        int [] arr ={8,9,4,0,3,2,5,1,7,21};
        System.out.println("Orignal Array= "+Arrays.toString(arr));
        rearrangeSortedArrauInMinMaxForm(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void rearrangeSortedArrauInMinMaxForm(int[] arr){
        MergeSorting.mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        int minIndex= 0;
        int maxIndex = arr.length-1;
        int max = arr[arr.length-1]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2 ==0){
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                maxIndex--;
            }
            else {
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }

        System.out.println("Modified Array: "+Arrays.toString(arr));

        for (int i=0;i<arr.length;i++){
                arr[i] = arr[i]/max;
        }


    }

}
