package ru.chesromakhin.leetcode.problems1xx;

public class Problem125 {

  public boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();

    int i = 0;
    int j = chars.length - 1;

    while (i != j) {
      while (i < chars.length && !((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= '0' && chars[i] <= '9'))) {
        i++;
      }

      while (j > -1 && !((chars[j] >= 'a' && chars[j] <= 'z') || (chars[j] >= 'A' && chars[j] <= 'Z') || (chars[j] >= '0' && chars[j] <= '9'))) {
        j--;
      }

      if (i >= j) {
        break;
      }

      char a = chars[i];
      char b = chars[j];

      if (a >= 'a' && a <= 'z') {
        a -= 'a';
      } else if (a >= 'A' && a <= 'Z') {
        a -= 'A';
      } else if ((a >= '0' && a <= '9')) {
        a = (char) (a - '0' + 32);
      }

      if (b >= 'a' && b <= 'z') {
        b -= 'a';
      } else if (b >= 'A' && b <= 'Z') {
        b -= 'A';
      } else if ((b >= '0' && b <= '9')) {
        b = (char) (b - '0' + 32);
      }

      if (a != b) {
        return false;
      }

      i++;
      j--;
    }

    return true;
  }

}
