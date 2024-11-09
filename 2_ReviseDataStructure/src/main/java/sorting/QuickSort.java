package sorting;

public class QuickSort {

    int[] arr;

    public QuickSort(int[] arr){
        this.arr =arr;
    }

    public void quickSort(int start, int end){
        if (start < end){
            int pivot = getPartition(start,end);
            quickSort(start,pivot-1);
            quickSort(pivot+1,end);
        }
    }

    public int getPartition(int start, int end){
        int pivot = end;
        int i = start-1;
        for (int j=start;j<=end;j++){
            if (arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}
