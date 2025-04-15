package B_math;

public class PlusOne {

    int[] arr;

    public PlusOne(int[] arr){
        this.arr = arr;
    }

    public int[] plusOne(){

        for (int i=arr.length-1;i>0;i--){
            if (arr[i] == 9){
                arr[i]=0;
            }
            else {
                arr[i]++;
                return arr;
            }
        }
        arr = new int[arr.length+1];
        arr[0] = 1;
        return arr;
    }
}
