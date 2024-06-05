package ru.chesromakhin.leetcode.problems4xx;

/**
 * 409. Longest Palindrome
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest
 * palindrome
 * that can be built with those letters.
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome.
 */
public class Problem409 {

  public int longestPalindrome(String s) {
    int[] map = new int[52];

    char[] a = s.toCharArray();
    for (char c : a) {
      if (c >= 'a') {
        map[c - 'a']++;
      } else {
        map[c - 'A' + 26]++;
      }
    }

    int mask = Integer.MAX_VALUE - 1;

    int result = 0;
    boolean even = false;
    for (int count : map) {
      if (count % 2 == 1 && !even) {
        result += count;
        even = true;
      } else {
        result += (count & mask);
      }
    }

    return result;
  }

}
