package ru.chesromakhin.leetcode.problems31xx;

public class Problem3110 {

  public int scoreOfString(String s) {
    int result = 0;
    if (s == null || s.isEmpty()) {
      return result;
    }

    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length - 1; i++) {
      int sub = charArray[i] - charArray[i + 1];
      if (sub > 0) {
        result += sub;
      } else {
        result -= sub;
      }
    }

    return result;
  }

}
