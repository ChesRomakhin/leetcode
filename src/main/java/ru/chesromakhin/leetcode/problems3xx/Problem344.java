package ru.chesromakhin.leetcode.problems3xx;

public class Problem344 {

  public void reverseString(char[] s) {
    int length = s.length;
    int halfLength = length-- / 2;
    for (int i = 0; i < halfLength; i++) {
      s[i] = (char) (s[length - i] ^ s[i]);
      s[length - i] = (char) (s[i] ^ s[length - i]);
      s[i] = (char) (s[i] ^ s[length - i]);
    }
  }

}
