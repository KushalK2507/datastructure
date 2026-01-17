package C_array.D_TwoPointers.tester;

import C_array.D_TwoPointers.N_ContainerWithMostWater;

import java.util.Arrays;

public class TwoPointersTester {

    public static void main(String[] args){
        containerWithMostWater();
        System.out.println("--------------------------------");

    }

    private static void containerWithMostWater(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        N_ContainerWithMostWater containerWithMostWater = new N_ContainerWithMostWater();
        System.out.println("Original Array "+ Arrays.toString(arr));
        System.out.println("Max Water area = "+containerWithMostWater.containerWithMostWater(arr));
    }
}
