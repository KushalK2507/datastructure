package B_math;

public class D_SquareRootOfNumber {

    int num;

    public D_SquareRootOfNumber(int num){
        this.num = num;
    }

    public int squareRootOfNumber(){

        int start=0;
        int end = num;
        int sqrt=0;
        while (start <= end){
            int mid = start+(end-start)/2;

            if (num/mid == mid){
                return mid;
            }
            else if (num/mid < mid){
                end = mid-1;
            }
            else {
                start = mid+1;
                sqrt=mid;
            }
        }

        return sqrt;
    }
}
