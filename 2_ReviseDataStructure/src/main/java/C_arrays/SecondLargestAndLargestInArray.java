package C_arrays;

public class SecondLargestAndLargestInArray {

    int[] arr;
    public int secondLargest;
    public int largest;

    public SecondLargestAndLargestInArray(int[] arr){
        this.arr = arr;
        secondLargest = Integer.MIN_VALUE;
        largest = Integer.MIN_VALUE;
    }

    public void compute(){

        for (int i=0;i<arr.length;i++){

            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
    }


}
