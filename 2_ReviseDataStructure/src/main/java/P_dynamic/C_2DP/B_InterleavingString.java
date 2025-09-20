package P_dynamic.C_2DP;

// Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
//        Output: true
//        Explanation: One way to obtain s3 is:
//        Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
//        Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
//        Since s3 can be obtained by interleaving s1 and s2, we return true.

public class B_InterleavingString {
  public boolean isInterleave(String s1, String s2, String s3) {
    int m = s1.length(), n = s2.length();
    if (m + n != s3.length()) return false;

    boolean[] dp = new boolean[n + 1];

    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 && j == 0) {
          dp[j] = true;
        } else if (i == 0) {
          dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
        } else if (j == 0) {
          dp[j] = dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
        } else {
          dp[j] =
              (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                  || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
        }
      }
    }

    return dp[n];
  }
}
