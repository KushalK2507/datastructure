package C_arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayIsUnique {

    int[] arr;

    public ArrayIsUnique(int[] arr){
        this.arr = arr;
    }

    public boolean isUnique(){
        return Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() == arr.length;
    }
}
