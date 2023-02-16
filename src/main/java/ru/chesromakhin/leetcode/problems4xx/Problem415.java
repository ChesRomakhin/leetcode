package ru.chesromakhin.leetcode.problems4xx;

public class Problem415 {

  public String addStrings(String num1, String num2) {
    char[] a1 = num1.toCharArray();
    char[] a2 = num2.toCharArray();

    int i = a1.length - 1;
    int j = a2.length - 1;

    StringBuilder builder = new StringBuilder();

    int acc = 0;
    while (i > -1 || j > -1) {
      if (i > -1) {
        acc += a1[i--] - '0';
      }

      if (j > -1) {
        acc += a2[j--] - '0';
      }

      builder.insert(0, acc % 10);
      acc /= 10;
    }

    if (acc > 0) {
      builder.insert(0, acc);
    }

    return builder.toString();
  }

}
