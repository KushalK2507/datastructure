package E_matrix;

import java.util.Arrays;

public class C_Rotating2dArrayBy90 {

  public static void main(String[] args) {

    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    boolean result = rotateArray90(array);
    if (result) {
      System.out.println(Arrays.deepToString(array));
    } else {
      System.out.println("Rotation Not possible");
        }

    }

    public static boolean rotateArray90(int[][] inputArray){

        if(inputArray.length == 0 || inputArray[0].length != inputArray.length){
            return false;
        }
        int n= inputArray.length;
        for (int layer = 0 ; layer < n/2; layer++){
            int last = n-1-layer;
            for (int i = layer; i<last; i++){
                int offSet = i- layer;
                int top = inputArray[layer][i];
                inputArray[layer][i] = inputArray[last-offSet][layer];
                inputArray[last-offSet][layer] = inputArray[last][last-offSet];
                inputArray[last][last-offSet] = inputArray[i][last];
                inputArray[i][last] = top;
            }

        }



        return true;
    }
}
