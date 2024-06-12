package ru.chesromakhin.leetcode.problems0xx;

/**
 * 75. Sort Colors
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 */
public class Problem75 {

  public void sortColors(int[] nums) {
    int zero = 0;
    int two = nums.length - 1;

    int swapAcc = 0;

    int i = 0;
    while (i <= two) {
      if (nums[i] == 0) {
        swapAcc = nums[i];
        nums[i] = nums[zero];
        nums[zero] = swapAcc;

        if (zero == i) {
          i++;
        }

        zero++;
        continue;
      }

      if (nums[i] == 2) {
        swapAcc = nums[i];
        nums[i] = nums[two];
        nums[two] = swapAcc;

        two--;
        continue;
      }

      i++;
    }
  }

}
