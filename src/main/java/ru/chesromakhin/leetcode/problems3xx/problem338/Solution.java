package ru.chesromakhin.leetcode.problems3xx.problem338;

public class Solution {

  public int[] countBits(int n) {
    int[] result = new int[n + 1];
    result[0] = 0;

    if (n == 0) {
      return result;
    }

    for (int i = 1; i <= n; i++) {
      result[i] = getBitCount(i);
    }

    return result;
  }

  public int getBitCount(int number) {
    int result = 0;

    do {
      result += number % 2;
      number = number >> 1;
    } while (number != 0);

    return result;
  }

}
