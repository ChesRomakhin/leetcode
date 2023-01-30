package ru.chesromakhin.leetcode.problems11xx;

public class Problem1137 {

  public int tribonacci(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1 || n == 2) {
      return 1;
    }

    int t1 = 1;
    int t2 = 1;
    int t3 = 0;

    for (int i = 3; i <= n; i++) {
      int t = t1 + t2 + t3;

      t3 = t2;
      t2 = t1;
      t1 = t;

    }

    return t1;
  }

}
