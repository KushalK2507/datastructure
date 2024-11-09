package recursion;

public class Fibonacci {

    public static void main (String[] args){

        // No of elements till the entered number.
        int sumOfFibonaaci=0;

      for (int i=0;i<10;i++){
          System.out.print(fibonacci(i));
          sumOfFibonaaci = sumOfFibonaaci +fibonacci(i);
      }
        System.out.println();
        System.out.println("Sum of Fibonacci = "+sumOfFibonaaci);
    }

    private static int fibonacci(int i) {

        if(i < 0){
           return -1;
        }
        if(i <= 1){
            return i;
        }
            return fibonacci(i-1)+fibonacci(i-2);
    }
}
