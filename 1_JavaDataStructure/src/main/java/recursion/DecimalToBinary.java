package recursion;

public class DecimalToBinary {
    public static void main (String[] args){
        int result = d2b(8);
        System.out.println(result);
    // For number not whose result not accomadate in int
        String result1 = deci_to_bin(8);
        System.out.println(result1);

        

    }

    public static int d2b(int a){

        if(a==0){
            return a;
        }
        return a%2+10*d2b(a/2);
    }


    static String deci_to_bin(int x) {

        String bin_num = "";
        // Base Case
        if (x <= 1) {
            bin_num += (char) (x + '0');
            return bin_num;
        } else {

            // Recursion call
            bin_num = bin_num + deci_to_bin((int) (x / 2));

            // If x is divisible by 2
            if (x % 2 != 0) {
                bin_num += '1';
            }
            // otherwise
            else {
                bin_num += '0';
            }

        }
        return bin_num;
    }
}
