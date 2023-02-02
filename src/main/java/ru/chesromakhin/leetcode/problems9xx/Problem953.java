package ru.chesromakhin.leetcode.problems9xx;

public class Problem953 {

  private int[] charIndex;

  public boolean isAlienSorted(String[] words, String order) {
    charIndex = new int[order.length()];
    for (int i = 0; i < order.length(); i++) {
      charIndex[order.charAt(i) - 'a'] = i;
    }

    for (int i = 0; i < words.length - 1; i++) {
      if (!checkWordsOrder(words[i], words[i + 1])) {
        return false;
      }
    }

    return true;
  }

  private boolean checkWordsOrder(String w1, String w2) {
    int minLength = Math.min(w1.length(), w2.length());
    for (int i = 0; i < minLength; i++) {
      int c1 = charIndex[w1.charAt(i) - 'a'];
      int c2 = charIndex[w2.charAt(i) - 'a'];
      if (c1 != c2) {
        return c1 < c2;
      }
    }

    return w1.length() <= w2.length();
  }

}
