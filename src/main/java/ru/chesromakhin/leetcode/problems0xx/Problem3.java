package ru.chesromakhin.leetcode.problems0xx;

import java.util.LinkedList;
import java.util.List;

public class Problem3 {

  public int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    int max = 0;

    List<Character> visitedChars = new LinkedList<>();
    for (char currentChar : chars) {
      int index = visitedChars.indexOf(currentChar);
      if (index != -1) {
        if (visitedChars.size() > max) {
          max = visitedChars.size();
        }

        visitedChars.subList(0, index + 1).clear();
      }

      visitedChars.add(currentChar);
    }

    if (visitedChars.size() > max) {
      max = visitedChars.size();
    }

    return max;
  }

}
