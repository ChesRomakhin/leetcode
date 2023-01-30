package ru.chesromakhin.leetcode.problems0xx;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Solution: It is basically just fibonacci number
 * <p>
 * See: {@link ru.chesromakhin.leetcode.problems5xx.Problem509}
 */
public class Problem70 {

  private double phi = 1.618033988749895;
  private double sqrt5 = 2.23606797749979;

  public int climbStairs(int n) {
    n++;
    return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
  }

}
