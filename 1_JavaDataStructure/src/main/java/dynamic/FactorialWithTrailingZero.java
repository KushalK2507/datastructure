package dynamic;

public class FactorialWithTrailingZero {

    public static void main(String[] args) {

        System.out.println(factorial(10));
        System.out.println(trailingZero(10));

    }

    public static int factorial(int n){

        if(n <= 1){
            return n;
        }

        return n* factorial(n-1);
    }

    public static int trailingZero(int n){

        int count =0;

        for(int i=5;n/i>=1;i=i*5){
            count = count+(n/i);
        }

        return count;

    }
}
