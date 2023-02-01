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
        String div = str2.substring(0, length);

        if (isDivisor(str1, str2, div)) {
          return div;
        }
      }
    }

    return "";
  }

  private boolean isDivisor(String str1, String str2, String div) {
    for (int i = 0; i < str1.length(); i++) {
      int divI = i % div.length();

      if ((div.charAt(divI) != str1.charAt(i)) ||
        (str2.length() > i && div.charAt(divI) != str2.charAt(i))) {
        return false;
      }
    }

    return true;
  }

}
