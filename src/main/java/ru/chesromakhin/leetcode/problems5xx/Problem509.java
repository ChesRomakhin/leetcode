package ru.chesromakhin.leetcode.problems5xx;

public class Problem509 {

  private double phi = 1.618033988749895;
  private double sqrt5 = 2.23606797749979;

  public int fibMath(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
  }

  public int fib(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int t1 = 1;
    int t2 = 0;

    for (int i = 2; i <= n; i++) {
      int t = t1 + t2;

      t2 = t1;
      t1 = t;

    }

    return t1;
  }

}
