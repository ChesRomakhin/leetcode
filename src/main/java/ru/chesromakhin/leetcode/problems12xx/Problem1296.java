package ru.chesromakhin.leetcode.problems12xx;

import java.util.Arrays;

/**
 * Same as Problem846
 */
public class Problem1296 {

  public boolean isPossibleDivide(int[] nums, int k) {
    int length = nums.length;

    if (length % k != 0) {
      return false;
    }

    if (k == 1) {
      return true;
    }

    Arrays.sort(nums);

    for (int i = 0; i < length; i++) {
      int card = nums[i];

      if (card == -1) {
        continue;
      }

      nums[i] = -1;
      int start = i + 1;
      for (int j = 1; j < k; j++) {
        boolean found = false;

        int nextCard = card + 1;
        for (int l = start; l < length; l++) {
          if (nums[l] == -1) {
            continue;
          }

          if (nextCard < nums[l]) {
            return false;
          }

          if (nextCard == nums[l]) {
            found = true;
            nums[l] = -1;
            start = l + 1;
            break;
          }
        }

        if (!found) {
          return false;
        }

        card = nextCard;
      }
    }

    return true;
  }

}
