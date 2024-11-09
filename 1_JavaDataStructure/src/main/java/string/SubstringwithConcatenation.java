package string;

import java.util.LinkedList;
import java.util.List;

public class SubstringwithConcatenation {

    public static void main(String[] args) {

        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};

        findSubstring(s,words);

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        List<String> allCombination = new LinkedList<>();

        for(int i=0;i<words.length;i++){

            StringBuilder sb = new StringBuilder();
            for(int j=0;j<words.length;j++){
                if(i != j){
                    sb.append(words[j]);
                }
            }
            allCombination.add(sb.toString());
        }

        allCombination.forEach(System.out::println);

        return List.of(0);
    }
}
