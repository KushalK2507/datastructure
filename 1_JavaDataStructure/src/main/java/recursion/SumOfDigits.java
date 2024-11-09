package recursion;

public class SumOfDigits {

    public static void main (String[] args){

        // n%10 + f(n/10)
        int sum=sumOfDigits(3465);
        System.out.println(sum);
    }
    private static int sumOfDigits(int i) {

        if(i<=0){
            return i;
        }
        return i%10+sumOfDigits(i/10);
    }
}
