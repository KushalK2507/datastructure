package recursion;

public class ReverseOfString {
    private String s;
    public ReverseOfString(String s){
        this.s = s;
    }

    public String reverseString(){

        StringBuilder result = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public String reverseStringUsingRecursion(String s){

        if (s.isEmpty()){
            return s;
        }

        return s.charAt(s.length()-1)+reverseStringUsingRecursion(s.substring(0,s.length()-1));
    }

}
