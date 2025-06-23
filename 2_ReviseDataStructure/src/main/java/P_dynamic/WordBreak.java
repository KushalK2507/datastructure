package P_dynamic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;  // empty string

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
