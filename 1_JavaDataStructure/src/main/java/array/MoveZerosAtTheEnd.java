package array;

import java.util.Arrays;

public class MoveZerosAtTheEnd {

    public  static  void main (String[] args) {
        int[] input = {0, 2, 0, 8, 9, 6, 0, 4, 3, 0};
        moveZero(input);
        Arrays.stream(input).forEach(val -> System.out.print(val));
    }

    public static void moveZero(int[] input){

        int j=0;
        for (int i=0;i<input.length;i++){
            if(input[i] !=0 && input[j]==0){
                int temp = input[i];
                input[i] = input[j];
                input[j]=temp;
            }
            if(input[j] != 0){
                j++;
            }
        }

    }
}
