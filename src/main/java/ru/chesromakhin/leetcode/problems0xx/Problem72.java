package ru.chesromakhin.leetcode.problems0xx;

public class Problem72 {

  public int minDistance(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    if (n == 0 || m == 0) {
      return Math.max(n, m);
    }

    int[][] d = new int[n + 1][m + 1];
    char[] s1 = word1.toCharArray();
    char[] s2 = word2.toCharArray();

    for (int i = 1; i <= n; i++) {
      d[i][0] = i;
    }

    for (int j = 1; j <= m; j++) {
      d[0][j] = j;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        d[i][j] = Math.min(d[i - 1][j] + 1, d[i][j - 1] + 1);
        d[i][j] = Math.min(d[i - 1][j - 1] + (s1[i - 1] != s2[j - 1] ? 1 : 0), d[i][j]);
      }
    }

    return d[n][m];
  }

}
