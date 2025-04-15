package A_recursion;

public class Fibanacii {
    int n;
    int first;
    int second;

    public Fibanacii(int n){
        this.n = n;
        first = 0;
        second = 1;
    }
    public void fibonacciSeries(){

        if (n < 1){
            System.out.print(0);
            return;
        }
        if (n == 1){
            System.out.print(0);
            System.out.print(1);
            return;
        }
        System.out.print(first+" ");

        while (n > 1){
            System.out.print(second+" ");
            var temp = second;
            second = first+second;
            first = temp;
            n--;
        }

    }

    public int fibonacciSeriesRecursion(int n){

        if (n <= 1){
            return n;
        }

        return fibonacciSeriesRecursion(n-1)+fibonacciSeriesRecursion(n-2);
    }

    public int sumOfFibonacciSeries(){

        int sum =0;
        for (int i=0;i<n;i++){
            sum = sum + fibonacciSeriesRecursion(i);
        }

        return sum;

    }
}
