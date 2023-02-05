package ru.chesromakhin.leetcode.problems4xx;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem438 {

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
