package dynamic;

public class SquareRootOfNumber {

    public static void main(String[] args) {

        System.out.println(mySqrt(9));
    }

    public static int mySqrt(int x) {

        int start =1;
        int end = x;
        int sqrt =0;

        while(start <= end){

            int mid = start +(end-start)/2;
            if(x/mid == mid){
                return mid;
            }
            else if(x/mid < mid){
                end = mid-1;
            }
            else{
                start = mid+1;
                sqrt = mid;

            }

        }
        return sqrt;

    }


}
