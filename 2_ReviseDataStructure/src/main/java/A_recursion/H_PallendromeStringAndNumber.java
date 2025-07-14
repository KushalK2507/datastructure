package A_recursion;

public class H_PallendromeStringAndNumber {

  int n;

  String s;

  public H_PallendromeStringAndNumber(int n) {
    this.n = n;
  }

  public H_PallendromeStringAndNumber(String s) {
    this.s = s;
  }

    public boolean isPallendromeStringRecursion(String s){

        if (s.isBlank() || s.length()==1){
            return true;
        }

        return s.charAt(0) == s.charAt(s.length()-1) && isPallendromeStringRecursion(s.substring(1,s.length()-1));
    }

    public boolean isPallendromeString(){

        if (s.isBlank()){
            return true;
        }

        return s.contentEquals(new StringBuilder(s).reverse());
    }

    public boolean isNumberPallendrome(){

        int orignaln= n;
        int reverseNumber=0;
        while (n>0){
            reverseNumber =(reverseNumber*10)+(n%10);
            n= n/10;
        }

        return reverseNumber == orignaln;
    }

    public int isNumberPallendromeRecursion(int n, int temp){

        if (n == 0){
            return temp;
        }

        temp = temp * 10 + n%10;

        return isNumberPallendromeRecursion(n/10,temp);
    }


}
