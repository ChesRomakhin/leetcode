package ru.chesromakhin.leetcode.problems24xx;

/**
 * 2486. Append Characters to String to Make Subsequence
 * You are given two strings s and t consisting of only lowercase English letters.
 * Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 */
public class Problem2486 {

  public int appendCharacters(String s, String t) {
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

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

    return k - j;
  }

}
