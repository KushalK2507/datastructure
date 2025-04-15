package F_sorting;

public class InsertionSorting {

    int[] arr;

    public InsertionSorting(int[] arr){
        this.arr =arr;
    }

    public void insertionSort(){
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
