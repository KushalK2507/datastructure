package G_strings.tester;

import G_strings.*;

import java.util.List;

public class StringTester {

    public static void main(String[] args) {

        reverseString();
        System.out.println("----------------------------");

        removeSpecialCharacterFromString();
        System.out.println("----------------------------");

        removeWhiteSpacesFromString();
        System.out.println("----------------------------");

        removeDuplicatesFromString();
        System.out.println("----------------------------");

        reverseWordByWord();
        System.out.println("----------------------------");

        anagramTest();
        System.out.println("----------------------------");

        firstOccurenceOfCharacter();
        System.out.println("----------------------------");

        lastOccurenceOfCharacter();
        System.out.println("----------------------------");

        stringSorting();
        System.out.println("----------------------------");

        reverseSentenceAndWordAlso();
        System.out.println("----------------------------");

        nonRepeatableCharacterInString();
        System.out.println("----------------------------");

        occurrenceOfEachCharacterInString();
        System.out.println("----------------------------");

        groupAnagram();
        System.out.println("----------------------------");

        prefixLongestInStringArray();
        System.out.println("----------------------------");

        isIsomprphicString();
        System.out.println("----------------------------");

    }

    private static void isIsomprphicString(){

        IsomorphicString isomorphicString = new IsomorphicString();
        System.out.println("Is Isomorphic String "+isomorphicString.isIsomorphicString("egg","add"));
        System.out.println("Is Isomorphic String "+isomorphicString.isIsomorphicString("foo","bar"));
    }

    private static void prefixLongestInStringArray(){
        LongestPrefixInStringArray longestPrefixInStringArray =  new LongestPrefixInStringArray();
        System.out.println("Longest Prefix = "+longestPrefixInStringArray.longestPrefix(new String[] {"flower","flight","flow"}));
    }

    private static void groupAnagram(){
        Anagram anagram = new Anagram();
        var input = List.of("eat","ate","eta","listen","silent","gram","arm");
        System.out.println("Anagram Group are: ");
        anagram.groupAnagram(input).forEach(System.out::println);
    }

    private static void occurrenceOfEachCharacterInString(){

        StringUtils utils = new StringUtils();
        System.out.println("Occurrence Of Each Character "+utils.occurenceOfCharacterInString("Hello"));

    }

    private static void nonRepeatableCharacterInString(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("UniqueCharacter in String "+stringUtils.nonRepeatingCharacterInString("Hello"));
    }

    private static void reverseSentenceAndWordAlso(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse Word asd Well sentence = "+stringUtils.reverseSentenceWordByWord("Good Morning"));

    }

    private static void stringSorting(){

        StringSorting sorting = new StringSorting();
        System.out.println("Sorting String = "+sorting.sortedString("HeLlo"));

    }

    private static void lastOccurenceOfCharacter(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Last occurence Of Character = "+stringUtils.lastOccurenceOfCharacter("Hello",'l'));
    }

    private static void firstOccurenceOfCharacter(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("First occurence Of Character = "+stringUtils.firstOccurenceOfCharacter("Hello",'l'));
    }

    private static void anagramTest(){

        Anagram anagram = new Anagram();
        System.out.println("Is Anagram = "+anagram.isAnagram("eat","ate"));
        System.out.println("Is Anagram = "+anagram.isAnagram("att","ate"));
    }

    private static void reverseWordByWord(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse Word By Word = "+stringUtils.reverseWordByWord("Good Morning"));
    }
    private static void removeDuplicatesFromString(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Remove Duplicates = "+stringUtils.removeDuplicates("Good"));
    }

    private static void removeWhiteSpacesFromString(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Remove White Spaces = "+stringUtils.removeWhiteSpaces("KU SH A L"));
    }

    private static void removeSpecialCharacterFromString(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Remove Special Characters = "+stringUtils.removeSpecialCharacters("Hello&(%KJ*"));
    }
    private static void reverseString(){
        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse String = "+stringUtils.reverseString("Hello"));
        System.out.println("Reverse String Using Recursion = "+stringUtils.reverseStringUsingRecursion("Hello"));
    }
}
