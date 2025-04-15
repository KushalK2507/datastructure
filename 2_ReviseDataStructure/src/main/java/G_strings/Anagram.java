package G_strings;

import java.util.*;

public class Anagram {


    public boolean isAnagram(String s1, String s2){

        Map<Character,Integer> s1Map = new LinkedHashMap<>();
        Map<Character,Integer> s2Map = new LinkedHashMap<>();

        for (char c: s1.toCharArray()){
            if (s1Map.containsKey(c)){
                int count = s1Map.get(c) +1;
                s1Map.put(c,count);
            }
            else {
                s1Map.put(c,1);
            }
        }

        for (char c: s2.toCharArray()){
            if (s2Map.containsKey(c)){
                int count = s2Map.get(c) +1;
                s2Map.put(c,count);
            }
            else {
                s2Map.put(c,1);
            }
        }
        if (s1Map.size() != s2Map.size()){
            return false;
        }
        for (Map.Entry<Character,Integer> key : s1Map.entrySet()){

            if (!(s2Map.containsKey(key.getKey()) && Objects.equals(s2Map.get(key.getKey()), key.getValue()))){
                return false;
            }
        }

        return true;
    }


    public List<List<String>> groupAnagram(List<String> inputList){

        Map<String,List<String>> keyToValue = new HashMap<>();
        for (String input : inputList){
            char[] inputArray = input.toCharArray();
            Arrays.sort(inputArray);
            if (keyToValue.containsKey(String.valueOf(inputArray))){
                var grouped = keyToValue.get(String.valueOf(inputArray));
                grouped.add(input);
                keyToValue.put(String.valueOf(inputArray),grouped);
            }
            else {
                List<String> group = new ArrayList<>();
                group.add(input);
                keyToValue.put(String.valueOf(inputArray),group);
            }
        }

        return new ArrayList<>(keyToValue.values());
    }
}
