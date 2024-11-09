package org.dynamic;

import java.util.*;

public class LetterCombinations {


    public static void main(String[] args) {

        String[] phoneMap = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int num = 123;
        letterCombinationUsingQueue(num,phoneMap);
        letterCombinationBacktrack(num,phoneMap);

    }

    private static void letterCombinationBacktrack(int num,String[] phoneMap){

        List<String> res = new LinkedList<>();


        backtrack(res,getArray(num),"",phoneMap);
        System.out.print("Letter Combination using Backtrack = ");
        res.forEach(ele -> System.out.print(ele+" "));
        System.out.println();
    }

    private static void backtrack(List<String> res , int[] num,String combination,String[] phoneMap){

        if (combination.length() == num.length){
            res.add(combination);
        }
        else {
            String phoneVal = phoneMap[num[combination.length()]-2];
            for (char ch : phoneVal.toCharArray()) {
                backtrack(res, num, combination + ch,phoneMap);
            }
        }

    }


    private static void letterCombinationUsingQueue(int num, String[] phoneMap){
        int[] arr =getArray(num);

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

        System.out.print("Letter Combination using Queue =     ");
        res.forEach(ele -> System.out.print(ele+" "));
        System.out.println();
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





}
