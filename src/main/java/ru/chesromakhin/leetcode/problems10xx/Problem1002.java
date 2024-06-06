package ru.chesromakhin.leetcode.problems10xx;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 */
public class Problem1002 {

  public List<String> commonChars(String[] words) {
    int length = words.length;
    int[][] map = new int[length][26];

    for (int i = 0; i < length; i++) {
      String word = words[i];
      char[] letters = word.toCharArray();
      for (char letter : letters) {
        map[i][letter - 'a']++;
      }
    }

    List<String> result = new ArrayList<>();
    for (int j = 0; j < 26; j++) {
      int min = map[0][j];
      for (int i = 1; i < length; i++) {
        if (min > map[i][j]) {
          min = map[i][j];
        }
      }

      for (int k = 0; k < min; k++) {
        result.add(Character.toString((char)('a' + j)));
      }
    }

    return result;
  }

}
