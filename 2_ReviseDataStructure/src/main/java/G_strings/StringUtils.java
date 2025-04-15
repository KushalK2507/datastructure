package G_strings;

import java.util.*;
import java.util.stream.Collectors;

public class StringUtils {

    public String reverseStringUsingRecursion(String s){

        if (s == null || s.isEmpty()){
            return s;
        }
        return s.substring(s.length()-1) + reverseStringUsingRecursion(s.substring(0,s.length()-1));
    }

    public String reverseString(String s){
        StringBuilder builder = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }


    public String removeSpecialCharacters(String s){
        return s.replaceAll("[^a-zA-z0-9]","");
    }

    public String removeWhiteSpaces(String s){
       return s.replaceAll("\\s","");
    }

    public String removeDuplicates(String s){
        return s.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
    }

    public String reverseWordByWord(String s){
        String[] arr = s.split(" ");
        for (int i=0;i<arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        return String.join(" ", arr);
    }

    public int firstOccurenceOfCharacter(String s, char c){
        return s.indexOf(c);
    }

    public int lastOccurenceOfCharacter(String s, char c){
        return s.lastIndexOf(c);
    }

    public String reverseSentenceWordByWord(String s){
        String[] arr = s.split(" ");
        for (int i=0;i<arr.length/2;i++){
            String temp = reverseString(arr[i]);
            arr[i] = reverseString(arr[arr.length-1-i]);
            arr[arr.length-i-1] = temp;
        }

        return String.join(" ",arr);
    }

    public String nonRepeatingCharacterInString(String s){
        Set<Character> uniqueElements = new LinkedHashSet<>();

        for (char c:s.toCharArray()){
            if (!uniqueElements.add(c)){
                uniqueElements.remove(c);
            }
        }
        return uniqueElements.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public String occurenceOfCharacterInString(String s){
        Map<Character,Integer> characterToCount = new HashMap<>();
        for (char c:s.toCharArray()){
            int count = characterToCount.getOrDefault(c,0)+1;
            characterToCount.put(c,count);
        }

        return characterToCount.entrySet().stream().map(entry -> entry.getKey()+" -> "+entry.getValue()).collect(Collectors.joining(", "));
    }


}
