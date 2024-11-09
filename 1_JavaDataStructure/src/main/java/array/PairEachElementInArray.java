package array;

import java.util.Arrays;

public class PairEachElementInArray {

    public static void main (String[] args){
        int arr[] = {1,2,3,4};
        int[] result = pairElementInArray(arr);
        Arrays.stream(result).forEach(element -> System.out.print(element+", "));
    }

    public static int[] pairElementInArray(int [] elements){

        int[] result = new int[elements.length * elements.length];
        int count=0;
        for (int i=0;i<elements.length;i++){
            for (int j=0;j<elements.length;j++){
                result[count] = Integer.parseInt (String.valueOf(elements[i]) + elements[j]);
                count++;
            }
        }
        return result;

    }
}
