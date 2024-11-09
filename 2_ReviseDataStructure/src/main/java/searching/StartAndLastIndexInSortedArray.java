package searching;

public class StartAndLastIndexInSortedArray {

    int[] arr;
    int targetElement;

    public StartAndLastIndexInSortedArray(int[] arr, int targetElement){
        this.arr = arr;
        this.targetElement = targetElement;
    }

    public String firstAndLastIndex(){
        return firstIndex() + "," + lastIndex();
    }

    public int firstIndex(){
        int index=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if (arr[mid] == targetElement){
                end = mid-1;
                index=mid;
            }
            else if (arr[mid] > targetElement){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return index;
    }

    public int lastIndex(){
        int index=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if (arr[mid] == targetElement){
                start = mid+1;
                index=mid;
            }
            else if (arr[mid] > targetElement){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return index;
    }


}
