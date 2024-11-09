package array.matrix;

//In this array is sorted by row and column
public class SearchElementInSortedMatrix {

    public static void main (String[] args){

        int [][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,51}};
        int elementToBeSearched = 25;
        //In this if we find the any element then
        // First check 1st row and last column
        // if element is less then it would be present in upper half of the matrix
        // if element is greater than it would be present in lower half of the matrix
        int i=0;
        int j=arr.length-1;
        while (i <= arr.length-1 && j>=0){
            if (arr[i][j]==elementToBeSearched){
                System.out.print("Element Found: "+ i +" "+j);
            }
            if (elementToBeSearched < arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }

    }
}
