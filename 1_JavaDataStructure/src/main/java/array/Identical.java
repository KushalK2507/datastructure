package array;

public class Identical {

    public static void main (String[] args){

        int[] arr1={1,2,3,4,5,5};
        int[] arr2={3,4,5,6,1,2};
        boolean result=areIdentical(arr1,arr2);
        System.out.println(result);
    }

    public static boolean areIdentical(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        int sum1=0;
        int sum2=0;
        for (int i=0;i<arr1.length;i++){
            sum1= sum1+arr1[i];
            sum2 = sum2 + arr2[i];
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}
