package ru.chesromakhin.leetcode.problems39xx;

/**
 * You are given an integer array nums of length n and an integer k.
 * <p>
 * For each index i, define its instability score as max(nums[0..i]) - min(nums[i..n - 1]).
 * <p>
 * In other words:
 * <p>
 * max(nums[0..i]) is the largest value among the elements from index 0 to index i.
 * min(nums[i..n - 1]) is the smallest value among the elements from index i to index n - 1.
 * An index i is called stable if its instability score is less than or equal to k.
 * <p>
 * Return the smallest stable index. If no such index exists, return -1.
 */
public class Problem3904 {

  public int firstStableIndex(int[] nums, int k) {
    int[] mins = new int[nums.length];

    mins[mins.length - 1] = nums[nums.length - 1];
    for (int j = nums.length - 2; j >= 0; j--) {
      mins[j] = Math.min(nums[j], mins[j + 1]);
    }

    int max = nums[0];
    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);

      if (max - mins[i] <= k) {
        return i;
      }
    }

    return -1;
  }

}
