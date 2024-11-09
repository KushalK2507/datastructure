package basic;

public class SwapWithoutUsingThirdVariable {

    public static void main (String[] args){

        int a=10;
        int b=15;
        System.out.println("Orignal Number: "+a+" "+b);
         a= a+b;
         b=a-b;
         a = a-b;
         System.out.println("Swapped Number: "+a+" "+b);


    }
}
