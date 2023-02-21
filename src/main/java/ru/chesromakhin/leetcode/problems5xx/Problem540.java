package ru.chesromakhin.leetcode.problems5xx;

public class Problem540 {

  public int singleNonDuplicate(int[] nums) {
    int n = nums.length;
    if (n == 1) {
      return nums[0];
    }

    if (nums[0] != nums[1]) {
      return nums[0];
    }

    if (nums[n - 1] != nums[n - 2]) {
      return nums[n - 1];
    }

    int start = 0;
    int end = n - 1;
    while (true) {
      int middle = (((end - start) >> 1) + start) & 0b1111_1111_1111_1111_1110;

      int middleValue = nums[middle];
      if (middleValue == nums[middle + 1]) {
        start = middle;
        continue;
      }

      if (middleValue == nums[middle - 1]) {
        end = middle;
        continue;
      }

      return middleValue;
    }
  }

}
