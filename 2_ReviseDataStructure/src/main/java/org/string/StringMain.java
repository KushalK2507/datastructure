package org.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringMain {

    public static void main(String[] args) {

        System.out.println("ReverseString= " + reverseStringRecusrion("Hello"));
        System.out.println("ReverseString= " + reverseString("Hello"));

        System.out.println("RemoveSpecialCharacter= "+removeSpecialCharacter("He8)*4ll0"));
        System.out.println("RemoveExtraSpaces = "+removeExtraSpaces("Ku sdfk ksdf sd "));
        System.out.println("Remove Duplicates = "+removeDuplicatesUsingJava8("Hello"));
        System.out.println("Remove Duplicates = "+removeDuplicates("Hello"));

        System.out.println("Reverse Word By Word= "+reverseSentenceWordByWord("Good Morning"));

        List<String> strs = List.of("eat","tea","tan","ate","nat","bat");

        System.out.println("Group Anagram = "+groupAnagram(strs));

        String input2 = "abc";
        String input ="bca";
        System.out.println("Anagram Test = "+anagramTest(input,input2));

        System.out.println("Last Occurence Of Non Repeating Character= "+lastOccurenceOfNonRepeatingCharacter("Hello"));
        System.out.println("Last Occurence Of Non Repeating Character= "+firstOccurenceOfNonRepeatingCharacter("Hello"));

        System.out.println("Sorting String= "+sortingString("Hello"));

        System.out.println("Longest Prefix="+longestPrefixInStringArray(new String[]{"flower","flow","flight"}));
        longestSubString("iiiiii");

        String s ="abcabcbb";
        longestSubString(s);

        System.out.println("Ismorphic = "+isIsomorphicString("egg","add"));
        System.out.println("Ismorphic = "+isIsomorphicString("foo","bar"));

    }

    public static boolean isIsomorphicString(String s, String t){

        Map<Character,Character> sToTMap = new LinkedHashMap<>();

        for (int i=0;i<s.length();i++){
            if(sToTMap.containsKey(s.charAt(i)) && sToTMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(!sToTMap.containsKey(s.charAt(i)) && sToTMap.containsValue(t.charAt(i))){
                return false;
            }
            sToTMap.put(s.charAt(i),t.charAt(i));
        }

        return true;

    }

    public static void longestSubString(String s){

        Map<Character,Integer> characterToIndexMap = new LinkedHashMap<>();
        char[] sArray = s.toCharArray();
        int maxLen =0;
        int endIndex =0;
        for (int i=0;i<sArray.length;i++) {

            if(!characterToIndexMap.containsKey(sArray[i])){
                characterToIndexMap.put(sArray[i],i);
            }
            else {
                i=characterToIndexMap.get(sArray[i]);
                characterToIndexMap.clear();
            }
            if(maxLen < characterToIndexMap.size()){
                endIndex=i;
                maxLen = characterToIndexMap.size();
            }
        }

        System.out.println("LongestSubstring = "+s.substring(endIndex-maxLen+1,endIndex+1));
        System.out.println("LongestSubstringLength = "+maxLen);


    }

    public static String longestPrefixInStringArray(String[] input){

        String str = input[0];
        for(int i=1;i<input.length;i++){
            while (!input[i].startsWith(str)) {
                str = str.substring(0, str.length() - 1);
                if (str.isEmpty()) {
                    return "";
                }
            }
        }
        return str;
    }

    public static String sortingString(String s){

        int[] characterOccurenceArray = new int[52];
        for(char c: s.toCharArray()){
            if (c > 64 && c<91){
                characterOccurenceArray[c-64]++;
            }
            else {
                characterOccurenceArray[c-71]++;
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0;i<characterOccurenceArray.length/2;i++){
            if(characterOccurenceArray[i] !=0){
                sb.append(String.valueOf((char) (i + 64)).repeat(Math.max(0, characterOccurenceArray[i])));
            }
            if(characterOccurenceArray[i+26] !=0){
                sb.append(String.valueOf((char) (i + 26 + 71)).repeat(Math.max(0, characterOccurenceArray[i + 26])));
            }
        }

        return sb.toString();
    }

    public static int firstOccurenceOfNonRepeatingCharacter(String s){

        for(char c: s.toCharArray()){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public static int lastOccurenceOfNonRepeatingCharacter(String s){

        for(int i=s.length()-1;i>=0;i--){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return s.indexOf(s.charAt(i));
            }
        }
        return -1;

    }

    public static boolean anagramTest(String s1, String s2){

        Map<Character,Integer> s1Map = new HashMap<>();

        for(char c: s1.toCharArray()){

            if (s1Map.containsKey(c)){
                int count = s1Map.get(c)+1;
                s1Map.put(c,count);
            }
            else {
                s1Map.put(c,1);
            }
        }

        Map<Character,Integer> s2Map = new HashMap<>();

        for(char c: s2.toCharArray()){

            if (s2Map.containsKey(c)){
                int count = s2Map.get(c)+1;
                s2Map.put(c,count);
            }
            else {
                s2Map.put(c,1);
            }
        }

        if(s1Map.size() != s2Map.size()){
            return false;
        }

        for(Map.Entry<Character,Integer> entry : s1Map.entrySet()){

            if(s2Map.getOrDefault(entry.getKey(),0) != ( entry.getValue())){
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> groupAnagram(List<String> elements){

        HashMap<String,List<String>> keyToAnagram = new HashMap<>();
        for (String element : elements){
            char[] charArray = element.toCharArray();
            Arrays.sort(charArray);
            if(keyToAnagram.containsKey(String.valueOf(charArray))){
                List<String> newList = keyToAnagram.get(String.valueOf(charArray));
                newList.add(element);
            }
            else {
                List<String> list = new LinkedList<>();
                list.add(element);
                keyToAnagram.put(String.valueOf(charArray),list);
            }
        }

        return new ArrayList<>(keyToAnagram.values());
    }


    public static String reverseSentenceWordByWord(String s){

        String[] sArray = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i=sArray.length-1;i>=0;i--){
            sb.append(sArray[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static String removeSpecialCharacter(String s){
        return s.replaceAll("[^a-zA-z0-9]","");
    }

    public static String removeExtraSpaces(String s){
        return s.replaceAll("\\s","");
    }

    public static String removeDuplicatesUsingJava8(String s){
        StringBuilder res = new StringBuilder();
         s.chars().distinct().forEach(x -> res.append((char) x));
         return res.toString();
    }

    public static String removeDuplicates(String s){

        Set<Character> elements = new LinkedHashSet<>();
        for(char c: s.toCharArray()){
            elements.add(c);
        }

        return elements.stream().map(String::valueOf).collect(Collectors.joining(",")).replaceAll(",","");
    }

    public static String reverseStringRecusrion(String s) {

        if (!s.isEmpty()) {
            return s.charAt(s.length() - 1) + reverseStringRecusrion(s.substring(0, s.length() - 1));
        }

        return s;

    }

    public static String reverseString(String s) {

        StringBuilder sBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sBuilder.append(s.charAt(i));
        }

        return sBuilder.toString();
    }


}
