package ru.chesromakhin.leetcode.problems5xx;

import java.util.Arrays;

/**
 * Permutation in String
 */
public class Problem567 {

  public boolean checkInclusion(String s1, String s2) {
    if (s2.length() < s1.length()) {
      return false;
    }

    int[] charCounts = countChars(s1);
    int length = s2.length();
    int i = 0;
    while (i < length) {
      if (charCounts[s2.charAt(length - 1) - 'a'] == 0) {
        length--;
      }

      if (charCounts[s2.charAt(i) - 'a'] > 0) {
        int[] copy = Arrays.copyOf(charCounts, charCounts.length);
        int j = 0;
        while (j < s1.length() && i + j < length) {
          int ic = s2.charAt(i + j) - 'a';
          if (copy[ic] == 0) {
            break;
          }

          copy[ic]--;
          j++;
        }

        if (j == s1.length()) {
          return true;
        }
      }

      i++;
    }

    return false;
  }

  private int[] countChars(String s) {
    int[] counts = new int[26];
    for (int i = 0; i < s.length(); i++) {
      counts[s.charAt(i) - 'a']++;
    }

    return counts;
  }

}