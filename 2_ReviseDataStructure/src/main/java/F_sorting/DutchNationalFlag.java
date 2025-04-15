package F_sorting;

public class DutchNationalFlag {

    int[] arr;

    public DutchNationalFlag(int[] arr){
        this.arr = arr;
    }

    public void dutchNationalFlag(){


        int i=0; // For 1's
        int j=0; // For 0's
        int k = arr.length-1; // For 2's

        while (i < k){
            if (arr[i] == 0){
                swap(i,j);
                i++;
                j++;
            }
            if (arr[i] == 1){
                i++;
            }
            if (arr[i] == 2){
                swap(i,k);
                k--;
            }
        }
    }

    private void swap(int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
