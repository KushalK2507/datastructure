package dynamic;

import java.util.List;

public class WordBreak {

//    Example 1:
//
//    Input: s = "leetcode", wordDict = ["leet","code"]
//    Output: true
//    Explanation: Return true because "leetcode" can be segmented as "leet code".
//    Example 2:
//
//    Input: s = "applepenapple", wordDict = ["apple","pen"]
//    Output: true
//    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//    Note that you are allowed to reuse a dictionary word.
//    Example 3:
//
//    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//    Output: false


    public static void main(String[] args) {

    }

    public boolean wordBreak(String s, List<String> wordDict) {

        int n= s.length();
        boolean[] dp = new boolean[n+1];
        dp[n] = true;
        for(int i=n-1;i>=0;i--){
            for(String word: wordDict){
                if(i+word.length() <= s.length() && word.equals(s.substring(i,i+word.length())) && dp[i+word.length()]){
                    dp[i] = dp[i+word.length()];
                    break;
                }


            }

        }
        return dp[0];
    }
}
