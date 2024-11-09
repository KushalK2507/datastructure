package recursion;

public class RecursiveRange {

    public static void main (String[] args){

        // Sum of all numbers from 0 till that number
        int result = recursiveRange(5);
        System.out.println(result);
    }

    public static int recursiveRange(int num){
        if(num <=0){
            return 0;
        }
        return num+recursiveRange(num-1);

    }
}
