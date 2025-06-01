package D_slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestPallendromicString {

    String s;

    public LongestPallendromicString(String s){
        this.s = s;
    }

// LongestSubstring repeating character
    public String longestString(){
        int start =0;
        int end =0;
        for (int i=0;i<s.length();i++){
            int len1 = expandPallendrome(s,i,i);
            int len2 = expandPallendrome(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if (maxLen > end-start){
                start = i - ((maxLen-1)/2);
                end = i+ (maxLen/2);
            }
        }
        return s.substring(start,end+1);
    }

    private int expandPallendrome(String s, int left, int right){

        if (s == null || left > right){
            return 0;
        }
        while (left>= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
	
	// Longest Substring WITHOUT repeating Character
	public int lengthOfLongestSubstring(String s) {
    Set<Character> seen = new HashSet<>();
    int left = 0, right = 0, maxLen = 0;

    while (right < s.length()) {
        char c = s.charAt(right);

        // If character is not in set, add and move right
        if (!seen.contains(c)) {
            seen.add(c);
            right++;
            maxLen = Math.max(maxLen, right - left);
        } else {
            // If duplicate, remove leftmost character and move left pointer
            seen.remove(s.charAt(left));
            left++;
        }
    }

    return maxLen;
}
}
