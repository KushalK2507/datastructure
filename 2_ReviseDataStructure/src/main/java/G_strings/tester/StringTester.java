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

  private static void isIsomprphicString() {

    E_IsomorphicString EIsomorphicString = new E_IsomorphicString();
    System.out.println(
        "Is Isomorphic String " + EIsomorphicString.isIsomorphicString("egg", "add"));
    System.out.println(
        "Is Isomorphic String " + EIsomorphicString.isIsomorphicString("foo", "bar"));
  }

  private static void prefixLongestInStringArray() {
    D_LongestPrefixInStringArray DLongestPrefixInStringArray = new D_LongestPrefixInStringArray();
    System.out.println(
        "Longest Prefix = "
            + DLongestPrefixInStringArray.longestPrefix(new String[] {"flower", "flight", "flow"}));
  }

    private static void groupAnagram(){
    B_Anagram BAnagram = new B_Anagram();
    var input = List.of("eat", "ate", "eta", "listen", "silent", "gram", "arm");
    System.out.println("Anagram Group are: ");
    BAnagram.groupAnagram(input).forEach(System.out::println);
    }

    private static void occurrenceOfEachCharacterInString(){

    A_StringUtils utils = new A_StringUtils();
        System.out.println("Occurrence Of Each Character "+utils.occurenceOfCharacterInString("Hello"));

    }

  private static void nonRepeatableCharacterInString() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println(
        "UniqueCharacter in String " + AStringUtils.nonRepeatingCharacterInString("Hello"));
  }

  private static void reverseSentenceAndWordAlso() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println(
        "Reverse Word asd Well sentence = "
            + AStringUtils.reverseSentenceWordByWord("Good Morning"));
  }

    private static void stringSorting(){

    C_StringSorting sorting = new C_StringSorting();
        System.out.println("Sorting String = "+sorting.sortedString("HeLlo"));

    }

  private static void lastOccurenceOfCharacter() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println(
        "Last occurence Of Character = " + AStringUtils.lastOccurenceOfCharacter("Hello", 'l'));
  }

  private static void firstOccurenceOfCharacter() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println(
        "First occurence Of Character = " + AStringUtils.firstOccurenceOfCharacter("Hello", 'l'));
  }

  private static void anagramTest() {

    B_Anagram BAnagram = new B_Anagram();
    System.out.println("Is Anagram = " + BAnagram.isAnagram("eat", "ate"));
    System.out.println("Is Anagram = " + BAnagram.isAnagram("att", "ate"));
  }

  private static void reverseWordByWord() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println("Reverse Word By Word = " + AStringUtils.reverseWordByWord("Good Morning"));
  }

  private static void removeDuplicatesFromString() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println("Remove Duplicates = " + AStringUtils.removeDuplicates("Good"));
  }

  private static void removeWhiteSpacesFromString() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println("Remove White Spaces = " + AStringUtils.removeWhiteSpaces("KU SH A L"));
  }

  private static void removeSpecialCharacterFromString() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println(
        "Remove Special Characters = " + AStringUtils.removeSpecialCharacters("Hello&(%KJ*"));
  }

  private static void reverseString() {
    A_StringUtils AStringUtils = new A_StringUtils();
    System.out.println("Reverse String = " + AStringUtils.reverseString("Hello"));
    System.out.println(
        "Reverse String Using Recursion = " + AStringUtils.reverseStringUsingRecursion("Hello"));
  }
}
