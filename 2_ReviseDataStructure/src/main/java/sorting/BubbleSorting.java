package sorting;

public class BubbleSorting {

    int[] arr;

    public BubbleSorting(int[] arr){
        this.arr =arr;
    }

    public void bubbleSort(){

        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
