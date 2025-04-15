package P_dynamic;

public class SquareRootOfNumber {

    int num;

    public SquareRootOfNumber(int num){
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
