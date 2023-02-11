package ru.chesromakhin.leetcode.problems23xx;

import java.util.*;

public class Problem2306 {

  public long distinctNames(String[] ideas) {
    HashSet<String>[] initialGroup = new HashSet[26];
    for (int i = 0; i < 26; ++i) {
      initialGroup[i] = new HashSet<>();
    }

    for (String idea : ideas) {
      initialGroup[idea.charAt(0) - 'a'].add(idea.substring(1));
    }

    long answer = 0;
    for (int i = 0; i < 25; i++) {
      for (int j = i + 1; j < 26; j++) {
        HashSet<String> g1 = initialGroup[i];
        HashSet<String> g2 = initialGroup[j];
        long common = g1.stream()
          .filter(g2::contains)
          .count();

        answer += 2 * (g1.size() - common) * (g2.size() - common);
      }
    }

    return answer;
  }

}
