package ru.chesromakhin.leetcode.problems4xx;

import java.util.Deque;
import java.util.LinkedList;

public class Problem456 {

  /**
   * O(N) Solution with monotonic stack
   */
  public boolean find132pattern(int[] nums) {
    int length = nums.length;

    Deque<Integer> stack = new LinkedList<>();
    int k = -1;
    for (int i = length - 1; i >= 0; i--) {
      if (k > -1 && nums[k] > nums[i]) {
        return true;
      }

      while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
        k = stack.pop();
      }

      stack.push(i);
    }

    return false;
  }

  /**
   * O(N^2) solution
   */
  public boolean find132pattern2(int[] nums) {
    int min = nums[0];

    for (int j = 1; j < nums.length - 1; j++) {
      if (nums[j] <= min) {
        min = nums[j];
        continue;
      }

      for (int k = j + 1; k < nums.length; k++) {
        if (min < nums[k] && nums[k] < nums[j]) {
          return true;
        }
      }
    }

    return false;
  }

}
