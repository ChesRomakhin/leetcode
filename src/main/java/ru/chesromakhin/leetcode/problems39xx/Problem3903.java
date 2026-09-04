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
public class Problem3903 {

  public int firstStableIndex(int[] nums, int k) {
    int[] mins = new int[nums.length];
    int[] maxs = new int[nums.length];

    mins[mins.length - 1] = nums[nums.length - 1];
    maxs[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      maxs[i] = Math.max(nums[i], maxs[i - 1]);

      int j = nums.length - 1 - i;
      int pj = nums.length - 1 - i + 1;
      mins[j] = Math.min(nums[j], mins[pj]);
    }

    for (int i = 0; i < nums.length; i++) {
      if (maxs[i] - mins[i] <= k) {
        return i;
      }
    }

    return -1;
  }

}
