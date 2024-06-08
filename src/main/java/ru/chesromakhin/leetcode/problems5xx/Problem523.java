package ru.chesromakhin.leetcode.problems5xx;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 * Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
 * A good subarray is a subarray where:
 * its length is at least two, and
 * the sum of the elements of the subarray is a multiple of k.
 * Note that:
 * A subarray is a contiguous part of the array.
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 */
public class Problem523 {

  public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> remainderMap = new HashMap<>();

    remainderMap.put(0, -1);

    int prefixSum = 0;
    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];
      int remainder = prefixSum % k;

      if (remainderMap.containsKey(remainder)) {
        if (i - remainderMap.get(remainder) > 1) {
          return true;
        }
      } else {
        remainderMap.put(remainder, i);
      }
    }

    return false;
  }

}
