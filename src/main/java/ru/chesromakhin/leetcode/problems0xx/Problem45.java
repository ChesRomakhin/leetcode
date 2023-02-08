package ru.chesromakhin.leetcode.problems0xx;

public class Problem45 {

  public int jump(int[] nums) {
    int count = 0;

    int i = nums.length - 1;
    while (i > 0) {
      int minJ = i - 1;
      for (int j = i - 1; j >= 0; j--) {
        if (i <= j + nums[j]) {
          minJ = j;
        }
      }

      count++;
      i = minJ;
    }

    return count;
  }

}
