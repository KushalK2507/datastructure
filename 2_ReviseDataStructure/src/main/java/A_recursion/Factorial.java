package A_recursion;

public class Factorial {

    int n;

    public Factorial(int n){
        this.n = n;
    }

    public int recursionFact(int n){

        if (n == 1){
            return n;
        }

        return n * recursionFact(n-1);
    }

    public int fact(){
        int fact=1;
        while (n > 0){
            fact = fact*n;
            n--;
        }
        return fact;
    }
}
