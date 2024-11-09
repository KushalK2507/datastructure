package dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombination {

    public static void main(String[] args) {

    }

    public void getCombinationUsingQueue() {

        int num = 123;
        int[] arr =getArray(num);
        String[] phoneMap = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Queue<String> elements = new LinkedList<>();
        elements.add("");
        List<String> res = new ArrayList<>();
        while (!elements.isEmpty()){
            String s = elements.poll();

            if (s.length() == arr.length){
                res.add(s);
            }
            else {
                String phoneVal = phoneMap[arr[s.length()]-2];
                for (int i=0;i<phoneVal.length();i++){
                    elements.add(s+phoneVal.charAt(i));
                }
            }
        }

        res.forEach(ele -> System.out.print(ele+" "));

    }

    private static int[] getArray(int num){

        int len = getLength(num);
        int[] arr = new int[len];
        while (num>0){

            if (num%10 >=2) {
                len--;
                arr[len] = num % 10;
            }
            num=num/10;
        }
        return arr;
    }

    private static int getLength(int num){

        int len =0;
        while (num>0){

            if ((num%10) >= 2){
                len++;
            }
            num=num/10;
        }
        return len;

    }



    public static List<String> combinations(String digits){

        if(digits.isEmpty()){
            return List.of();
        }

        String[] phoneMap = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new LinkedList<>();
        backtrack(result,phoneMap,digits,"",0);

        return result;

    }


    public  static void backtrack(List<String> result, String[] phoneMap,String digits,String combine, int index){
        if(index == digits.length()){
            result.add(combine);
        }
        else {
            String letter = phoneMap[Character.getNumericValue(digits.charAt(index))];

            for(char ch: letter.toCharArray()){
                backtrack(result,phoneMap,digits,combine+ch,index+1);
            }
        }


    }
}
