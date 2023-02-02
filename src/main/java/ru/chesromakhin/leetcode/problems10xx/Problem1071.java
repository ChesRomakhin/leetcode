package ru.chesromakhin.leetcode.problems10xx;

public class Problem1071 {

  public String gcdOfStrings(String str1, String str2) {
    if (str2.length() > str1.length()) {
      String s = str1;
      str1 = str2;
      str2 = s;
    }

    for (int length = str2.length(); length > 0; length--) {
      if (str2.length() % length == 0 && str1.length() % length == 0) {
        if (isDivisor(str1, str2, length)) {
          return str2.substring(0, length);
        }
      }
    }

    return "";
  }

  private boolean isDivisor(String str1, String str2, int length) {
    for (int i = 0; i < str1.length(); i++) {
      int divI = i % length;

      if ((str2.charAt(divI) != str1.charAt(i)) ||
        (str2.length() > i && str2.charAt(divI) != str2.charAt(i))) {
        return false;
      }
    }

    return true;
  }

}
