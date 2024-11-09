package string;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacterInString {

    public static void main(String[] args){

        String s ="hello";
        Map<Character,Integer> characterToCount = new HashMap<>();
        for(char c: s.toCharArray()){
            if(characterToCount.containsKey(c)){
                characterToCount.put(c, 1+characterToCount.get(c));
            }
            else {
                characterToCount.put(c,1);
            }
        }

        characterToCount.forEach((k,v) -> System.out.print(k+" - "+v+","));
    }
}
