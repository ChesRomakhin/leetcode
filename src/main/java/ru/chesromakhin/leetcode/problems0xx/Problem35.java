package ru.chesromakhin.leetcode.problems0xx;

public class Problem35 {

  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    if (target > nums[nums.length - 1]) {
      return nums.length;
    }

    if (target <= nums[0]) {
      return 0;
    }

    while (true) {
      if (end - start <= 1) {
        return end;
      }

      int middle = (end - start) / 2 + start;
      int num = nums[middle];
      if (num == target) {
        return middle;
      }

      if (num > target) {
        end = middle;
      } else {
        start = middle;
      }
    }
  }

}
