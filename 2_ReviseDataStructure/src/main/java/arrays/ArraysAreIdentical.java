package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAreIdentical {

    int[] arr1;
    int[] arr2;

    public ArraysAreIdentical(int[] arr1,int[] arr2){
        this.arr1 =arr1;
        this.arr2 = arr2;
    }

    public boolean isIdentical(){
        return Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum();
    }

}
