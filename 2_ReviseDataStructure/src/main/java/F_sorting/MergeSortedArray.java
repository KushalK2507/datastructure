package F_sorting;

public class MergeSortedArray {

    int[] arr1;
    int[] arr2;
    public int[] res;


    public MergeSortedArray(int[] arr1, int[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.res = new int[arr1.length+arr2.length];
    }

    public void mergeSortedArray(){

        int i = 0;
        int j = 0;
        for (int k=0;k<res.length;k++){
            if (i < arr1.length-1 && j<arr2.length-1 && arr1[i] <= arr2[j]){
                res[k] = arr1[i];
                i++;
            }
            else if (j<arr2.length-1) {
                res[k] = arr2[j];
                j++;
            }
            else if (i < arr1.length-1) {
                res[k] = arr1[i];
                i++;
            }
        }
    }
}
