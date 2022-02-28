package ru.chesromakhin.problem228;

import java.util.LinkedList;
import java.util.List;

class Solution {

  public List<String> summaryRanges(int[] nums) {
    var result = new LinkedList<String>();

    if (nums.length == 0) {
      return result;
    }

    int[] range = new int[2];
    range[0] = nums[0];
    range[1] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - 1 != range[1]) {
        if (range[0] == range[1]) {
          result.add(String.valueOf(range[0]));
        } else {
          result.add(range[0] + "->" + range[1]);
        }

        range[0] = nums[i];
      }

      range[1] = nums[i];
    }

    if (range[0] == range[1]) {
      result.add(String.valueOf(range[0]));
    } else {
      result.add(range[0] + "->" + range[1]);
    }

    return result;
  }

}
