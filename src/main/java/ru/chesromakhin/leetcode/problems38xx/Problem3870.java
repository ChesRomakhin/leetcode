package ru.chesromakhin.leetcode.problems38xx;

public class Problem3870 {

  public int countCommas(int n) {
    if (n < 1000) {
      return 0;
    }

    return n - 999;
  }

}
