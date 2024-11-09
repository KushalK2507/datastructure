package recursion;

public class Palendrome {

    public static void main (String[] args){

        boolean result = isPalendromeRecursion("abccba");
        System.out.println(result);
        boolean result1 = isPalendrome("sxvdf");
        System.out.println(result1);
    }

    public static boolean isPalendromeRecursion(String str){

        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalendromeRecursion(str.substring(1,str.length()-1));
        }
        return false;
    }

    public static boolean isPalendrome(String str){
        char[] strArray = str.toCharArray();
        int start =0;
        int end = strArray.length -1;
        while(start < end){
            if (strArray[start]!= strArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
