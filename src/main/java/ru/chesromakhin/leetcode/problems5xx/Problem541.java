package ru.chesromakhin.leetcode.problems5xx;

/**
 * 541. Reverse String II
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
 * <p>
 * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
 * <p>
 * Example 1:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Example 2:
 * Input: s = "abcd", k = 2
 * Output: "bacd"
 */
public class Problem541 {

  public String reverseStr(String s, int k) {
    char[] a = s.toCharArray();

    int l = a.length;
    int i = 0;
    int j;

    while (i < l) {
      if (l - i > k) {
        for (j = 0; j < k / 2; j++) {
          a[i + j] = (char) (a[i + j] ^ a[i + k - j - 1]);
          a[i + k - j - 1] = (char) (a[i + j] ^ a[i + k - j - 1]);
          a[i + j] = (char) (a[i + j] ^ a[i + k - j - 1]);
        }
      } else {
        for (j = 0; j < (l - i)  / 2; j++) {
          a[i + j] = (char) (a[l - j - 1] ^ a[i + j]);
          a[l - j - 1] = (char) (a[l - j - 1] ^ a[i + j]);
          a[i + j] = (char) (a[l - j - 1] ^ a[i + j]);
        }
      }

      i += k + k;
    }

    return new String(a);
  }

}
