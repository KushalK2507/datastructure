package recursion;

public class ReverseString {

    public static void main (String[] args){

        String result=reverseString("java");
        System.out.println(result);
    }

    public static String reverseString(String str){
        if(str.length()==0){
            return str;
        }
        return str.substring(str.length()-1) + reverseString(str.substring(0,str.length()-1));

    }
}
