package G_strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public boolean isIsomorphicString(String s,String t){

        Map<Character,Character> stoTMap = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }


        for (int i=0;i<s.length();i++){

            if (stoTMap.containsKey(s.charAt(i))&& stoTMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if (!stoTMap.containsKey(s.charAt(i)) && stoTMap.containsValue(t.charAt(i))){
                return false;
            }
            stoTMap.put(s.charAt(i),t.charAt(i));
        }

        return true;



    }
}
