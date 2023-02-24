package ru.chesromakhin.leetcode.problems16xx;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem1675 {

  public int minimumDeviation(int[] nums) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    int min = Integer.MAX_VALUE;
    for (int num : nums) {
      if ((num & 1) == 1) {
        num = num << 1;
      }

      queue.offer(num);

      min = Math.min(min, num);
    }

    int result = Integer.MAX_VALUE;
    while (true) {
      int max = queue.poll();

      result = Math.min(result, max - min);
      if ((max & 1) == 1) {
        break;
      }

      max = max >> 1;
      min = Math.min(min, max);

      queue.offer(max);
    }

    return result;
  }

}
