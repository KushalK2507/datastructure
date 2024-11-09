package recursion;

public class GCMof2Number {

    public static void main (String[] args){
        int a =8;
        int b=12;
        // gcd = gcd (b,a%b) till we get zero remainder
        int result = gcd(a,b);
        System.out.println(result);
    }

    public static int gcd(int a, int b){

        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd (b,a%b);
    }
}
