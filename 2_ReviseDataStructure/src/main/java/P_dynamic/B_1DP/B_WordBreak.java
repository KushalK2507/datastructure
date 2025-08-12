package P_dynamic.B_1DP;

import java.util.*;

public class B_WordBreak {

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

  public static void main(String[] args) {}

  public boolean wordBreak(String s, List<String> wordDict) {

    Set<String> wordSet = new HashSet<>(wordDict);
    boolean[] dp = new boolean[s.length() + 1];
    dp[0] = true; // empty string

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

  public boolean wordBreakUsingMemorization(String s, List<String> wordDict) {
    Set<String> dict = new HashSet<>(wordDict);
    Map<Integer,Boolean> memory = new HashMap<>();
    return canBreak(0,s,dict,memory);
  }

  public boolean canBreak(int start,String s, Set<String> dict,Map<Integer,Boolean> memory){
    if(start == s.length()){
      return true;
    }
    if (memory.containsKey(start)) {
      return memory.get(start);
    }
    for(int i=start+1;i<=s.length();i++){
      String word = s.substring(start,i);
      if(dict.contains(word) && canBreak(i,s,dict,memory)){
        memory.put(i,true);
        return true;
      }
    }

    memory.put(start,false);
    return false;
  }
}
