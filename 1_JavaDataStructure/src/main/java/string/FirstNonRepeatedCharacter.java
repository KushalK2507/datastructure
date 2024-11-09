package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args){

        String s ="AAbbCCsdd";

        System.out.println("First Non Repeating Character");
        Character result = firstNonRepeatingCharacterUsingStringFunction(s);
        System.out.println("O(n) Complexity using Index Of Function: "+result);

        Character result1 = firstNonRepeatingCharacterWithOnComplexityUsingMap(s);
        System.out.println("O(n) Complexity using Map: "+result1);

        Character result2 = firstNonRepeatingCharacterWithOn2Complexity(s);
        System.out.println("O(n2) Complexity: "+result2);
    }

    public static  Character firstNonRepeatingCharacterWithOn2Complexity(String s){

        for(int i=0;i<s.length();i++){
            boolean isUnique = true;
            for (int j=0;j<s.length();j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                return s.charAt(i);
            }
        }
        return null;
    }

    public static Character firstNonRepeatingCharacterWithOnComplexityUsingMap(String s){

        Map<Character,Integer> characterToCount = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            if(characterToCount.containsKey(c)){
                int count = characterToCount.get(c) +1;
                characterToCount.put(c,count);
            }
            else {
                characterToCount.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> characterSet: characterToCount.entrySet()){
            if(characterSet.getValue() == 1){
                return characterSet.getKey();
            }
        }
        return null;
    }

    public static Character firstNonRepeatingCharacterUsingStringFunction(String s){

        for(char c: s.toCharArray()){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return c;
            }
        }
        return null;
    }
}
