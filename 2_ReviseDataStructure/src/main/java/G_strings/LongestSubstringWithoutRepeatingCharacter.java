package G_strings;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {


    public String longestSubstring(String s){
        Set<Character> seen = new HashSet<>();
        int left =0;int right =0;int len = s.length();
        int maxLen = 0;
        int maxLenRight =0;
        while (right < len){
            if (!seen.contains(s.charAt(right))){
                seen.add(s.charAt(right));
                right++;
                if(maxLen < right-left){
                    maxLen = Math.max(maxLen,right-left);
                    maxLenRight=right;
                }

            }else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(maxLenRight-maxLen,maxLenRight);
    }
}
