package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> anagramGroup = new HashMap<>();

        for(String s: strs){

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if(anagramGroup.containsKey(String.valueOf(ch))){
                List<String> groups = anagramGroup.get(String.valueOf(ch));
                groups.add(s);
                //anagramGroup.put(String.valueOf(ch),groups);
            }
            else{
                List<String> groups = new ArrayList<>();
                groups.add(s);
                anagramGroup.put(String.valueOf(ch),groups);
            }

        }

        List<List<String>> result = new ArrayList<>();
        anagramGroup.forEach((k,v) -> result.add(v));

        return  result;

    }
}
