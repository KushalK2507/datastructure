package searching;

public class LinearSearching {

    public static void main(String[] args){
        int[] arr ={};
        int elementToBeSearched = 0;
        boolean result = linearSearch(arr, elementToBeSearched);
        System.out.println("Search Result: "+result);

    }

    public static boolean linearSearch(int[] arr,int elementToBeSearched){

        for(int value : arr){
            if(elementToBeSearched == value){
                return true;
            }
        }
        return false;
    }

}
