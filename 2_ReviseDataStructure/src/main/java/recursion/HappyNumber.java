package recursion;

public class HappyNumber {

    public boolean isHappyNumber(int n){

        if (n == 1 || n==7){
            return true;
        }

        if (n<=9){
            return false;
        }

        int sum =0;
        while (n >0){
            sum = sum + (int)Math.pow(n%10,2);
            n = n/10;
        }

        return isHappyNumber(sum);
    }
}
