package math;

public class PrimeNumber {

    int number;

    public PrimeNumber(int primeNumber){
        this.number = primeNumber;
    }

    public boolean isPrimeNumber(){

        if (number <= 1)
            return false;

        for (int i=2;i<=number/2;i++){
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
}
