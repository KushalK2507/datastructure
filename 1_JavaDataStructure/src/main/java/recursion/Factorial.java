package recursion;

public class Factorial {

    public static void main (String[] args){

        // n!= n* (n-1)!
        int result = factorial(5);
        System.out.println(result);
    }

    private static int factorial(int i) {
        if (i < 0){
            return -1;
        }
        if(i <=1){
            return 1;
        }
        return  i * factorial(i-1);
    }
}
