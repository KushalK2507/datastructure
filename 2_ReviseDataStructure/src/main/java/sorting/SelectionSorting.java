package sorting;

public class SelectionSorting {

    int[] arr;

    public SelectionSorting(int[] arr) {
        this.arr = arr;
    }

    public void selectSort(){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
