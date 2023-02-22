package ru.chesromakhin.leetcode.problems10xx;

public class Problem1011 {

  public int shipWithinDays(int[] weights, int days) {
    int n = weights.length;
    if (n == 1) {
      return weights[0];
    }

    int max = weights[0];
    int total = weights[0];

    for (int i = 1; i < n; i++) {
      max = Math.max(max, weights[i]);
      total += weights[i];
    }

    if (days == 1) {
      return total;
    }

    int start = Math.max(total / days, max);
    int end = total;
    while (start < end) {
      int middle = (end + start) >> 1;

      if (validateSolution(weights, days, middle)) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    return start;
  }

  private boolean validateSolution(int[] weights, int days, int weight) {
    int load = 0;
    int d = 1;
    for (int w : weights) {
      load += w;
      if (load > weight) {
        d++;
        load = w;
      }
    }

    return d <= days;
  }

}
