package recursion;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(1111111));

    }

    public static boolean isHappy(int n) {

        if(n == 1){
            return true;
        }

        int sum =0;
        while(n > 0){
            int digit = n%10;
            sum = sum + (digit*digit);
            n=n/10;
        }

        if(sum<=0 || (sum>1 && sum <10 && sum !=7)){
            return false;
        }

        return isHappy(sum);
    }
}
