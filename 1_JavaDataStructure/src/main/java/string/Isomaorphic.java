package string;

import java.util.HashMap;
import java.util.Map;

public class Isomaorphic {

    public static void main(String[] args) {

    }

    public static boolean isIsomorphic(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> sTotMap = new HashMap<>();
        for(int i=0;i<s.length();i++){

            if(sTotMap.containsKey(s.charAt(i)) && sTotMap.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            if(!sTotMap.containsKey(s.charAt(i)) && sTotMap.containsValue(t.charAt(i))){
                return false;
            }
            sTotMap.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}
