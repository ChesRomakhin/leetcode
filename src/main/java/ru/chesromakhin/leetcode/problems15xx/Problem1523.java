package ru.chesromakhin.leetcode.problems15xx;

public class Problem1523 {

  public int countOdds(int low, int high) {
    if (low == high) {
      return low % 2;
    }

    if (low % 2 == 1) {
      low--;
    }

    if (high % 2 == 1) {
      high++;
    }

    return (high - low) / 2;
  }

}
