package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSorting {

    public static void main(String[] args){
        int[] arr = {6,8,3,5,7,9,11,2,1};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(int[] arr){
        int numberOfBucket = (int) Math.round(Math.sqrt(arr.length));
        List<Integer>[] buckets = new ArrayList[numberOfBucket];
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr){
            if(value > maxValue){
                maxValue=value;
            }
        }
        for (int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for (int value: arr){
            int appropriateBucket = (int)Math.ceil(((float)value * numberOfBucket)/maxValue);
            buckets[appropriateBucket-1].add(value);
        }

        System.out.println("Printing Buckets");
        Arrays.stream(buckets).forEach(i -> {
            System.out.print("Printing each Bucket: ");
            i.forEach(element -> System.out.print(element+" "));
            System.out.println();
        });

        for (List<Integer> bucket: buckets){
            Collections.sort(bucket);
        }

        System.out.println("Printing Buckets");
        Arrays.stream(buckets).forEach(i -> {
            System.out.print("Printing each Bucket: ");
            i.forEach(element -> System.out.print(element+" "));
            System.out.println();
        });

        //Merging Bucket
        int index=0;
        for(List<Integer> bucket: buckets){
            for (int value: bucket){
                arr[index] = value;
                index ++;
            }
        }
    }
}
