package ru.chesromakhin.leetcode.problems0xx;

public class Problem66 {

  public int[] plusOne(int[] digits) {
    digits[digits.length - 1]++;
    for (int i = digits.length - 2; i >= 0; i--) {
      digits[i] += digits[i + 1] / 10;
      digits[i + 1] %= 10;
    }

    if (digits[0] > 9) {
      int[] a = new int[digits.length + 1];
      System.arraycopy(digits, 0, a, 1, digits.length);

      digits = a;
      digits[0] = digits[1] / 10;
      digits[1] %= 10;
    }

    return digits;
  }

}
