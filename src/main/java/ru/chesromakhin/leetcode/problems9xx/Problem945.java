package ru.chesromakhin.leetcode.problems9xx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 945. Minimum Increment to Make Array Unique
 * You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
 * Return the minimum number of moves to make every value in nums unique.
 * The test cases are generated so that the answer fits in a 32-bit integer.
 */
public class Problem945 {

  public int minIncrementForUnique(int[] nums) {
    Arrays.sort(nums);
    int steps = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] <= nums[i - 1]) {
        steps += nums[i - 1] - nums[i] + 1;
        nums[i] = nums[i - 1] + 1;
      }
    }

    return steps;
  }

  public int minIncrementForUnique2(int[] nums) {
    Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

    for (int num : nums) {
      frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
    }

    int steps = 0;
    for (int i = 0; i < nums.length; i++) {
      Integer frequency = frequencies.get(nums[i]);
      int num = nums[i];
      if (frequency > 1) {
        while (frequencies.containsKey(num)) {
          num++;
          steps++;
        }

        frequencies.put(nums[i], frequency - 1);
        frequencies.put(num, 1);
      }
    }

    return steps;
  }

}
