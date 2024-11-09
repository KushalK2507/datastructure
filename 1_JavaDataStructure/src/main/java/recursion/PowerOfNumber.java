package recursion;

public class PowerOfNumber {

    public static void main (String[] args){

        int val=2;
        int power = 4;
        //x = x*x^power-1
        int powerOfNumber= power(val,power);
        System.out.println(powerOfNumber);
    }
    private static int power(int val, int power) {
        if(power <= 0){
            return 1;
        }
        return val*power(val,power-1);
    }
}
