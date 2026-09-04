package ru.chesromakhin.leetcode.problems1xx;

public class Problem190 {

  public int reverseBits(int n) {
    int result = 0;

    for (int i = 1; i < 32; i++) {
      result = result | (((n >> i) & 1) << (31 - i));
    }

    return result;
  }

}
