package ru.chesromakhin.leetcode.problems2xx;

public class Problem242 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    char[] sa = s.toCharArray();
    char[] ta = t.toCharArray();

    int[] counts = new int[26];

    for (int i = 0; i < sa.length; i++) {
      counts[sa[i] - 'a']++;
      counts[ta[i] - 'a']--;
    }

    for (int count : counts) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }

}
