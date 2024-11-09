package sorting;

public class MergeSort {

    int[] arr;

    public MergeSort(int[] arr){
        this.arr =arr;
    }

    public void mergeSort(int start,int end){
        if (start < end){
            int mid = (end+start)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            merge(start,mid,end);
        }
    }

    public void merge(int start, int middle, int end){
        int n1 = middle-start+1;
        int n2 = end - middle;
        int[] leftTempArray = new int[n1];
        int[] rightTempArray = new int[n2];

        for (int i=0;i<n1;i++){
            leftTempArray[i] = arr[start+i];
        }
        for (int j=0;j<n2;j++){
            rightTempArray[j] = arr[middle+j+1];
        }
        int i=0,j=0,k=start;
        while (i<n1 && j<n2){
            if (leftTempArray[i] <= rightTempArray[j]){
                arr[k] = leftTempArray[i];
                i++;
            }
            else{
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }
}
