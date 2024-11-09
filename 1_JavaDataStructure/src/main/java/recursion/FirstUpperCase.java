package recursion;

public class FirstUpperCase {

    public static void main(String[] args){

        String result = firstUpperCase("dfgdFfg");
        System.out.println(result);
    }

    public static String firstUpperCase(String str){
        if(str.length() ==0){
            return "No Upper Case";
        }
        if(str.charAt(0) > 65 && str.charAt(0) < 90){
            return String.valueOf(str.charAt(0));
        }
        return firstUpperCase(str.substring(1,str.length()));
    }
}
