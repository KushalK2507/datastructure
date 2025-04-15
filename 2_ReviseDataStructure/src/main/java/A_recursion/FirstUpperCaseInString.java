package A_recursion;

public class FirstUpperCaseInString {

    String s;
    public FirstUpperCaseInString(String s){
        this.s = s;
    }

    public String firStUpperCase(String s){

        if (s.isBlank()){
            return "No Upper Case";
        }

        if (s.charAt(0) >= 65 && s.charAt(0) <=90){
            return String.valueOf(s.charAt(0));
        }

        return firStUpperCase(s.substring(1));

    }
}
