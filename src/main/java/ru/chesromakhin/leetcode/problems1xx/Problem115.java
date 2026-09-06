package ru.chesromakhin.leetcode.problems1xx;

/**
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * The test cases are generated so that the answer fits on a 32-bit signed integer.
 */
public class Problem115 {

  public int numDistinct(String s1, String t1) {
    char[] s = s1.toCharArray();
    char[] t = t1.toCharArray();

    int sn = s.length;
    int tn = t.length;

    if (sn < tn) {
      return 0;
    }

    int[][] dp = new int[sn + 1][tn + 1];

    for (int i = 0; i <= sn; i++) {
      dp[i][tn] = 1;
    }

    for (int i = sn - 1; i >= 0; i--) {
      char sChar = s[i];
      for (int j = tn - 1; j >= 0; j--) {
        if (sChar == t[j]) {
          dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
        } else {
          dp[i][j] = dp[i + 1][j];
        }
      }
    }

    return dp[0][0];
  }

}
