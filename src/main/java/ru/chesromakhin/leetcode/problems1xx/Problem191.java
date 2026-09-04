package ru.chesromakhin.leetcode.problems1xx;

/**
 * Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
 */
public class Problem191 {

  public int hammingWeight(int n) {
    int result = 0;

    for (int i = 0; i < 32; i++) {
      result = result + ((n >> i) & 1);
    }

    return result;
  }

}
