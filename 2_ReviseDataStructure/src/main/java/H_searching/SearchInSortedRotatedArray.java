package H_searching;

public class SearchInSortedRotatedArray {

    int[] arr;
    int targetElement;

    public SearchInSortedRotatedArray(int[] arr, int targetElement){
        this.arr = arr;
        this.targetElement = targetElement;
    }
//{4,5,6,7,1,2,3}
//{9,8,7,6,5,1,2}
    public int searchInRotatedArray(){

        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (end+start)/2;
            if (targetElement == arr[mid]){
                return mid;
            }
            else if (arr[mid] > arr[start]){
               if (targetElement <= arr[mid] && targetElement>=arr[start]){
                   end = mid-1;
               }
               else {
                   start = mid+1;
               }
            }
            else if (arr[mid] < arr[start]){
                if (targetElement >= arr[mid] && targetElement <= arr[start]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return -1;

    }
}
