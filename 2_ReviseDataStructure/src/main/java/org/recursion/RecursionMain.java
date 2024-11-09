package org.recursion;

public class RecursionMain {

    public static void main(String[] args) {

        RecursionMain recursionMain = new RecursionMain();

        int fibo = 5;
        int sumOfFibonacci =0;
        for(int i=0;i<fibo;i++){
            System.out.print(recursionMain.fibonacci(i));
            sumOfFibonacci = sumOfFibonacci+ recursionMain.fibonacci(i);
        }
        System.out.println();
        System.out.println("Sum of Fibo = "+sumOfFibonacci);

        System.out.println("Fact= "+recursionMain.factorial(fibo));

        System.out.println("Sum of Digits= "+recursionMain.sumOfDigits(1342));
        System.out.println("ReverseString= "+recursionMain.reverseString("Hello"));

        System.out.println("GCD= "+recursionMain.gcd(8,12));
        System.out.println("DecimalToBinary= "+recursionMain.d2B(900));

        System.out.println("First Upper Case= "+recursionMain.firstUpperCaseInString("hellO"));

        System.out.println("HappyNumber: "+recursionMain.isHappyNumber(19));

    }

    public boolean isHappyNumber(int val){

        int sumOfSquare = 0;
        while(val > 0){
            int digit = val%10;
            sumOfSquare= (int)(sumOfSquare+Math.pow(digit,2));
            val=val/10;
        }

       if (sumOfSquare == 1 || sumOfSquare == 7){
           return true;
       }

       if(sumOfSquare < 10 ){
           return false;
       }


        return isHappyNumber(sumOfSquare);
    }

    public int fibonacci(int val){
        if(val == 0){
            return 0;
        }
        if(val <= 1){
            return val;
        }
        return fibonacci(val-1)+fibonacci(val-2);
    }

    public double factorial(int val){
        if(val <= 1){
            return val;
        }
        return val * factorial(val-1);
    }

    public int sumOfDigits(int val){
        if(val <= 0){
            return val;
        }
        return (val%10)+ sumOfDigits(val/10);
    }

    public String reverseString(String val){
        if(val.length() <= 1){
            return val;
        }
        return val.charAt(val.length()-1)+reverseString(val.substring(0,val.length()-1));
    }

    public double gcd(int a, int b){

        if(a <0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public String d2B(int val){

        String result = "";
        if(val <=0){
            return result;
        }
        result = result+val%2;
        return  d2B(val/2)+result;
    }

    public char firstUpperCaseInString(String val){

        if(val.length()==0){
            return Character.MIN_VALUE;
        }

        if(val.charAt(0) >=65 && val.charAt(0)<=90){
            return val.charAt(0);
        }

        return firstUpperCaseInString(val.substring(1));
    }


}
