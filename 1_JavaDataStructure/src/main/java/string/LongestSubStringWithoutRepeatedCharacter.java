package string;

import java.util.*;

public class LongestSubStringWithoutRepeatedCharacter {

    public static void main(String[] args){

        String s ="abcabcbb";
        longestAndLengthOfLongestSubstring(s);

    }

    public static void longestAndLengthOfLongestSubstring(String s){
        String longestSubstring=null;
        int longestSubstringLength=0;
        Map<Character,Integer> characterToIndex = new LinkedHashMap<>();
        char[] sArray = s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            char ch = sArray[i];
            if(!characterToIndex.containsKey(ch)){
                characterToIndex.put(ch,i);
            }
            else {
                i = characterToIndex.get(ch);
                characterToIndex.clear();
            }
            if(characterToIndex.size() > longestSubstringLength){
                longestSubstringLength = characterToIndex.size();
                longestSubstring = characterToIndex.keySet().toString();
            }
        }

        System.out.println("Longest Substring: "+longestSubstring);
        System.out.println("Length of longest substring: "+longestSubstringLength);
    }
}
