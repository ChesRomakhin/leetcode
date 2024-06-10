package ru.chesromakhin.leetcode.problems9xx;

/**
 * 974. Subarray Sums Divisible by K
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 * A subarray is a contiguous part of an array.
 */
public class Problem974 {

  public int subarraysDivByK(int[] nums, int k) {
    int[] remainderMap = new int[k];
    remainderMap[0] = 1;

    int count = 0;

    int prefixSum = 0;
    for (int num : nums) {
      prefixSum += num;
      int remainder = prefixSum % k;

      if (remainder < 0) {
        remainder += k;
      }

      count += remainderMap[remainder];
      remainderMap[remainder]++;
    }

    return count;
  }

}
