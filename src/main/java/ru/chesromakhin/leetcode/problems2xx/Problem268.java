package ru.chesromakhin.leetcode.problems2xx;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
public class Problem268 {

  public int missingNumber(int[] nums) {
    int acc = nums.length;

    for (int i = 0; i < nums.length; i++) {
      acc += i - nums[i];
    }

    return acc;
  }

}
