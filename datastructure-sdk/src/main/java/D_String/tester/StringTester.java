package D_String.tester;

import D_String.*;

import java.util.Arrays;
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

    firstOccurenceOfNonRepeatedCharacter();
    System.out.println("----------------------------");

    lastOccurenceOfNonRepeatedCharacter();
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
    N_IsomorphicString isomorphicString = new N_IsomorphicString();
    System.out.println("egg, add is Isomorphic String " + isomorphicString.isomorphicString("egg", "add"));
    System.out.println("foo, bar is Isomorphic String " + isomorphicString.isomorphicString("foo", "bar"));
  }

  private static void prefixLongestInStringArray() {
    String[] input = {"flower", "flight", "flow"};
    M_LongestPrefixInString longestPrefixInStringArray = new M_LongestPrefixInString();
    System.out.println("Input Array is "+Arrays.toString(input));
    System.out.println(
        "Longest Prefix = "
            + longestPrefixInStringArray.longestPrefixInString(
               input));
  }

  private static void occurrenceOfEachCharacterInString() {
    J_OccurenceOfEachCharacter occurenceOfEachCharacter = new J_OccurenceOfEachCharacter();
    System.out.println(
        "Occurrence Of Each Character in Hello is "
            + occurenceOfEachCharacter.occurenceOfEachCharacterInString("Hello"));
  }

  private static void nonRepeatableCharacterInString() {
    L_NonRepeatableCharacterInString nonRepeatableCharacterInString =
        new L_NonRepeatableCharacterInString();
    System.out.println(
        "UniqueCharacter in Hello is"
            + nonRepeatableCharacterInString.nonRepeatableCharacterInString("Hello"));
  }

  private static void reverseSentenceAndWordAlso() {
    O_ReverWordAndSentence reverWordAndSentence = new O_ReverWordAndSentence();
    System.out.println(
        "Reverse Word as Well sentence of Good Morning is = "
            + reverWordAndSentence.reverseSentenceAndWord("Good Morning"));
  }

  private static void stringSorting() {
    I_SortingString sorting = new I_SortingString();
    System.out.println("Sorting String of HeLlo is = " + sorting.stringSorting("HeLlo"));
  }

  private static void lastOccurenceOfNonRepeatedCharacter() {
    H_LastOccurenceOfNonRepeating lastOccurenceOfNonRepeating = new H_LastOccurenceOfNonRepeating();
    System.out.println(
        "Last occurence Of Character = "
            + lastOccurenceOfNonRepeating.lastOccurenceOfNonRepeatingCharacter("Hello"));
  }

  private static void firstOccurenceOfNonRepeatedCharacter() {
    G_FirstOccurenceOfNonRepeating firstOccurenceOfNonRepeating =
        new G_FirstOccurenceOfNonRepeating();
    System.out.println(
        "First occurence Of Character = "
            + firstOccurenceOfNonRepeating.firstOccurenceOfNonRepeatingCharacter("Hello"));
  }

  private static void groupAnagram() {
    F_AnagramTest anagram = new F_AnagramTest();
    var input = List.of("eat", "ate", "eta", "listen", "silent", "gram", "arm");
    System.out.println("Input is"+ input);
    System.out.println("Anagram Group are: ");
    anagram.groupAnagram(input).forEach(System.out::println);
  }

  private static void anagramTest() {
    F_AnagramTest anagram = new F_AnagramTest();
    System.out.println("eat, ate is Anagram = " + anagram.isAnagram("eat", "ate"));
    System.out.println("att, ate is Anagram = " + anagram.isAnagram("att", "ate"));
  }

  private static void reverseWordByWord() {
    E_ReverseWordByWord reverseWordByWord = new E_ReverseWordByWord();
    System.out.println(
        "Reverse Word By Word of Good Morning is = " + reverseWordByWord.reverseWordByWord("Good Morning"));
  }

  private static void removeDuplicatesFromString() {
    D_RemoveDuplicates removeDuplicates = new D_RemoveDuplicates();
    System.out.println("Remove Duplicates in \"Good\" res into = " + removeDuplicates.removeDuplicates("Good"));
  }

  private static void removeWhiteSpacesFromString() {
    C_RemoveWhiteSpaces removeWhiteSpaces = new C_RemoveWhiteSpaces();
    System.out.println(
        "Remove White Spaces in \"KU SH A L\" "+removeWhiteSpaces.removeWhiteSpaces("KU SH A L"));
  }

  private static void removeSpecialCharacterFromString() {
    B_RemoveSpecialCharacterFromString removeSpecialCharacterFromString =
        new B_RemoveSpecialCharacterFromString();
    System.out.println(
        "Remove Special Characters in Hello&(%KJ* and res = "
            + removeSpecialCharacterFromString.removeSpecialCharacter("Hello&(%KJ*"));
  }

  private static void reverseString() {
    A_ReverseOfString reverseOfString = new A_ReverseOfString();
    System.out.println(" Hello Reverse String = " + reverseOfString.reverseString("Hello"));
    System.out.println(
        "Hello Reverse String Using Recursion = " + reverseOfString.reverseStringUsingRecusrion("Hello"));
  }
}
