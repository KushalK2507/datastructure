package recursion;

public class SumOfDigits {

    int n;

    public SumOfDigits(int n){
        this.n = n;
    }

    public int sumOfDigits(){
        int sum =0;
        while (n > 0){
            sum = sum+ (n%10);
            n = n/10;
        }
        return sum;
    }

    public int sumOfDigitsRecursion(int n){

        if (n ==0){
            return n;
        }

        return n%10 + sumOfDigitsRecursion(n/10);
    }
}
