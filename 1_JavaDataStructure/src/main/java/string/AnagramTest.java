package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramTest {

    public static void main(String[] args){

        String[] strArr = {"abc","def","cba","rfd"};
        String input ="bca";
        Map<Character,Integer> inputStrCharacterIntegerMap = new HashMap<>();
        List<String> anagram = new ArrayList<>();
        for (char c : input.toCharArray()){
            if(inputStrCharacterIntegerMap.containsKey(c)){
                int count = inputStrCharacterIntegerMap.get(c)+1;
                inputStrCharacterIntegerMap.put(c,count);
            }
            else{
                inputStrCharacterIntegerMap.put(c,1);
            }
        }
        for (String str : strArr){
            Map<Character,Integer> characterIntegerMap = new HashMap<>();
            for (char c: str.toCharArray()){
                if(characterIntegerMap.containsKey(c)){
                    int count = characterIntegerMap.get(c)+1;
                    characterIntegerMap.put(c,count);
                }
                else{
                    characterIntegerMap.put(c,1);
                }
            }
            if(characterIntegerMap.equals(inputStrCharacterIntegerMap)){
                anagram.add(str);
            }
            else {
                boolean isAnagram = true;
                for(Map.Entry<Character,Integer> characterIntegerEntry : characterIntegerMap.entrySet()){
                    if(inputStrCharacterIntegerMap.get(characterIntegerEntry.getKey()) != characterIntegerEntry.getValue()){
                        isAnagram = false;
                        continue;
                    }
                    if(isAnagram){
                        anagram.add(str);
                    }
                }
            }
        }
        anagram.forEach(i -> System.out.print(i+" "));
    }
}
