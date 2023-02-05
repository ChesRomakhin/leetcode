package ru.chesromakhin.leetcode.problems4xx;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem438 {

  public List<Integer> findAnagrams(String s, String p) {
    int pl = p.length();
    int sl = s.length();

    if (pl > sl || sl == 0 || pl == 0) {
      return Collections.emptyList();
    }

    List<Integer> result = new LinkedList<>();

    char[] sa = s.toCharArray();
    char[] pa = p.toCharArray();

    int[] counts = new int[26];
    for (int i = 0; i < pl; i++) {
      counts[pa[i] - 'a']++;
      counts[sa[i] - 'a']--;

    }

    if (checkAnagram(counts)) {
      result.add(0);
    }

    for (int i = 0; i < sl - pl; i++) {
      counts[sa[i] - 'a']++;
      counts[sa[i + pl] - 'a']--;

      if (checkAnagram(counts)) {
        result.add(i + 1);
      }
    }

    return result;
  }

  private boolean checkAnagram(int[] counts) {
    for (int count : counts) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }

}

class NonOptimalSolution {
  public List<Integer> findAnagrams(String s, String p) {
    if (p.length() > s.length() || s.length() == 0 || p.length() == 0) {
      return Collections.emptyList();
    }

    List<Integer> result = new LinkedList<>();

    char[] sa = s.toCharArray();
    char[] pa = p.toCharArray();

    int[] map = new int[26];
    int pl = pa.length;
    for (int i = 0; i < pl; i++) {
      map[pa[i] - 'a']++;
    }

    int i = 0;
    int l = s.length() - pl + 1;

    while (i < l) {
      int si = sa[i] - 'a';
      if (map[si] > 0) {
        int[] m = Arrays.copyOf(map, map.length);
        m[si]--;
        int j = 1;
        while (j < pl) {
          int sij = sa[i + j] - 'a';
          if (m[sij] == 0) {
            if (map[sij] == 0) {
              i += j;
            }
            break;
          }

          m[sij]--;

          j++;
        }

        if (j == pl) {
          result.add(i);
        }
      }

      i++;
    }

    return result;
  }
}
