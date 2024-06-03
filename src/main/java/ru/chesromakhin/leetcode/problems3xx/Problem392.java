package ru.chesromakhin.leetcode.problems3xx;

public class Problem392 {

  public boolean isSubsequence(String s, String t) {
    char[] a = t.toCharArray();
    char[] b = s.toCharArray();

    int i = 0;
    int j = 0;

    int l = a.length;
    int k = b.length;

    while (i < l && j < k) {
      if (a[i] == b[j]) {
        j++;
      }

      i++;
    }

    return (k - j) == 0;
  }

}
