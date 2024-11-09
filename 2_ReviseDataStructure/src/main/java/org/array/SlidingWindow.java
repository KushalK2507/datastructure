package org.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SlidingWindow {

    public static void main(String[] args) {

        System.out.println("MinSubArray= "+Arrays.toString(minSubArrayForTargetValue(new int[]{2,3,1,2,4,3},7)));

        longestSubString("iiiiii");

    }

    private static int[] minSubArrayForTargetValue(int[] arr, int targetVal){

        int start =0;
        int end =0;
        int minLen =0;
        int sum =0;
        while (end<arr.length){
            sum = sum+arr[end];
            if(sum >= targetVal){
                while (sum >= targetVal){
                    sum=sum-arr[start];
                    start++;
                }
                minLen= Math.min(minLen,end-start+1);
            }
            end++;
        }

        return Arrays.copyOfRange(arr,start-1,start+minLen+1);
    }

    private static void longestSubString(String s){

        Map<Character,Integer> characterIntegerMap = new LinkedHashMap<>();
        int maxLen = Integer.MIN_VALUE;
        for (int i=0;i<s.length();i++){

            if(!characterIntegerMap.containsKey(s.charAt(i))){
                characterIntegerMap.put(s.charAt(i),i);
            }
            else {
                i = characterIntegerMap.get(s.charAt(i));
                characterIntegerMap.clear();
            }

            if(maxLen < characterIntegerMap.size()){
                maxLen = characterIntegerMap.size();
            }
        }
        System.out.println("MaxLen= "+maxLen);
    }

    public static String longestPallendromic(String s){

        int start =0;
        int end =0;
        int maxLen =0;
        for(int i=0;i<s.length();i++){
            int len1 = expandPallendrome(s,i,i);
            int len2 = expandPallendrome(s,i,i+1);
            maxLen = Math.max(len2,len1);
            if(maxLen < end-start){
                start = i - (maxLen-1)/2;
                end = i- maxLen/2;
            }
        }

        return s.substring(start,end);

    }

    private static int expandPallendrome(String s, int start, int end){

        if(s == null || s.length() == 0){
            return 0;
        }
        while (start<end){
            if(start>=0 && end<s.length()&& s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
        }

        return end-start+1;

    }

    public static int[] longestSubArray(int[] arr, int targetVal){

        int start =0;
        int end =0;
        int lastIndex=0;
        int maxLen =0;
        int sum =0;
        while (end < arr.length){
            sum = sum+arr[end];
            if(sum< targetVal){
                end++;
            } else if (sum == targetVal) {
                maxLen = Math.max(maxLen,end-start+1);
                lastIndex=end;
                end++;
            }
            else {
                while (sum > targetVal){
                    sum=sum-arr[start];
                    start++;
                }
                if (sum == targetVal){
                    maxLen = Math.max(maxLen,end-start+1);
                    lastIndex = end;
                }
                end++;

            }

        }

        return Arrays.copyOfRange(arr,lastIndex-maxLen+1,lastIndex+1);

    }



}
