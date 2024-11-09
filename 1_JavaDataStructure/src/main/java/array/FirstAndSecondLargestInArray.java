package array;

public class FirstAndSecondLargestInArray {

    public static void main (String[] args){

        Integer[] myArray = {1,2,4,3,2,6,7,8,5};
        String result = firstSecond(myArray);
        System.out.println(result);
    }

    public static String firstSecond(Integer[] myArray) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i=0;i<myArray.length;i++){
            if (myArray[i] > second){
                second = myArray[i];
            }
            if (second > first){
                first = first + second;
                second = first - second;
                first = first - second;
            }
        }
        String result = first +" "+ second;
        return result;
    }

}
